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

//

private JTabbedPane empTabbedPane;

private JPanel empTabbedPanel1;
private JTable empSearchTable;
private JLabel empLabel0;
private JLabel empLabel2;
private JTextField empSearchStartDate;
private JTextField empSearchEndDate;
private JLabel empLabel3;
private JComboBox empSearchChain;
private JCheckBox empSearchIsAvailable;
 
private JPanel empTabbedPanel2;
private JTable empBookingTable;
private JTable empRentalTable;
private JButton empRefreshBookRentalBtn;
private JButton empSearchBtn;
private JLabel empLabel6;
private JComboBox empRentalChain;
 
private JPanel empPanel8;
private JLabel empLabel11;
private JTextField empRentalCustomerID;
private JLabel empLabel12;
private JTextField empRentalID2;
private JLabel empLabel13;
private JSpinner empOccupantNumber;
private JLabel empLabel14;
private JTextField empRentalStartDate;
private JLabel empLabel15;
private JTextField empRentalEndDate;
private JLabel empLabel16;
private JTextField empRentalRoomNumber;
private JButton empRentRoomBtn;
 
private JPanel empPanel9;
private JLabel empLabel8;
private JTextField empBookingID;
private JButton empSwitchToRentalBtn;
private JLabel empLabel9;
private JTextField empRentalID1;
private JLabel empLabel10;
private JTextField empRentalRentalID;
private JButton empTogglePaymentBtn;

