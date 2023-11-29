import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deposit extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();

    Deposit(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
        Font text1 = new Font ("Segoe UI",Font.BOLD,15);
        Font Exit = new Font ("calibri",Font.BOLD,18);

//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.BLACK);
        add(exit);
        exit.setFont(Exit);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Home/exit.png")));
        add(a2);
//------------------------------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                a2.setBounds(896,468,60,25);
                exit.setForeground(Color.WHITE);
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                a2.setBounds(0,0,0,0);
                exit.setForeground(Color.BLACK);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel login = new JLabel();
        login.setIcon(new ImageIcon(getClass().getResource("Home/Logout.png")));
        login.setBounds(24,450,105,29);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Home/Logout x.png")));
        //    loginx.setBounds(61,337,166,59);
        add(loginx);

        login.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                loginx.setBounds(21,448,111,33);

            }
        });

        login.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                loginx.setBounds(0,0,0,0);
            }
        });
// ------------------------------------------------------------------------------------------------------------------------------

        login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Logout success","Logout ok ",JOptionPane.WARNING_MESSAGE);
                Connection con;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost/banking_system","root","");

                    String query = "insert into login_infor (user_id,Password,Date_time,login_and_logout)" + " values (?,?,?,?)";
                    PreparedStatement preparedStmt = con.prepareStatement(query);

                    LocalDateTime myDateObj = LocalDateTime.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                    String formattedDate = myDateObj.format(myFormatObj);
                    System.out.println("Date and Time: " + formattedDate);


                    preparedStmt.setString(1, (UID));
                    preparedStmt.setString(2,  (""));
                    preparedStmt.setString(3, formattedDate);
                    preparedStmt.setString(4, "Logout");
                    preparedStmt.execute();

                    login Frame = new login();
                    dispose();

                    con.close();
                }
                catch (ClassNotFoundException | SQLException en)
                {
                    System.err.println("Got an excepttion!");
                    System.err.println(en.getMessage());

                }
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
////------------------------------------------------------------------------------------------------------------------------------
        JLabel in = new JLabel();
        in.setIcon(new ImageIcon(getClass().getResource("Home/Group 18.png")));
        in.setBounds(23,140,18,144);
        add(in);
////------------------------------------------------------------------------------------------------------------------------------
        JLabel T1 = new JLabel ("Home");
        T1.setBounds(51,140,43,20);
        T1.setForeground(new Color(0, 0, 0, 255));
        add(T1);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("All Transactions");
        T2.setBounds(51,180,115,20);
        T2.setForeground(new Color(104, 104, 104, 255));
        add(T2);
        T2.setFont(text1);

        JLabel T3 = new JLabel ("User");
        T3.setBounds(51,223,32,20);
        T3.setForeground(new Color(112, 112, 112, 255));
        add(T3);
        T3.setFont(text1);

        JLabel T4 = new JLabel ("Contact");
        T4.setBounds(51,266,55,20);
        T4.setForeground(new Color(112, 112, 112, 255));
        add(T4);
        T4.setFont(text1);

////======================================================================================================================
        T1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Home  Frame = new Home ();
                dispose();
            }
        });

////======================================================================================================================
        T2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T2.setForeground(new Color(0, 0, 0,250));
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                T2.setForeground(new Color(112, 112, 112, 255));}
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                All_Transactions   Frame = new All_Transactions ();
                dispose();
            }
        });


////======================================================================================================================
        T3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T3.setForeground(new Color(0, 0, 0,250));
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                T3.setForeground(new Color(112, 112, 112, 255));}
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                User  Frame = new User ();
                dispose();
            }
        });
////======================================================================================================================
        T4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                T4.setForeground(new Color(0, 0, 0,250));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                T4.setForeground(new Color(112, 112, 112, 255));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Contact  Frame = new Contact ();
                dispose();
            }
        });
////======================================================================================================================

        JLabel prof = new JLabel();
        prof.setIcon(new ImageIcon(getClass().getResource("Home/profile 01.png")));
        prof.setBounds(57,30,72,72);
        add(prof);

        JLabel profl = new JLabel();
        profl.setIcon(new ImageIcon(getClass().getResource("Home/profile.png")));
        add(profl);

//======================================================================================================================

        prof.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                profl.setIcon(new ImageIcon(getClass().getResource("Home/profile.png")));
                profl.setBounds(55,28,76,76);
                prof.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        prof.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                prof.setIcon(new ImageIcon(getClass().getResource("Home/profile 01.png")));
                profl.setBounds(0,0,0,0);

            }
        });
