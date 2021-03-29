import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
static GUI theGUI;

private JPanel panel0;

private JPanel[] panels = new JPanel[2];
private JButton but0;
private JButton but4;
private JButton logoutBtn;
private JLabel label0;
private JPanel panel6;
private JPanel panel7;

private JTabbedPane tabbedPane1;

private Controller controller;

public GUI(Controller ctrler) {

    super("Hotel Client");

	this.setPreferredSize(new Dimension(800, 600));

	this.controller = ctrler;


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
	
	but0 = new JButton("Customer Portal");
	but0.setName("Customer Portal");
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
	tabbedPane1.addTab("Profile",panel6);
	
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

public JPanel[] getPanels() {
	return panels;
}


} 
