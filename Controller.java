import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Controller implements ActionListener {
	
	private Backend backend;
	private GUI gui;
	private JPanel[] panels;

	public Controller(){
		backend = new Backend();
		gui = new GUI(this);
		panels = gui.getPanels();
	}

	public void actionPerformed(ActionEvent e) {
	
		switch(((JComponent) e.getSource()).getName().toString()){
			case "Customer Portal":{
				gui.switchToPanel(panels[1]);
				break;
			}
			case "Logout":{
				gui.switchToPanel(panels[0]);
				break;
			}
		}		
	//	if(((JComponent) e.getSource()).getName().equals("Customer Portal")){
	//		gui.switchToPanel(panels[1]);	
	//	}
				
	}
}
