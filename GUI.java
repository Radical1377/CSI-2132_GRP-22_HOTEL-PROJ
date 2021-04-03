import javax.swing.*;
import javax.swing.table.DefaultTableModel; 
import java.awt.*;

public class GUI extends JFrame {
static GUI theGUI;

private JPanel panel0;

private JPanel[] panels = new JPanel[4];
private JButton but0;
private JButton but4;
private JButton but5;
private JButton logoutBtn;
private JButton logoutBtn2;
private JButton logoutBtn3;
private JLabel label0;
private JPanel panel6;
private JPanel panel7;
private JPanel panel2;
private JTextArea consoleText;
private JButton querySubmitBtn;

private JTabbedPane tabbedPane0;
private JTabbedPane tabbedPane1;

private JPanel cpanel3;
private JLabel cuslabel5;
private JLabel cuslabel6;
private JLabel cuslabel7;
private JLabel cuslabel8;
private JLabel cuslabel9;
private JLabel cuslabel10;
private JLabel cuslabel11;
private JLabel cuslabel12;
private JLabel cuslabel13;


private JTextField cusBookID;
private JSpinner cusBookOccupants;
private JTextField cusBookStartDate;
private JTextField cusBookEndDate;
private JTextField cusBookRoomNumber;
private JTextField cusBookFirstName;
private JTextField cusBookLastName;
private JTextField cusBookSIN;
private JTextField cusBookZIP;

private JButton cusBookBtn;

private JTabbedPane tabbedPane2;

private JPanel cpanel2;
private JTable cusRoomsTable;
private JLabel cuslabel1;
private JLabel cuslabel2;
private JTextField cusSearchStartDate;
private JTextField cusSearchEndDate;
private JLabel cuslabel3;
private JComboBox cusSearchRoomType;
private JLabel cuslabel4;
private JComboBox cusSearchLocation;
private JButton cusSearchBtn;



private DefaultTableModel cusTableModel = new DefaultTableModel();	


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
	
	but5 = new JButton("Customer Portal");
	but5.setName("Customer Portal");
	gbcpanel1.gridx = 0;
	gbcpanel1.gridy = 3;
	gbcpanel1.gridwidth = 1;
	gbcpanel1.gridheight = 1;
	gbcpanel1.fill = GridBagConstraints.NONE;
	gbcpanel1.weightx = 0;
	gbcpanel1.weighty = 0;
	gbcpanel1.anchor = GridBagConstraints.NORTH;
	gbpanel1.setConstraints(but5, gbcpanel1);
	panels[0].add(but5);
	but5.addActionListener(controller);
	
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


	// CUSTOMER SCREEN START
	panels[3] = new JPanel();
	panels[3].setBorder(BorderFactory.createTitledBorder("Customer Portal"));
	GridBagLayout gbpanel_cus = new GridBagLayout();
	GridBagConstraints gbcpanel_cus = new GridBagConstraints();
	panels[3].setLayout(gbpanel_cus);
	
	tabbedPane2 = new JTabbedPane();
	
	cpanel2 = new JPanel();
	GridBagLayout gbbcpanel2 = new GridBagLayout();
	GridBagConstraints gbccpanel2 = new GridBagConstraints();
	cpanel2.setLayout(gbbcpanel2);
	
	//String [][]datacusRoomsTable = new String[][] {{""},{""},{""},{""}};
	//String []colscusRoomsTable = new String[] {"","","",""};
	cusRoomsTable = new JTable(cusTableModel);

	cusTableModel.addColumn("Room Number");
	cusTableModel.addColumn("Price");
	cusTableModel.addColumn("Room Type");
	cusTableModel.addColumn("Location");

	cusRoomsTable.setAutoCreateColumnsFromModel(false);


	JScrollPane scpcusRoomsTable = new JScrollPane(cusRoomsTable);
	gbccpanel2.gridx = 0;
	gbccpanel2.gridy = 0;
	gbccpanel2.gridwidth = 17;
	gbccpanel2.gridheight = 8;
	gbccpanel2.fill = GridBagConstraints.BOTH;
	gbccpanel2.weightx = 1;
	gbccpanel2.weighty = 1;
	gbccpanel2.anchor = GridBagConstraints.NORTH;
	gbbcpanel2.setConstraints(scpcusRoomsTable, gbccpanel2);
	cpanel2.add(scpcusRoomsTable);
	