//----------------------------------------------------------------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------------------------------------------------------------------------------------
        Font GrClass = new Font ("Segoe UI",Font.BOLD,41);
        Font Qq022 = new Font ("Segoe UI",Font.BOLD,25);
        Font Atet2 = new Font ("Arial Rounded MT",Font.BOLD,17);


        JLabel GClass = new JLabel (" Deposit");
        GClass.setBounds(226,18,170,54);
        GClass.setForeground(new Color(0, 0, 0, 255));
        add(GClass);
        GClass.setFont(GrClass);

        JTextField t1 = new JTextField();
        t1.setBounds (277,175,305,28);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(101, 52, 216, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        t1.setFont(Atet2);


        JLabel L1 = new JLabel ("Amount");
        L1.setBounds(276,179,64,20);
        L1.setForeground(new Color(104, 104, 104, 255));
        add(L1);
        L1.setFont(Atet2);


        DocumentListener documentListenert1 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    L1.setBounds(276,179,64,20);
                } else{
                    L1.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    L1.setBounds(276,179,64,20);
                } else{
                    L1.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    L1.setBounds(276,179,64,20);
                } else{
                    L1.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t1.getText());

            }
        };
        t1.getDocument().addDocumentListener(documentListenert1);


//===============================================================================================================================


        JComboBox dura = new JComboBox();
        dura.setBounds(680,176,234,28);
        dura.setForeground(new Color(112, 112, 112, 255));
        dura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dura.addItem("Select Account");
        add(dura);
        dura.setFont(Atet2);


//------------------------------------------------------------------------------------------------------------------------------
        JLabel bu = new JLabel ("Deposit Now");
        bu.setBounds(744,439,101,24);
        bu.setForeground(new Color(255, 255, 255, 255));
        add(bu);
        bu.setFont(Atet2);

        JLabel addpay = new JLabel();
        addpay.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 316.png")));
        addpay.setBounds(727,431,136,46);
        add(addpay);

        JLabel addpay2 = new JLabel();
        addpay2.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 347.png")));
        add(addpay2);

        addpay.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                addpay.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                bu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                addpay2.setBounds(733,434,123,34);
            }
        });

        addpay.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                addpay2.setBounds(0,0,0,0);
            }
        });

//===============================================================================================================================
            JLabel usernic = new JLabel();
            JLabel accountno = new JLabel();
            JLabel balancemy = new JLabel();
            JLabel updatae_balance = new JLabel();
        JLabel paytoalance = new JLabel();
        JLabel payto_updatae_balance = new JLabel();
//===============================================================================================================================

        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banking_system", "root", "");
            Statement st = con.createStatement();

            // Fetch user details based on user_id
            ResultSet rs = st.executeQuery("SELECT * FROM user WHERE user_id = " + Integer.parseInt(UID));
            while (rs.next()) {
                String name = rs.getString("user_nic");
                String address = rs.getString("account_no");
                String balance = rs.getString("balance");
                usernic.setText(name);
                accountno.setText(address);
                balancemy.setText(balance);
            }

            // Fetch account numbers based on user_nic
            ResultSet rss = st.executeQuery("SELECT * FROM user WHERE user_nic = '" + usernic.getText() + "'");
            while (rss.next()) {
                dura.addItem(rss.getString("account_no"));
            }

            // Close the resources
            rs.close();
            rss.close();
            st.close();
            con.close();
        } catch (Exception ew) {
            ew.printStackTrace(); // Print the exception stack trace for debugging
        }
//===============================================================================================================================

        dura.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/banking_system","root","");
                    Statement st = (Statement) con.createStatement ();
                    ResultSet rs = st.executeQuery("SELECT * FROM user WHERE account_no = '"+(String)dura.getSelectedItem()+"'");

                    while(rs.next()){
                        String na= rs.getString("balance");
                        paytoalance.setText(na);
                    }
                }
                catch(Exception ew){
                    System.out.println(ew);
                }
            }
        });





