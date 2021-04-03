import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.regex.*;
import java.util.Date;
import java.util.Calendar;
import java.time.Instant;
import java.text.SimpleDateFormat;

public class Backend{

	private Connection databaseConnection;
	private String username = new String("akomp033");
	private String password = new String("Kmpzkmpzkmpz1");

	public Backend() throws SQLException {
	
		try {	
			Class.forName("org.postgresql.Driver");
			databaseConnection = DriverManager.getConnection("jdbc:postgresql://web0.eecs.uottawa.ca:15432/group_a03_g22", username, password);
		}
		catch(Exception e){
			System.out.println("Failed to connect to db!");
		}
	}

	public boolean runAdminQuery(String inputQuery) throws SQLException{
		try {
			Statement statement = databaseConnection.createStatement();
			statement.executeQuery(inputQuery.toString());
			return true;

		}
		catch(Exception e){
			return false;
		}	
	}
	
	public int findCusRooms(DefaultTableModel tableModel, String startDate, String endDate, String roomType, String roomLocation) throws SQLException {
		try {

			//check date validity and format
			if(startDate == null || endDate == null || startDate.length() == 0 || endDate.length() == 0){
				return 2;
			}
			else{
				Pattern PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
				if(!PATTERN.matcher(startDate).matches() || !PATTERN.matcher(endDate).matches()){
					return 3;
				}
				else{
					Date sDate = new Date(startDate.split("-")[2] + "/" +
										  startDate.split("-")[1] + "/" +
										  startDate.split("-")[0]);
					Date eDate = new Date(endDate.split("-")[2] + "/" +
										  endDate.split("-")[1] + "/" +
										  endDate.split("-")[0]);

					if(sDate.after(eDate)){
						return 4;
					}
					else{
						if(sDate.before(Calendar.getInstance().getTime())){
							return 6;
						}
					}					
				}
			}

			String baseQuery = new String("SELECT * FROM \"Course Project\".\"Room\" ");
			String dateConditionQuery = new String("WHERE room_number NOT IN(SELECT room_number FROM \"Course Project\".\"Reservation\" WHERE ('" + startDate + "' BETWEEN start_date AND end_date) OR ('"+endDate+"' BETWEEN start_date AND end_date) OR ((start_date BETWEEN '"+startDate+"' AND '"+endDate+"') AND (end_date BETWEEN '"+startDate+"' AND '"+endDate+"'))) ");
			String roomTypeConditionQuery = new String("AND room_type='$ROOMTYPE$' ");
			String locationConditionQuery = new String("AND location='$LOCATION$' ");
			Statement statement = databaseConnection.createStatement();
			

			// clear table
			tableModel.setRowCount(0);
			
			// conditions and query generation
			
			if(roomType == "Any"){
				roomTypeConditionQuery = "";
			}
			else{
				roomTypeConditionQuery = "AND room_type='" + roomType + "' ";
			}

			if(roomLocation == "Any"){
				locationConditionQuery = "";
			}
			else{
				locationConditionQuery = "AND location='" + roomLocation + "' ";
			}
 

			ResultSet resultSet = statement.executeQuery(baseQuery + dateConditionQuery + roomTypeConditionQuery + locationConditionQuery + ";");

			System.out.println(baseQuery + dateConditionQuery + roomTypeConditionQuery + locationConditionQuery + ";");
			
			// populate table
			while(resultSet.next()){
				tableModel.addRow(new String[] {resultSet.getString(1),
												resultSet.getString(2),
												resultSet.getString(3),
												resultSet.getString(4)});
			}
			resultSet.close();	
			statement.close();

			if (tableModel.getRowCount() == 0){
				return 5;
			}
			else{
				return 0;
			}
		}
		catch(Exception e){
			System.out.println(e);
			return 1;
		}
	}




	public int bookCus(String id, String occupants, String startDate, String endDate, String roomNumber) throws SQLException{
		
		try{
			
			Statement statement = databaseConnection.createStatement();

			//check date validity and format
			if(startDate == null || endDate == null || startDate.length() == 0 || endDate.length() == 0){
				return 2;
			}
			else{
				Pattern PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
				if(!PATTERN.matcher(startDate).matches() || !PATTERN.matcher(endDate).matches()){
					return 3;
				}
				else{
					Date sDate = new Date(startDate.split("-")[2] + "/" +
										  startDate.split("-")[1] + "/" +
										  startDate.split("-")[0]);
					Date eDate = new Date(endDate.split("-")[2] + "/" +
										  endDate.split("-")[1] + "/" +
										  endDate.split("-")[0]);

					if(sDate.after(eDate)){
						return 4;
					}
					else{
						if(sDate.before(Calendar.getInstance().getTime())){
							return 5;
						}
					}					
				}
			}

			// checking occupant validity
			if(Integer.valueOf(occupants) < 1){
				return 6;
			}

			// checking room number validity
			if(roomNumber.length() == 0 || roomNumber == null){
				return 8;
			}
			else{

				ResultSet resultSet1 = statement.executeQuery("SELECT room_number FROM \"Course Project\".\"Room\" WHERE room_number="+roomNumber+";");
				if(!resultSet1.next()){
					return 9;
				}
			}


			// checking for reservation overlaps



			ResultSet resultSet2 = statement.executeQuery("SELECT room_number FROM \"Course Project\".\"Reservation\" WHERE (('"+startDate+"' BETWEEN start_date AND end_date) OR ('"+endDate+"' BETWEEN start_date AND end_date) OR ((start_date BETWEEN '"+startDate+"' AND '"+endDate+"') AND (end_date BETWEEN '"+startDate+"' AND '"+endDate+"'))) AND room_number="+roomNumber+";");

			if(resultSet2.next()){
				return 7;
			}



			// final query


			String bookingId = String.valueOf(Instant.now().getEpochSecond());

			ResultSet resultSet3 = statement.executeQuery("SELECT room_type FROM \"Course Project\".\"Room\" WHERE room_number="+roomNumber+";");
			resultSet3.next();
			String roomType = new String(resultSet3.getString(1));
			
			
			try{
				statement.executeQuery("INSERT INTO \"Course Project\".\"Reservation\" (\"BOOKING_ID\", start_date, end_date, occupants, room_type, room_number, \"cust_ID\") VALUES ('"+bookingId+"','"+startDate+"','"+endDate+"',"+occupants+",'"+roomType+"',"+roomNumber+",'"+id+"');"); 
			}
			catch(Exception e){
				return 0;
			}
			return 0;

			
		}
		catch(Exception e){
			System.out.println(e);
			return 1;
		}

	}

}