	cuslabel1 = new JLabel("Start Date (YYYY-MM-DD)");
	gbccpanel2.gridx = 0;
	gbccpanel2.gridy = 8;
	gbccpanel2.gridwidth = 8;
	gbccpanel2.gridheight = 2;
	gbccpanel2.fill = GridBagConstraints.BOTH;
	gbccpanel2.weightx = 1;
	gbccpanel2.weighty = 0;
	gbccpanel2.anchor = GridBagConstraints.NORTH;
	gbbcpanel2.setConstraints(cuslabel1, gbccpanel2);
	cpanel2.add(cuslabel1);
	
	cuslabel2 = new JLabel("End Date (YYYY-MM-DD)");
	gbccpanel2.gridx = 9;
	gbccpanel2.gridy = 8;
	gbccpanel2.gridwidth = 8;
	gbccpanel2.gridheight = 2;
	gbccpanel2.fill = GridBagConstraints.BOTH;
	gbccpanel2.weightx = 1;
	gbccpanel2.weighty = 0;
	gbccpanel2.anchor = GridBagConstraints.NORTH;
	gbbcpanel2.setConstraints(cuslabel2, gbccpanel2);
	cpanel2.add(cuslabel2);
	
	cusSearchStartDate = new JTextField();
	gbccpanel2.gridx = 0;
	gbccpanel2.gridy = 10;
	gbccpanel2.gridwidth = 8;
	gbccpanel2.gridheight = 2;
	gbccpanel2.fill = GridBagConstraints.BOTH;
	gbccpanel2.weightx = 1;
	gbccpanel2.weighty = 0;
	gbccpanel2.anchor = GridBagConstraints.NORTH;
	gbbcpanel2.setConstraints(cusSearchStartDate, gbccpanel2);
	cpanel2.add(cusSearchStartDate);
	
	cusSearchEndDate = new JTextField();
	gbccpanel2.gridx = 9;
	gbccpanel2.gridy = 10;
	gbccpanel2.gridwidth = 8;
	gbccpanel2.gridheight = 2;
	gbccpanel2.fill = GridBagConstraints.BOTH;
	gbccpanel2.weightx = 1;
	gbccpanel2.weighty = 0;
	gbccpanel2.anchor = GridBagConstraints.NORTH;
	gbbcpanel2.setConstraints(cusSearchEndDate, gbccpanel2);
	cpanel2.add(cusSearchEndDate);
	
	cuslabel3 = new JLabel("Room Type");
	gbccpanel2.gridx = 0;
	gbccpanel2.gridy = 12;
	gbccpanel2.gridwidth = 8;
	gbccpanel2.gridheight = 2;
	gbccpanel2.fill = GridBagConstraints.BOTH;
	gbccpanel2.weightx = 1;
	gbccpanel2.weighty = 0;
	gbccpanel2.anchor = GridBagConstraints.NORTH;
	gbbcpanel2.setConstraints(cuslabel3, gbccpanel2);
	cpanel2.add(cuslabel3);
	
	String []datacusSearchRoomType = {"Any","Double","Quad","Queen", "Single", "Suite"};
	cusSearchRoomType = new JComboBox(datacusSearchRoomType);
	gbccpanel2.gridx = 0;
	gbccpanel2.gridy = 14;
	gbccpanel2.gridwidth = 8;
	gbccpanel2.gridheight = 2;
	gbccpanel2.fill = GridBagConstraints.BOTH;
	gbccpanel2.weightx = 1;
	gbccpanel2.weighty = 0;
	gbccpanel2.anchor = GridBagConstraints.NORTH;
	gbbcpanel2.setConstraints(cusSearchRoomType, gbccpanel2);
	cpanel2.add(cusSearchRoomType);
	
	cuslabel4 = new JLabel("Location");
	gbccpanel2.gridx = 9;
	gbccpanel2.gridy = 12;
	gbccpanel2.gridwidth = 8;
	gbccpanel2.gridheight = 2;
	gbccpanel2.fill = GridBagConstraints.BOTH;
	gbccpanel2.weightx = 1;
	gbccpanel2.weighty = 0;
	gbccpanel2.anchor = GridBagConstraints.NORTH;
	gbbcpanel2.setConstraints(cuslabel4, gbccpanel2);
	cpanel2.add(cuslabel4);
	