//------------------------------------------------------------------------------------------------------------------------------
        addpay.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) { // Check if left mouse button is clicked
                    try {
                        // Extracting and parsing data from the UI
                        int balanceToAdd = Integer.parseInt(t1.getText());
                        int payToBalance = Integer.parseInt(paytoalance.getText());

                        // Update payto_updatae_balance
                        payToBalance += balanceToAdd;
                        payto_updatae_balance.setText(String.valueOf(payToBalance));

                        // Extracting and parsing data for the user's balance
                        int myBalance = Integer.parseInt(balancemy.getText());
                        int amountToSubtract = Integer.parseInt(t1.getText());

                        // Check if there's a valid amount to subtract
                        if (amountToSubtract <= 0) {
                            JOptionPane.showMessageDialog(null, "Please enter a valid amount to subtract.");
                            return;
                        }

                        // Check if sufficient balance to subtract
                        if (myBalance >= amountToSubtract) {
                            myBalance -= amountToSubtract;
                            balancemy.setText(String.valueOf(myBalance));

                            // Database operations
                            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banking_system", "root", "")) {
                                String insertTransactionQuery = "INSERT INTO transaction_history (user_id, pay_from, pay_to, balance, date_time, status) VALUES (?, ?, ?, ?, ?, ?)";

                                try (PreparedStatement transactionStmt = con.prepareStatement(insertTransactionQuery)) {
                                    LocalDateTime now = LocalDateTime.now();
                                    String formattedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(now);

                                    // Set parameters for the transaction
                                    transactionStmt.setString(1, UID);
                                    transactionStmt.setString(2, accountno.getText());
                                    transactionStmt.setString(3, (String) dura.getSelectedItem());
                                    transactionStmt.setInt(4, balanceToAdd);
                                    transactionStmt.setString(5, formattedDate);
                                    transactionStmt.setString(6, "Deposit");

                                    int rowsAffected = transactionStmt.executeUpdate();

                                    if (rowsAffected > 0) {
                                        JOptionPane.showMessageDialog(null, "Deposit success", "Deposit OK", JOptionPane.WARNING_MESSAGE);

                                        // Update user balance
                                        String updateUserBalanceQuery = "UPDATE user SET balance=? WHERE user_id=?";
                                        try (PreparedStatement updateUserStmt = con.prepareStatement(updateUserBalanceQuery)) {
                                            updateUserStmt.setInt(1, myBalance);
                                            updateUserStmt.setString(2, UID);
                                            updateUserStmt.executeUpdate();
                                        }

                                        // Update payee's balance
                                        String updatePayToBalanceQuery = "UPDATE user SET balance=? WHERE account_no=?";
                                        try (PreparedStatement updatePayToStmt = con.prepareStatement(updatePayToBalanceQuery)) {
                                            updatePayToStmt.setInt(1, payToBalance);
                                            updatePayToStmt.setString(2, (String) dura.getSelectedItem());
                                            updatePayToStmt.executeUpdate();
                                        }

                                        // Close connections
                                        con.close();

                                        // Open new Home frame and dispose of the current one
                                        Home frame = new Home();
                                        dispose();


                                    } else {
                                        JOptionPane.showMessageDialog(null, "Deposit failed", "Deposit Error", JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Insufficient balance. Cannot Deposit.");
                        }
                    } catch (NumberFormatException ex) {
                        // Handle the case where the input is not a valid number
                        JOptionPane.showMessageDialog(null, "Please enter a valid number for the amount.");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();
                    }
                }
            }
        });














//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Home/8.png")));
        add(a);
//------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------------------------

        setSize (950,502);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(21,21,21,0));
        setVisible(true);
    }


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        for(UIManager.LookAndFeelInfo lafInfo : UIManager.getInstalledLookAndFeels()){
        }
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        login Frame = new login();

        Frame.addMouseListener(new MouseListener(){
            public void mouseReleased(MouseEvent e) {

            }
            public void mousePressed(MouseEvent e) {
                mouseDownScreenCoords = e.getLocationOnScreen();
                mouseDownCompCoords = e.getPoint();
            }
            public void mouseExited(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseClicked(MouseEvent e) {
            }
        });
        Frame.addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent e) {
            }
            public void mouseDragged(MouseEvent e) {


                Point currCoords = e.getLocationOnScreen();
                Frame.setLocation(mouseDownScreenCoords.x + (currCoords.x -
                                mouseDownScreenCoords.x) - mouseDownCompCoords.x,
                        mouseDownScreenCoords.y + (currCoords.y -
                                mouseDownScreenCoords.y) - mouseDownCompCoords.y);
            }
        });
    }
}