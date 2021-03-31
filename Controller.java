import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

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
					;
				}

				break;
			}
		}		
				
	}
}