	String []datacusSearchLocation = {"Any","Best Western Halifax",
									"Best Western Montreal",
									"Best Western Ottawa",
								   	"Best Western Toronto",
								   	"Best Western Vancouver",
									"Choice Calgary",
									"Choice Montreal",
									"Choice Ottawa",
									"Choice Quebec City",
									"Choice Toronto",
									"Hilton Mississauga",
									"Hilton NYC",
									"Hilton Ottawa",
									"Hilton Rio De Janeiro",
									"Hilton Vancouver",
									"IC Halifax",
									"IC Mississauga",
									"IC Ottawa",
									"IC Toronto",
									"IC Vancouver",
									"Marriott Montreal",
									"Marriott Ottawa",
									"Marriott Quebec City",
									"Marriott Toronto",
									"Marriott Vancouver",
									"Wyndham Calgary",
									"Wyndham Edmonton",
									"Wyndham Halifax",
									"Wyndham Ottawa",
									"Wyndham Toronto"};
	cusSearchLocation = new JComboBox(datacusSearchLocation);
	gbccpanel2.gridx = 9;
	gbccpanel2.gridy = 14;
	gbccpanel2.gridwidth = 8;
	gbccpanel2.gridheight = 2;
	gbccpanel2.fill = GridBagConstraints.BOTH;
	gbccpanel2.weightx = 1;
	gbccpanel2.weighty = 0;
	gbccpanel2.anchor = GridBagConstraints.NORTH;
	gbbcpanel2.setConstraints(cusSearchLocation, gbccpanel2);
	cpanel2.add(cusSearchLocation);
	
	cusSearchBtn = new JButton("Search");
	cusSearchBtn.setName("cusSearch");
	gbccpanel2.gridx = 0;
	gbccpanel2.gridy = 16;
	gbccpanel2.gridwidth = 17;
	gbccpanel2.gridheight = 2;
	gbccpanel2.fill = GridBagConstraints.BOTH;
	gbccpanel2.weightx = 1;
	gbccpanel2.weighty = 0;
	gbccpanel2.anchor = GridBagConstraints.NORTH;
	gbbcpanel2.setConstraints(cusSearchBtn, gbccpanel2);
	cpanel2.add(cusSearchBtn);
	tabbedPane2.addTab("Rooms",cpanel2);
	cusSearchBtn.addActionListener(controller);
	
	cpanel3 = new JPanel();
	GridBagLayout gbcpanel3 = new GridBagLayout();
	GridBagConstraints gbccpanel3 = new GridBagConstraints();
	cpanel3.setLayout(gbcpanel3);
	