private DefaultTableModel cusTableModel = new DefaultTableModel();	
private DefaultTableModel empTableModel = new DefaultTableModel();	
private DefaultTableModel empBookTableModel = new DefaultTableModel();	
private DefaultTableModel empRentTableModel = new DefaultTableModel();	


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

	logoutBtn = new JButton("Logout");
	logoutBtn.setName("Logout");
	gbcpanel_emp.gridx = 0;
	gbcpanel_emp.gridy = 36;
	gbcpanel_emp.gridwidth = 38;
	gbcpanel_emp.gridheight = 2;
	gbcpanel_emp.fill = GridBagConstraints.BOTH;
	gbcpanel_emp.weightx = 1;
	gbcpanel_emp.weighty = 0;
	gbcpanel_emp.anchor = GridBagConstraints.NORTH;
	gbpanel_emp.setConstraints(logoutBtn, gbcpanel_emp);
	panels[1].add(logoutBtn);
	logoutBtn.addActionListener(controller);
	

	empTabbedPane = new JTabbedPane();

	empTabbedPanel1 = new JPanel();
	GridBagLayout gbempTabbedPanel1 = new GridBagLayout();
	GridBagConstraints gbcempTabbedPanel1 = new GridBagConstraints();
	empTabbedPanel1.setLayout(gbempTabbedPanel1);

	//String [][]dataempSearchTable = new String[][] {"",""};
	///String []colsempSearchTable = new String[] {"",""};
	
	empSearchTable = new JTable(empTableModel);

	empTableModel.addColumn("Room Number");
	empTableModel.addColumn("Price");
	empTableModel.addColumn("Room Type");
	empTableModel.addColumn("Location");

	JScrollPane scpempSearchTable = new JScrollPane(empSearchTable);
	gbcempTabbedPanel1.gridx = 0;
	gbcempTabbedPanel1.gridy = 0;
	gbcempTabbedPanel1.gridwidth = 38;
	gbcempTabbedPanel1.gridheight = 15;
	gbcempTabbedPanel1.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel1.weightx = 1;
	gbcempTabbedPanel1.weighty = 1;
	gbcempTabbedPanel1.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel1.setConstraints(scpempSearchTable, gbcempTabbedPanel1);
	empTabbedPanel1.add(scpempSearchTable);

	empLabel0 = new JLabel("Start Date (YYYY-MM-DD)");
	gbcempTabbedPanel1.gridx = 0;
	gbcempTabbedPanel1.gridy = 15;
	gbcempTabbedPanel1.gridwidth = 17;
	gbcempTabbedPanel1.gridheight = 2;
	gbcempTabbedPanel1.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel1.weightx = 1;
	gbcempTabbedPanel1.weighty = 0;
	gbcempTabbedPanel1.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel1.setConstraints(empLabel0, gbcempTabbedPanel1);
	empTabbedPanel1.add(empLabel0);

	empLabel2 = new JLabel("End Date (YYYY-MM-DD)");
	gbcempTabbedPanel1.gridx = 19;
	gbcempTabbedPanel1.gridy = 15;
	gbcempTabbedPanel1.gridwidth = 19;
	gbcempTabbedPanel1.gridheight = 2;
	gbcempTabbedPanel1.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel1.weightx = 1;
	gbcempTabbedPanel1.weighty = 0;
	gbcempTabbedPanel1.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel1.setConstraints(empLabel2, gbcempTabbedPanel1);
	empTabbedPanel1.add(empLabel2);

	empSearchStartDate = new JTextField();
	gbcempTabbedPanel1.gridx = 0;
	gbcempTabbedPanel1.gridy = 17;
	gbcempTabbedPanel1.gridwidth = 17;
	gbcempTabbedPanel1.gridheight = 2;
	gbcempTabbedPanel1.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel1.weightx = 1;
	gbcempTabbedPanel1.weighty = 0;
	gbcempTabbedPanel1.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel1.setConstraints(empSearchStartDate, gbcempTabbedPanel1);
	empTabbedPanel1.add(empSearchStartDate);

	empSearchEndDate = new JTextField();
	gbcempTabbedPanel1.gridx = 19;
	gbcempTabbedPanel1.gridy = 17;
	gbcempTabbedPanel1.gridwidth = 19;
	gbcempTabbedPanel1.gridheight = 2;
	gbcempTabbedPanel1.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel1.weightx = 1;
	gbcempTabbedPanel1.weighty = 0;
	gbcempTabbedPanel1.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel1.setConstraints(empSearchEndDate, gbcempTabbedPanel1);
	empTabbedPanel1.add(empSearchEndDate);

	empLabel3 = new JLabel("Chain");
	gbcempTabbedPanel1.gridx = 0;
	gbcempTabbedPanel1.gridy = 19;
	gbcempTabbedPanel1.gridwidth = 4;
	gbcempTabbedPanel1.gridheight = 2;
	gbcempTabbedPanel1.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel1.weightx = 1;
	gbcempTabbedPanel1.weighty = 0;
	gbcempTabbedPanel1.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel1.setConstraints(empLabel3, gbcempTabbedPanel1);
	empTabbedPanel1.add(empLabel3);

	String []dataempSearchChain = {"Best Western Halifax","Best Western Montreal",
	                               "Best Western Ottawa","Best Western Toronto",
                                   "Best Western Vancouver","Choice Calgary",
                                   "Choice Montreal","Choice Ottawa",
                                   "Choice Quebec City","Choice Toronto",
	                               "Hilton Mississauga","Hilton NYC","Hilton Ottawa",
                                   "Hilton Rio De Janeiro","Hilton Vancouver",
                                   "IC Halifax","IC Mississauga","IC Ottawa",
                                   "IC Toronto","IC Vancouver","Marriott Montreal",
                                   "Marriott Ottawa","Marriott Quebec City",
	                               "Marriott Toronto","Marriott Vancouver",
	                               "Wyndham Calgary","Wyndham Edmonton",
	                               "Wyndham Halifax","Wyndham Ottawa",
	                               "Wyndham Toronto"};
	empSearchChain = new JComboBox(dataempSearchChain);
	gbcempTabbedPanel1.gridx = 4;
	gbcempTabbedPanel1.gridy = 19;
	gbcempTabbedPanel1.gridwidth = 13;
	gbcempTabbedPanel1.gridheight = 2;
	gbcempTabbedPanel1.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel1.weightx = 1;
	gbcempTabbedPanel1.weighty = 0;
	gbcempTabbedPanel1.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel1.setConstraints(empSearchChain, gbcempTabbedPanel1);
	empTabbedPanel1.add(empSearchChain);

	empSearchIsAvailable = new JCheckBox("Is Available?");
	gbcempTabbedPanel1.gridx = 19;
	gbcempTabbedPanel1.gridy = 19;
	gbcempTabbedPanel1.gridwidth = 19;
	gbcempTabbedPanel1.gridheight = 2;
	gbcempTabbedPanel1.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel1.weightx = 1;
	gbcempTabbedPanel1.weighty = 0;
	gbcempTabbedPanel1.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel1.setConstraints(empSearchIsAvailable, gbcempTabbedPanel1);
	empTabbedPanel1.add(empSearchIsAvailable);
	empTabbedPane.addTab("Search",empTabbedPanel1);

	
	empSearchBtn = new JButton("Search");
	empSearchBtn.setName("empSearch");
	gbcempTabbedPanel1.gridx = 0;
	gbcempTabbedPanel1.gridy = 21;
	gbcempTabbedPanel1.gridwidth = 38;
	gbcempTabbedPanel1.gridheight = 2;
	gbcempTabbedPanel1.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel1.weightx = 1;
	gbcempTabbedPanel1.weighty = 0;
	gbcempTabbedPanel1.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel1.setConstraints(empSearchBtn, gbcempTabbedPanel1);
	empTabbedPanel1.add(empSearchBtn);
	empTabbedPane.addTab("Search",empTabbedPanel1);
	empSearchBtn.addActionListener(controller);


	empTabbedPanel2 = new JPanel();
	GridBagLayout gbempTabbedPanel2 = new GridBagLayout();
	GridBagConstraints gbcempTabbedPanel2 = new GridBagConstraints();
	empTabbedPanel2.setLayout(gbempTabbedPanel2);

	//String [][]dataempBookingTable = new String[][] {"",""};
	//String []colsempBookingTable = new String[] {"",""};
	
	empBookingTable = new JTable(empBookTableModel);
		
	empBookTableModel.addColumn("Booking ID");
	empBookTableModel.addColumn("Start Date");
	empBookTableModel.addColumn("End Date");
	empBookTableModel.addColumn("# of Occupants");
	empBookTableModel.addColumn("Room Type");
	empBookTableModel.addColumn("Room #");
	empBookTableModel.addColumn("Customer ID");
	
	JScrollPane scpempBookingTable = new JScrollPane(empBookingTable);
	gbcempTabbedPanel2.gridx = 0;
	gbcempTabbedPanel2.gridy = 0;
	gbcempTabbedPanel2.gridwidth = 38;
	gbcempTabbedPanel2.gridheight = 8;
	gbcempTabbedPanel2.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel2.weightx = 1;
	gbcempTabbedPanel2.weighty = 1;
	gbcempTabbedPanel2.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel2.setConstraints(scpempBookingTable, gbcempTabbedPanel2);
	empTabbedPanel2.add(scpempBookingTable);

	//String [][]dataempRentalTable = new String[][] {"",""};
	//String []colsempRentalTable = new String[] {"",""};
	empRentalTable = new JTable(empRentTableModel);
		
	empRentTableModel.addColumn("Rental ID");
	empRentTableModel.addColumn("Start Date");
	empRentTableModel.addColumn("End Date");
	empRentTableModel.addColumn("# of Occupants");
	empRentTableModel.addColumn("Room Type");
	empRentTableModel.addColumn("Room #");
	empRentTableModel.addColumn("Customer ID");
	empRentTableModel.addColumn("Employee ID");
	empRentTableModel.addColumn("Payment");
	
	JScrollPane scpempRentalTable = new JScrollPane(empRentalTable);
	gbcempTabbedPanel2.gridx = 0;
	gbcempTabbedPanel2.gridy = 10;
	gbcempTabbedPanel2.gridwidth = 38;
	gbcempTabbedPanel2.gridheight = 8;
	gbcempTabbedPanel2.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel2.weightx = 1;
	gbcempTabbedPanel2.weighty = 1;
	gbcempTabbedPanel2.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel2.setConstraints(scpempRentalTable, gbcempTabbedPanel2);
	empTabbedPanel2.add(scpempRentalTable);

	empRefreshBookRentalBtn = new JButton("Refresh Bookings & Rentals");
	empRefreshBookRentalBtn.setName("empBookRentalRefresh");
	gbcempTabbedPanel2.gridx = 0;
	gbcempTabbedPanel2.gridy = 8;
	gbcempTabbedPanel2.gridwidth = 19;
	gbcempTabbedPanel2.gridheight = 2;
	gbcempTabbedPanel2.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel2.weightx = 1;
	gbcempTabbedPanel2.weighty = 0;
	gbcempTabbedPanel2.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel2.setConstraints(empRefreshBookRentalBtn, gbcempTabbedPanel2);
	empTabbedPanel2.add(empRefreshBookRentalBtn);
	empRefreshBookRentalBtn.addActionListener(controller);

	empLabel6 = new JLabel("Chain:");
	gbcempTabbedPanel2.gridx = 19;
	gbcempTabbedPanel2.gridy = 8;
	gbcempTabbedPanel2.gridwidth = 4;
	gbcempTabbedPanel2.gridheight = 2;
	gbcempTabbedPanel2.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel2.weightx = 1;
	gbcempTabbedPanel2.weighty = 0;
	gbcempTabbedPanel2.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel2.setConstraints(empLabel6, gbcempTabbedPanel2);
	empTabbedPanel2.add(empLabel6);

	String []dataempRentalChain = {"Best Western Halifax","Best Western Montreal",
	                               "Best Western Ottawa","Best Western Toronto",
                                   "Best Western Vancouver","Choice Calgary",
                                   "Choice Montreal","Choice Ottawa",
                                   "Choice Quebec City","Choice Toronto",
	                               "Hilton Mississauga","Hilton NYC","Hilton Ottawa",
                                   "Hilton Rio De Janeiro","Hilton Vancouver",
                                   "IC Halifax","IC Mississauga","IC Ottawa",
                                   "IC Toronto","IC Vancouver","Marriott Montreal",
	                               "Marriott Ottawa","Marriott Quebec City",
                                   "Marriott Toronto","Marriott Vancouver",
                                   "Wyndham Calgary","Wyndham Edmonton",
                                   "Wyndham Halifax","Wyndham Ottawa",
	                               "Wyndham Toronto"};
	empRentalChain = new JComboBox(dataempRentalChain);
	gbcempTabbedPanel2.gridx = 23;
	gbcempTabbedPanel2.gridy = 8;
	gbcempTabbedPanel2.gridwidth = 15;
	gbcempTabbedPanel2.gridheight = 2;
	gbcempTabbedPanel2.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel2.weightx = 1;
	gbcempTabbedPanel2.weighty = 0;
	gbcempTabbedPanel2.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel2.setConstraints(empRentalChain, gbcempTabbedPanel2);
	empTabbedPanel2.add(empRentalChain);

	empPanel8 = new JPanel();
	empPanel8.setBorder(BorderFactory.createTitledBorder("Instant Rental"));
	GridBagLayout gbempPanel8 = new GridBagLayout();
	GridBagConstraints gbcempPanel8 = new GridBagConstraints();
	empPanel8.setLayout(gbempPanel8);

	empLabel11 = new JLabel("Customer ID:");
	gbcempPanel8.gridx = 0;
	gbcempPanel8.gridy = 0;
	gbcempPanel8.gridwidth = 9;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 1;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empLabel11, gbcempPanel8);
	empPanel8.add(empLabel11);

	empRentalCustomerID = new JTextField();
	gbcempPanel8.gridx = 9;
	gbcempPanel8.gridy = 0;
	gbcempPanel8.gridwidth = 10;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 0;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empRentalCustomerID, gbcempPanel8);
	empPanel8.add(empRentalCustomerID);

	empLabel12 = new JLabel("Employee ID:");
	gbcempPanel8.gridx = 0;
	gbcempPanel8.gridy = 2;
	gbcempPanel8.gridwidth = 9;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 1;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empLabel12, gbcempPanel8);
	empPanel8.add(empLabel12);

	empRentalID2 = new JTextField();
	gbcempPanel8.gridx = 9;
	gbcempPanel8.gridy = 2;
	gbcempPanel8.gridwidth = 10;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 0;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empRentalID2, gbcempPanel8);
	empPanel8.add(empRentalID2);

	empLabel13 = new JLabel("# of Occupants:");
	gbcempPanel8.gridx = 0;
	gbcempPanel8.gridy = 4;
	gbcempPanel8.gridwidth = 9;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 1;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empLabel13, gbcempPanel8);
	empPanel8.add(empLabel13);

	empOccupantNumber = new JSpinner();
	gbcempPanel8.gridx = 9;
	gbcempPanel8.gridy = 4;
	gbcempPanel8.gridwidth = 10;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 0;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empOccupantNumber, gbcempPanel8);
	empPanel8.add(empOccupantNumber);

	empLabel14 = new JLabel("Start Date (YYYY-MM-DD):");
	gbcempPanel8.gridx = 0;
	gbcempPanel8.gridy = 6;
	gbcempPanel8.gridwidth = 9;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 1;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empLabel14, gbcempPanel8);
	empPanel8.add(empLabel14);

	empRentalStartDate = new JTextField();
	gbcempPanel8.gridx = 9;
	gbcempPanel8.gridy = 6;
	gbcempPanel8.gridwidth = 10;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 0;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empRentalStartDate, gbcempPanel8);
	empPanel8.add(empRentalStartDate);

	empLabel15 = new JLabel("End Date (YYYY-MM-DD):");
	gbcempPanel8.gridx = 0;
	gbcempPanel8.gridy = 8;
	gbcempPanel8.gridwidth = 9;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 1;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empLabel15, gbcempPanel8);
	empPanel8.add(empLabel15);

	empRentalEndDate = new JTextField();
	gbcempPanel8.gridx = 9;
	gbcempPanel8.gridy = 8;
	gbcempPanel8.gridwidth = 10;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 0;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empRentalEndDate, gbcempPanel8);
	empPanel8.add(empRentalEndDate);

	empLabel16 = new JLabel("Room Number:");
	gbcempPanel8.gridx = 0;
	gbcempPanel8.gridy = 10;
	gbcempPanel8.gridwidth = 9;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 1;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empLabel16, gbcempPanel8);
	empPanel8.add(empLabel16);

	empRentalRoomNumber = new JTextField();
	gbcempPanel8.gridx = 9;
	gbcempPanel8.gridy = 10;
	gbcempPanel8.gridwidth = 10;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 0;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empRentalRoomNumber, gbcempPanel8);
	empPanel8.add(empRentalRoomNumber);

	empRentRoomBtn = new JButton("Rent Room");
	empRentRoomBtn.setName("empInstantRental");
	gbcempPanel8.gridx = 0;
	gbcempPanel8.gridy = 12;
	gbcempPanel8.gridwidth = 19;
	gbcempPanel8.gridheight = 2;
	gbcempPanel8.fill = GridBagConstraints.BOTH;
	gbcempPanel8.weightx = 1;
	gbcempPanel8.weighty = 0;
	gbcempPanel8.anchor = GridBagConstraints.NORTH;
	gbempPanel8.setConstraints(empRentRoomBtn, gbcempPanel8);
	empPanel8.add(empRentRoomBtn);
	gbcempTabbedPanel2.gridx = 0;
	gbcempTabbedPanel2.gridy = 18;
	gbcempTabbedPanel2.gridwidth = 19;
	gbcempTabbedPanel2.gridheight = 18;
	gbcempTabbedPanel2.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel2.weightx = 1;
	gbcempTabbedPanel2.weighty = 0;
	gbcempTabbedPanel2.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel2.setConstraints(empPanel8, gbcempTabbedPanel2);
	empTabbedPanel2.add(empPanel8);
	empRentRoomBtn.addActionListener(controller);

	empPanel9 = new JPanel();
	empPanel9.setBorder(BorderFactory.createTitledBorder("Switch Booking & Rental Statuses"));
	GridBagLayout gbempPanel9 = new GridBagLayout();
	GridBagConstraints gbcempPanel9 = new GridBagConstraints();
	empPanel9.setLayout(gbempPanel9);

	empLabel8 = new JLabel("Booking ID:");
	gbcempPanel9.gridx = 0;
	gbcempPanel9.gridy = 0;
	gbcempPanel9.gridwidth = 8;
	gbcempPanel9.gridheight = 2;
	gbcempPanel9.fill = GridBagConstraints.BOTH;
	gbcempPanel9.weightx = 1;
	gbcempPanel9.weighty = 0;
	gbcempPanel9.anchor = GridBagConstraints.NORTH;
	gbempPanel9.setConstraints(empLabel8, gbcempPanel9);
	empPanel9.add(empLabel8);

	empBookingID = new JTextField();
	gbcempPanel9.gridx = 8;
	gbcempPanel9.gridy = 0;
	gbcempPanel9.gridwidth = 11;
	gbcempPanel9.gridheight = 2;
	gbcempPanel9.fill = GridBagConstraints.BOTH;
	gbcempPanel9.weightx = 1;
	gbcempPanel9.weighty = 0;
	gbcempPanel9.anchor = GridBagConstraints.NORTH;
	gbempPanel9.setConstraints(empBookingID, gbcempPanel9);
	empPanel9.add(empBookingID);

	empSwitchToRentalBtn = new JButton("Transfer to Rental");
	empSwitchToRentalBtn.setName("empSwitchToRental");
	gbcempPanel9.gridx = 0;
	gbcempPanel9.gridy = 4;
	gbcempPanel9.gridwidth = 19;
	gbcempPanel9.gridheight = 2;
	gbcempPanel9.fill = GridBagConstraints.BOTH;
	gbcempPanel9.weightx = 1;
	gbcempPanel9.weighty = 0;
	gbcempPanel9.anchor = GridBagConstraints.NORTH;
	gbcempPanel9.insets = new Insets(0,0,15,0);
	gbempPanel9.setConstraints(empSwitchToRentalBtn, gbcempPanel9);
	empPanel9.add(empSwitchToRentalBtn);
	empSwitchToRentalBtn.addActionListener(controller);

	empLabel9 = new JLabel("Employee ID:");
	gbcempPanel9.gridx = 0;
	gbcempPanel9.gridy = 2;
	gbcempPanel9.gridwidth = 8;
	gbcempPanel9.gridheight = 2;
	gbcempPanel9.fill = GridBagConstraints.BOTH;
	gbcempPanel9.weightx = 1;
	gbcempPanel9.weighty = 0;
	gbcempPanel9.anchor = GridBagConstraints.NORTH;
	gbempPanel9.setConstraints(empLabel9, gbcempPanel9);
	empPanel9.add(empLabel9);

	empRentalID1 = new JTextField();
	gbcempPanel9.gridx = 8;
	gbcempPanel9.gridy = 2;
	gbcempPanel9.gridwidth = 11;
	gbcempPanel9.gridheight = 2;
	gbcempPanel9.fill = GridBagConstraints.BOTH;
	gbcempPanel9.weightx = 1;
	gbcempPanel9.weighty = 0;
	gbcempPanel9.anchor = GridBagConstraints.NORTH;
	gbempPanel9.setConstraints(empRentalID1, gbcempPanel9);
	empPanel9.add(empRentalID1);

	empLabel10 = new JLabel("Rental ID:");
	gbcempPanel9.gridx = 0;
	gbcempPanel9.gridy = 6;
	gbcempPanel9.gridwidth = 8;
	gbcempPanel9.gridheight = 2;
	gbcempPanel9.fill = GridBagConstraints.BOTH;
	gbcempPanel9.weightx = 1;
	gbcempPanel9.weighty = 0;
	gbcempPanel9.anchor = GridBagConstraints.NORTH;
	gbempPanel9.setConstraints(empLabel10, gbcempPanel9);
	empPanel9.add(empLabel10);

	empRentalRentalID = new JTextField();
	gbcempPanel9.gridx = 8;
	gbcempPanel9.gridy = 6;
	gbcempPanel9.gridwidth = 11;
	gbcempPanel9.gridheight = 2;
	gbcempPanel9.fill = GridBagConstraints.BOTH;
	gbcempPanel9.weightx = 1;
	gbcempPanel9.weighty = 0;
	gbcempPanel9.anchor = GridBagConstraints.NORTH;
	gbempPanel9.setConstraints(empRentalRentalID, gbcempPanel9);
	empPanel9.add(empRentalRentalID);

	empTogglePaymentBtn = new JButton("Toggle Payment Status");
	empTogglePaymentBtn.setName("empTogglePayment");
	gbcempPanel9.gridx = 0;
	gbcempPanel9.gridy = 8;
	gbcempPanel9.gridwidth = 19;
	gbcempPanel9.gridheight = 2;
	gbcempPanel9.fill = GridBagConstraints.BOTH;
	gbcempPanel9.weightx = 1;
	gbcempPanel9.weighty = 0;
	gbcempPanel9.anchor = GridBagConstraints.NORTH;
	gbempPanel9.setConstraints(empTogglePaymentBtn, gbcempPanel9);
	empPanel9.add(empTogglePaymentBtn);
	gbcempTabbedPanel2.gridx = 19;
	gbcempTabbedPanel2.gridy = 18;
	gbcempTabbedPanel2.gridwidth = 19;
	gbcempTabbedPanel2.gridheight = 18;
	gbcempTabbedPanel2.fill = GridBagConstraints.BOTH;
	gbcempTabbedPanel2.weightx = 1;
	gbcempTabbedPanel2.weighty = 0;
	gbcempTabbedPanel2.anchor = GridBagConstraints.NORTH;
	gbempTabbedPanel2.setConstraints(empPanel9, gbcempTabbedPanel2);
	empTabbedPanel2.add(empPanel9);
	empTogglePaymentBtn.addActionListener(controller);
	
	empTabbedPane.addTab("Rental",empTabbedPanel2);
	gbcpanel_emp.gridx = 0;
	gbcpanel_emp.gridy = 0;
	gbcpanel_emp.gridwidth = 38;
	gbcpanel_emp.gridheight = 36;
	gbcpanel_emp.fill = GridBagConstraints.BOTH;
	gbcpanel_emp.weightx = 1;
	gbcpanel_emp.weighty = 1;
	gbcpanel_emp.anchor = GridBagConstraints.NORTH;
	gbpanel_emp.setConstraints(empTabbedPane, gbcpanel_emp);
	panels[1].add(empTabbedPane);
	gbcpanel0.gridx = 1;
	gbcpanel0.gridy = 1;
	gbcpanel0.gridwidth = 38;
	gbcpanel0.gridheight = 38;
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
public DefaultTableModel getEmpTableModel() {
	return this.empTableModel;
}
public DefaultTableModel getEmpBookTableModel() {
	return this.empBookTableModel;
}
public DefaultTableModel getEmpRentTableModel() {
	return this.empRentTableModel;
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

public String[] getEmpSearchFilters() {


	return new String[] {empSearchStartDate.getText(),
					  	 empSearchEndDate.getText(),
						 empSearchChain.getSelectedItem().toString(),
					 	 String.valueOf(empSearchIsAvailable.isSelected())};
}

public String getEmpRentalChain() {
	return new String(empRentalChain.getSelectedItem().toString());
}

public String[] getEmpTransferFilters() {


	return new String[] {empBookingID.getText(),
					 	 empRentalID1.getText()};
}

public String[] getEmpInstantRentFilters() {


	return new String[] {empRentalCustomerID.getText(),
					  	 empRentalID2.getText(),
					 	 empOccupantNumber.getValue().toString(),
					  	 empRentalStartDate.getText(),
					  	 empRentalEndDate.getText(),
					  	 empRentalRoomNumber.getText()};
}

public String getEmpRentID() {
	return this.empRentalRentalID.getText();
}


public JPanel[] getPanels() {
	return panels;
}


} 
