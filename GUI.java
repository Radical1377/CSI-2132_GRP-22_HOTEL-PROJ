import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
static GUI theGUI;

private JPanel panel0;

private JPanel[] panels = new JPanel[3];
private JButton but0;
private JButton but4;
private JButton logoutBtn;
private JButton logoutBtn2;
private JLabel label0;
private JPanel panel6;
private JPanel panel7;
private JPanel panel2;
private JTextArea consoleText;
private JButton querySubmitBtn;

private JTabbedPane tabbedPane0;
private JTabbedPane tabbedPane1;

private Controller controller;

public GUI(Controller controller) {

    super("Hotel Client");

	this.setPreferredSize(new Dimension(800, 600));

	this.controller = controller;


	// WELCOME SCREEN
	panel0 = new JPanel();
	GridBagLayout gbpanel0 = new GridBagLayout();
	GridBagConstraints gbcpanel0 = new GridBagConstraints();
	panel0.setLayout(gbpanel0);
	
	panels[0] = new JPanel();
	panels[0].setBorder(BorderFactory.createTitledBorder("Main Menu"));
	GridBagLayout gbpanel1 = new GridBagLayout();
	GridBagConstraints gbcpanel1 = new GridBagConstraints();
	panels[0].setLayout(gbpanel1);
	
	but0 = new JButton("Admin Portal");
	but0.setName("Admin Portal");
	gbcpanel1.gridx = 0;
	gbcpanel1.gridy = 1;
	gbcpanel1.gridwidth = 1;
	gbcpanel1.gridheight = 1;
	gbcpanel1.fill = GridBagConstraints.NONE;
	gbcpanel1.weightx = 0;
	gbcpanel1.weighty = 0;
	gbcpanel1.anchor = GridBagConstraints.NORTH;
	gbcpanel1.insets = new Insets(0,0,10,0);
	gbpanel1.setConstraints(but0, gbcpanel1);
	panels[0].add(but0);
	but0.addActionListener(controller);
	
	but4 = new JButton("Employee Portal");
	but4.setName("Employee Portal");
	gbcpanel1.gridx = 0;
	gbcpanel1.gridy = 2;
	gbcpanel1.gridwidth = 1;
	gbcpanel1.gridheight = 1;
	gbcpanel1.fill = GridBagConstraints.NONE;
	gbcpanel1.weightx = 0;
	gbcpanel1.weighty = 0;
	gbcpanel1.anchor = GridBagConstraints.NORTH;
	gbpanel1.setConstraints(but4, gbcpanel1);
	panels[0].add(but4);
	but4.addActionListener(controller);
	
	label0 = new JLabel("Welcome to the Hotel Interface!!");
	gbcpanel1.gridx = 0;
	gbcpanel1.gridy = 0;
	gbcpanel1.gridwidth = 1;
	gbcpanel1.gridheight = 1;
	gbcpanel1.fill = GridBagConstraints.NONE;
	gbcpanel1.weightx = 0;
	gbcpanel1.weighty = 0;
	gbcpanel1.anchor = GridBagConstraints.NORTH;
	gbcpanel1.insets = new Insets(0,0,20,0);
	gbpanel1.setConstraints(label0, gbcpanel1);
	panels[0].add(label0);
	gbcpanel0.gridx = 4;
	gbcpanel0.gridy = 3;
	gbcpanel0.gridwidth = 14;
	gbcpanel0.gridheight = 7;
	gbcpanel0.fill = GridBagConstraints.BOTH;
	gbcpanel0.weightx = 1;
	gbcpanel0.weighty = 1;
	gbcpanel0.anchor = GridBagConstraints.NORTH;
	gbpanel0.setConstraints(panels[0], gbcpanel0);
	panel0.add(panels[0]);

	//WELCOME SCREEN END
	

	//EMPLOYEE SCREEN START	
	panels[1] = new JPanel();
	panels[1].setBorder(BorderFactory.createTitledBorder("Employee Portal"));
	GridBagLayout gbpanel_emp = new GridBagLayout();
	GridBagConstraints gbcpanel_emp = new GridBagConstraints();
	panels[1].setLayout(gbpanel_emp);
	
	tabbedPane1 = new JTabbedPane();
	
	panel6 = new JPanel();
	GridBagLayout gbpanel6 = new GridBagLayout();
	GridBagConstraints gbcpanel6 = new GridBagConstraints();
	panel6.setLayout(gbpanel6);
//	tabbedPane1.addTab("Profile",panel6);
	
	panel7 = new JPanel();
	GridBagLayout gbpanel7 = new GridBagLayout();
	GridBagConstraints gbcpanel7 = new GridBagConstraints();
	panel7.setLayout(gbpanel7);
	tabbedPane1.addTab("Edit Bookings",panel7);
	gbcpanel_emp.gridx = 0;
	gbcpanel_emp.gridy = 0;
	gbcpanel_emp.gridwidth = 15;
	gbcpanel_emp.gridheight = 11;
	gbcpanel_emp.fill = GridBagConstraints.BOTH;
	gbcpanel_emp.weightx = 1;
	gbcpanel_emp.weighty = 1;
	gbcpanel_emp.anchor = GridBagConstraints.NORTH;
	gbpanel_emp.setConstraints(tabbedPane1, gbcpanel_emp);
	panels[1].add(tabbedPane1);
	
	logoutBtn = new JButton("Logout");
	logoutBtn.setName("Logout");
	gbcpanel_emp.gridx = 0;
	gbcpanel_emp.gridy = 11;
	gbcpanel_emp.gridwidth = 5;
	gbcpanel_emp.gridheight = 2;
	gbcpanel_emp.fill = GridBagConstraints.BOTH;
	gbcpanel_emp.weightx = 1;
	gbcpanel_emp.weighty = 0;
	gbcpanel_emp.anchor = GridBagConstraints.SOUTH;
	gbcpanel_emp.insets = new Insets(3,0,0,0);
	gbpanel_emp.setConstraints(logoutBtn, gbcpanel_emp);
	panels[1].add(logoutBtn);
	logoutBtn.addActionListener(controller);

	gbcpanel0.gridx = 3;
	gbcpanel0.gridy = 3;
	gbcpanel0.gridwidth = 15;
	gbcpanel0.gridheight = 9;
	gbcpanel0.fill = GridBagConstraints.BOTH;
	gbcpanel0.weightx = 1;
	gbcpanel0.weighty = 1;
	gbcpanel0.anchor = GridBagConstraints.NORTH;
	gbpanel0.setConstraints(panels[1], gbcpanel0);
	panel0.add(panels[1]);
	//EMPLOYEE SCREEN END

	//ADMIN SCREEN START
	panels[2] = new JPanel();
	panels[2].setBorder(BorderFactory.createTitledBorder("Admin Portal"));
	GridBagLayout gbpanel_adm = new GridBagLayout();
	GridBagConstraints gbcpanel_adm = new GridBagConstraints();
	panels[2].setLayout(gbpanel_adm);

	tabbedPane0 = new JTabbedPane();

	panel2 = new JPanel();
	GridBagLayout gbpanel2 = new GridBagLayout();
	GridBagConstraints gbcpanel2 = new GridBagConstraints();
	panel2.setLayout(gbpanel2);

	consoleText = new JTextArea(2,10);
	gbcpanel2.gridx = 0;
	gbcpanel2.gridy = 0;
	gbcpanel2.gridwidth = 20;
	gbcpanel2.gridheight = 12;
	gbcpanel2.fill = GridBagConstraints.BOTH;
	gbcpanel2.weightx = 1;
	gbcpanel2.weighty = 1;
	gbcpanel2.anchor = GridBagConstraints.NORTH;
	gbpanel2.setConstraints(consoleText, gbcpanel2);
	panel2.add(consoleText);

	querySubmitBtn = new JButton("Submit Query");
	querySubmitBtn.setName("Submit Query");
	gbcpanel2.gridx = 2;
	gbcpanel2.gridy = 12;
	gbcpanel2.gridwidth = 16;
	gbcpanel2.gridheight = 3;
	gbcpanel2.fill = GridBagConstraints.BOTH;
	gbcpanel2.weightx = 1;
	gbcpanel2.weighty = 0;
	gbcpanel2.anchor = GridBagConstraints.NORTH;
	gbcpanel2.insets = new Insets(0,0,9,0);
	gbpanel2.setConstraints(querySubmitBtn, gbcpanel2);
	panel2.add(querySubmitBtn);
	querySubmitBtn.addActionListener(controller);


	tabbedPane0.addTab("Admin Console",panel2);
	gbcpanel_adm.gridx = 0;
	gbcpanel_adm.gridy = 0;
	gbcpanel_adm.gridwidth = 20;
	gbcpanel_adm.gridheight = 18;
	gbcpanel_adm.fill = GridBagConstraints.BOTH;
	gbcpanel_adm.weightx = 1;
	gbcpanel_adm.weighty = 1;
	gbcpanel_adm.anchor = GridBagConstraints.NORTH;
	gbpanel_adm.setConstraints(tabbedPane0, gbcpanel_adm);
	panels[2].add(tabbedPane0);

	logoutBtn2 = new JButton("Logout");
	logoutBtn2.setName("Logout");
	gbcpanel_adm.gridx = 0;
	gbcpanel_adm.gridy = 18;
	gbcpanel_adm.gridwidth = 6;
	gbcpanel_adm.gridheight = 2;
	gbcpanel_adm.fill = GridBagConstraints.BOTH;
	gbcpanel_adm.weightx = 1;
	gbcpanel_adm.weighty = 0;
	gbcpanel_adm.anchor = GridBagConstraints.NORTH;
	gbpanel_adm.setConstraints(logoutBtn2, gbcpanel_adm);
	panels[2].add(logoutBtn2);
	logoutBtn2.addActionListener(controller);


	gbcpanel0.gridx = 0;
	gbcpanel0.gridy = 0;
	gbcpanel0.gridwidth = 20;
	gbcpanel0.gridheight = 20;
	gbcpanel0.fill = GridBagConstraints.BOTH;
	gbcpanel0.weightx = 1;
	gbcpanel0.weighty = 1;
	gbcpanel0.anchor = GridBagConstraints.NORTH;
	gbpanel0.setConstraints(panels[2], gbcpanel0);
	panel0.add(panels[2]);

	// ADMIN SCREEN END


    setDefaultCloseOperation(EXIT_ON_CLOSE);

    setContentPane(panel0);
    pack();
    setVisible(true);
	panels[0].setVisible(true);
	panels[1].setVisible(false);
}

public void switchToPanel(JPanel input_panel){
	
   for(int i = 0; i < this.panels.length; i++) {
       panels[i].setVisible(false);
   }	
   input_panel.setVisible(true);
}

public void popupDialog(String message, String type) {
	switch(type.toString()) {
		case "Message":{
			JOptionPane.showMessageDialog(this, message.toString(), "", JOptionPane.INFORMATION_MESSAGE);
			break;
		}	
		case "Error":{
			JOptionPane.showMessageDialog(this, message.toString(), "", JOptionPane.ERROR_MESSAGE);
			break;
			
		}
	}
}

public String getAdminQuery() {
	return this.consoleText.getText();
}

public JPanel[] getPanels() {
	return panels;
}


} 