	cuslabel5 = new JLabel("Your ID:");
	gbccpanel3.gridx = 0;
	gbccpanel3.gridy = 0;
	gbccpanel3.gridwidth = 4;
	gbccpanel3.gridheight = 2;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cuslabel5, gbccpanel3);
	cpanel3.add(cuslabel5);
	
	cusBookID = new JTextField();
	gbccpanel3.gridx = 4;
	gbccpanel3.gridy = 0;
	gbccpanel3.gridwidth = 12;
	gbccpanel3.gridheight = 2;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cusBookID, gbccpanel3);
	cpanel3.add(cusBookID);
	
	cuslabel6 = new JLabel("# of Occupants:");
	gbccpanel3.gridx = 0;
	gbccpanel3.gridy = 2;
	gbccpanel3.gridwidth = 4;
	gbccpanel3.gridheight = 2;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cuslabel6, gbccpanel3);
	cpanel3.add(cuslabel6);
	
	cusBookOccupants = new JSpinner();
	gbccpanel3.gridx = 4;
	gbccpanel3.gridy = 2;
	gbccpanel3.gridwidth = 12;
	gbccpanel3.gridheight = 2;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cusBookOccupants, gbccpanel3);
	cpanel3.add(cusBookOccupants);
	
	cuslabel7 = new JLabel("Start Date (YYYY-MM-DD):");
	gbccpanel3.gridx = 0;
	gbccpanel3.gridy = 4;
	gbccpanel3.gridwidth = 4;
	gbccpanel3.gridheight = 2;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cuslabel7, gbccpanel3);
	cpanel3.add(cuslabel7);
	
	cuslabel8 = new JLabel("End Date (YYYY-MM-DD):");
	gbccpanel3.gridx = 0;
	gbccpanel3.gridy = 6;
	gbccpanel3.gridwidth = 4;
	gbccpanel3.gridheight = 2;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cuslabel8, gbccpanel3);
	cpanel3.add(cuslabel8);
	
	cuslabel9 = new JLabel("Room Number:");
	gbccpanel3.gridx = 0;
	gbccpanel3.gridy = 8;
	gbccpanel3.gridwidth = 4;
	gbccpanel3.gridheight = 2;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cuslabel9, gbccpanel3);
	cpanel3.add(cuslabel9);
	
	
	cusBookStartDate = new JTextField();
	gbccpanel3.gridx = 4;
	gbccpanel3.gridy = 4;
	gbccpanel3.gridwidth = 12;
	gbccpanel3.gridheight = 2;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cusBookStartDate, gbccpanel3);
	cpanel3.add(cusBookStartDate);
	
	cusBookEndDate = new JTextField();
	gbccpanel3.gridx = 4;
	gbccpanel3.gridy = 6;
	gbccpanel3.gridwidth = 12;
	gbccpanel3.gridheight = 2;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cusBookEndDate, gbccpanel3);
	cpanel3.add(cusBookEndDate);
	
	cusBookRoomNumber = new JTextField();
	gbccpanel3.gridx = 4;
	gbccpanel3.gridy = 8;
	gbccpanel3.gridwidth = 12;
	gbccpanel3.gridheight = 2;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cusBookRoomNumber, gbccpanel3);
	cpanel3.add(cusBookRoomNumber);
	
	
	logoutBtn3 = new JButton("Logout");
	logoutBtn3.setName("Logout");
	gbcpanel_cus.gridx = 0;
	gbcpanel_cus.gridy = 18;
	gbcpanel_cus.gridwidth = 5;
	gbcpanel_cus.gridheight = 2;
	gbcpanel_cus.fill = GridBagConstraints.BOTH;
	gbcpanel_cus.weightx = 1;
	gbcpanel_cus.weighty = 0;
	gbcpanel_cus.anchor = GridBagConstraints.SOUTH;
	gbcpanel_cus.insets = new Insets(3,0,0,0);
	gbpanel_cus.setConstraints(logoutBtn3, gbcpanel_cus);
	panels[3].add(logoutBtn3);
	logoutBtn3.addActionListener(controller);
	
	
	cusBookBtn = new JButton("Book Room");
	cusBookBtn.setName("cusBook");
	gbccpanel3.gridx = 0;
	gbccpanel3.gridy = 22;
	gbccpanel3.gridwidth = 17;
	gbccpanel3.gridheight = 3;
	gbccpanel3.fill = GridBagConstraints.BOTH;
	gbccpanel3.weightx = 1;
	gbccpanel3.weighty = 0;
	gbccpanel3.anchor = GridBagConstraints.NORTH;
	gbcpanel3.setConstraints(cusBookBtn, gbccpanel3);
	cpanel3.add(cusBookBtn);
	cusBookBtn.addActionListener(controller);
	

	tabbedPane2.addTab("Book",cpanel3);
	gbcpanel_cus.gridx = 0;
	gbcpanel_cus.gridy = 0;
	gbcpanel_cus.gridwidth = 17;
	gbcpanel_cus.gridheight = 18;
	gbcpanel_cus.fill = GridBagConstraints.BOTH;
	gbcpanel_cus.weightx = 1;
	gbcpanel_cus.weighty = 1;
	gbcpanel_cus.anchor = GridBagConstraints.NORTH;
	gbpanel_cus.setConstraints(tabbedPane2, gbcpanel_cus);
	panels[3].add(tabbedPane2);
	gbcpanel0.gridx = 1;
	gbcpanel0.gridy = 1;
	gbcpanel0.gridwidth = 18;
	gbcpanel0.gridheight = 18;
	gbcpanel0.fill = GridBagConstraints.BOTH;
	gbcpanel0.weightx = 1;
	gbcpanel0.weighty = 1;
	gbcpanel0.anchor = GridBagConstraints.NORTH;
	gbpanel0.setConstraints(panels[3], gbcpanel0);
	panel0.add(panels[3]);
	// CUSTOMER SCREEN END


    setDefaultCloseOperation(EXIT_ON_CLOSE);

    setContentPane(panel0);
    pack();
    setVisible(true);
	panels[0].setVisible(true);
	panels[1].setVisible(false);
	panels[2].setVisible(false);
	panels[3].setVisible(false);
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

public DefaultTableModel getCusTableModel() {
	return this.cusTableModel;
}

public String[] getCusSearchFilters() {
	return new String[] {cusSearchStartDate.getText(),
	   	    			 cusSearchEndDate.getText(),
		   				 cusSearchRoomType.getSelectedItem().toString(),
						 cusSearchLocation.getSelectedItem().toString()};
}

public String[] getCusBookFilters() {


return new String[] {cusBookID.getText(),
					cusBookOccupants.getValue().toString(),
					cusBookStartDate.getText(),
					cusBookEndDate.getText(),
					cusBookRoomNumber.getText()};
}

public JPanel[] getPanels() {
	return panels;
}


} 
