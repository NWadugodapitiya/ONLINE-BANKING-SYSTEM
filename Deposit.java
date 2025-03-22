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
                    con = DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");

                    String query = "insert into login_infor (User_NIC,Password,Date_time,login_and_logout)" + " values (?,?,?,?)";
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

        JTextField t2 = new JTextField();
        t2.setBounds (276,231,305,28);
        t2.setForeground(Color.BLACK);
        t2.setBackground(new Color(101, 52, 216, 0));
        t2.setBorder(null);
        t2.setEditable(true);
        t2.setOpaque(false);
        add(t2);
        t2.setFont(Atet2);

        JTextField t3 =new JTextField();
        t3.setBounds(277,283,305,28);
        t3.setForeground(Color.black);
        t3.setBorder(null);
        t3.setEditable(true);
        t3.setOpaque(false);
        add(t3);
        t3.setFont(Atet2);

        JLabel L1 = new JLabel ("Amount");
        L1.setBounds(276,179,64,20);
        L1.setForeground(new Color(104, 104, 104, 255));
        add(L1);
        L1.setFont(Atet2);

        JLabel L2 = new JLabel ("My reference");
        L2.setBounds(276,236,109,20);
        L2.setForeground(new Color(104, 104, 104, 255));
        add(L2);
        L2.setFont(Atet2);

        JLabel L3 = new JLabel ("Receiver Reference");
        L3.setBounds(277,288,164,20);
        L3.setForeground(new Color(112, 112, 112, 255));
        add(L3);
        L3.setFont(Atet2);

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

        DocumentListener documentListenert2 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    L2.setBounds(276,236,109,20);
                } else{
                    L2.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    L2.setBounds(276,236,109,20);
                } else{
                    L2.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    L2.setBounds(276,236,109,20);
                } else{
                    L2.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t2.getText());

            }
        };
        t2.getDocument().addDocumentListener(documentListenert2);

        DocumentListener documentListenert3 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    L3.setBounds(277,288,164,20);
                } else{
                    L3.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    L3.setBounds(277,288,164,20);
                } else{
                    L3.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    L3.setBounds(277,288,164,20);
                } else{
                    L3.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t3.getText());

            }
        };
        t3.getDocument().addDocumentListener(documentListenert3);

//------------------------------------------------------------------------------------------------------------------------------
        JComboBox dura = new JComboBox();
        dura.setBounds(680,176,234,28);
        dura.setForeground(new Color(112, 112, 112, 255));
        dura.addItem("         Select payees");
        dura.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        add(dura);
        dura.setFont(Atet2);

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("select Nick_name from payees  WHERE user_nic = "+Integer.parseInt(UID));

            while(rs.next()){
                dura.addItem(rs.getString("Nick_name"));
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }

        JLabel payto = new JLabel();

        dura.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");
                    Statement st = (Statement) con.createStatement ();
                    ResultSet rs = st.executeQuery("SELECT * FROM payees WHERE Nick_name = '"+(String)dura.getSelectedItem()+"'");
                    while(rs.next()){
                        String na= rs.getString("Account_number");
                        payto.setText(na);
                    }
                }
                catch(Exception ew){
                    System.out.println(ew);
                }
            }
        });
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
JLabel account_num =new JLabel();  // Pay_from


        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("select Account_number from user_register  WHERE user_nic = "+Integer.parseInt(UID));
            while(rs.next()){
                String ac= rs.getString("Account_number");
                account_num.setText(ac);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }


        addpay.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                if (t1.getText().isEmpty() || t2.getText().isEmpty() || t3.getText().isEmpty() || dura.getSelectedItem().equals("Select the bank")) {
                    JOptionPane.showMessageDialog(null, "Type Amount | Select the bank | Type My reference | Type Receiver Reference", "Type Items", JOptionPane.WARNING_MESSAGE);
                } else {

                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");

                        String userRegisterQuery = "INSERT INTO all_transactions (user_nic,Pay_from, Pay_to,Amount,Reciver_reference,Your_reference,Date_time,Status) VALUES (?, ?, ?, ?, ?, ?, ?,?)";
                        PreparedStatement userRegisterStmt = con.prepareStatement(userRegisterQuery);

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                        String formattedDate = myDateObj.format(myFormatObj);
                        System.out.println("Date and Time: " + formattedDate);

                        userRegisterStmt.setString(1, (UID));
                        userRegisterStmt.setString(2, account_num.getText()); //  Pay_from
                        userRegisterStmt.setString(3, payto.getText());   //   Pay_to
                        userRegisterStmt.setString(4, t1.getText());  //  Amount
                        userRegisterStmt.setString(5, t3.getText());  // Reciver_reference
                        userRegisterStmt.setString(6, t2.getText());  // Your_reference
                        userRegisterStmt.setString(7, formattedDate);  // Date_time
                        userRegisterStmt.setString(8, ("Deposit"));  // Status


                        userRegisterStmt.execute();
                        JOptionPane.showMessageDialog(null, "Deposit success", "Deposit OK", JOptionPane.WARNING_MESSAGE);

                        Home Frame = new Home();
                        dispose();

                        con.close();

                    }catch (ClassNotFoundException | SQLException en){
                        System.err.println("Got an excepttion!");
                        System.err.println(en.getMessage());

                    }
                }

            }
        });

//-------------------------------------------------------------------------------------------------------------------------------







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