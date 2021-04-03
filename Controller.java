import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Controller implements ActionListener {
	
	private Backend backend;
	private GUI gui;
	private JPanel[] panels;

	public Controller() throws SQLException{
		backend = new Backend();
		gui = new GUI(this);
		panels = gui.getPanels();
	}

	public void actionPerformed(ActionEvent e) {
	
		switch(((JComponent) e.getSource()).getName().toString()){
			case "Employee Portal":{
				gui.switchToPanel(panels[1]);
				break;
			}
			case "Admin Portal":{
				gui.switchToPanel(panels[2]);
				break;
			}
			case "Customer Portal":{
				gui.switchToPanel(panels[3]);
				break;
			}
			case "Logout":{
				gui.switchToPanel(panels[0]);
				break;
			}


			case "Submit Query":{
				String query = new String(gui.getAdminQuery());
				try{
					boolean successful = backend.runAdminQuery(query);
					if(successful) {
						gui.popupDialog("Query was successfully run on the Database!", "Message");
					}
					else{
						gui.popupDialog("Query failed to run on the Database...", "Error");						
					}
				}
				catch(Exception exc) {
					break;
				}

				break;
			}



			case "cusSearch":{
				
				try{

					DefaultTableModel model = gui.getCusTableModel();
					String[] filters = gui.getCusSearchFilters();
					int result = backend.findCusRooms(model, filters[0], filters[1], filters[2], filters[3]);
					switch (result){
						
						case 0:{   
							gui.popupDialog("Search Complete!", "Message");
							break;
						}
						case 1:{
							gui.popupDialog("Database Error.", "Error");
							break;
						}
						case 2:{
							gui.popupDialog("Start and/or End date are missing.", "Error");
							break;
						}
						case 3:{
							gui.popupDialog("Start and/or End date are written in an invalid format.", "Error");
							break;
						}
						case 4:{
							gui.popupDialog("Start Date cannot be after End Date.", "Error");
							break;
						}
						case 5:{
							gui.popupDialog("No Rooms matching your criteria were found.", "Error");
							break;
						}
						case 6:{
							gui.popupDialog("Start Date must be later than today.", "Error");
							break;
						}
					}
					break;
				}
				catch(Exception exc){
					break;
				}
			}


			case "cusBook":{
				try{
				
					String[] info = gui.getCusBookFilters();
					int result = backend.bookCus(info[0], info[1], info[2], info[3], info[4]);
					switch(result) {
						case 0:{	
							gui.popupDialog("Booking Complete!", "Message");
							break;
						}
						case 1:{
							gui.popupDialog("Database Error.", "Error");
							break;
						}
						case 2:{
							gui.popupDialog("Start and/or End date are missing.", "Error");
							break;
						}
						case 3:{
							gui.popupDialog("Start and/or End date are written in an invalid format.", "Error");
							break;
						}
						case 4:{
							gui.popupDialog("Start Date cannot be after End Date.", "Error");
							break;
						}
						case 5:{
							gui.popupDialog("Start Date must be later than today.", "Error");
							break;
						}
						case 6:{
							gui.popupDialog("The number of occupants cannot be Zero or less.", "Error");
							break;
						}
						case 7:{
							gui.popupDialog("Your reservation date interval is overlapping with another customer's reservation.", "Error");
							break;
						}
						case 8:{
							gui.popupDialog("Room number field is empty.", "Error");
							break;
						}
						case 9:{
							gui.popupDialog("Room number does not exist.", "Error");
							break;
						}	
					}
				}
				catch(Exception exp){
					break;
				}
				break;
			}
			
		}		
				
	}
}
