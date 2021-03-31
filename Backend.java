import java.sql.*;

public class Backend{

	private Connection databaseConnection;
	private String username = new String("akomp033");
	private String password = new String("Kmpzkmpzkmpz1");

	public Backend() throws SQLException {
	
		try {	
			Class.forName("org.postgresql.Driver");
			databaseConnection = DriverManager.getConnection("jdbc:postgresql://web0.eecs.uottawa.ca:15432/group_a03_g22", "akomp033", "Kmpzkmpzkmpz1");
		}
		catch(Exception e){
			System.out.println("lol");
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

}
