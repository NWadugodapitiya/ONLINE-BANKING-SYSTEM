import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.math.BigInteger;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Home extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();

    Home(){
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
//
        JLabel GClass = new JLabel(getGreeting());
        GClass.setBounds(359,19,350,48);
        GClass.setForeground(new Color(250, 250, 250,250));
        add(GClass);
        Font GrClass = new Font ("Segoe UI",Font.BOLD,36);
        GClass.setFont(GrClass);

        JLabel Uname = new JLabel ("");
        Uname.setBounds(366,66,285,20);
        Uname.setForeground(new Color(0, 0, 0,250));
        add(Uname);
        Font Usname = new Font ("Segoe UI",Font.BOLD,15);
        Uname.setFont(Usname);
//------------------------------------------------------------------------------------------------------------------------------
// outline
        JLabel boxoutline = new JLabel();
        add(boxoutline);

//       box 1 Withdraw

        JLabel b1i = new JLabel();
        b1i.setBounds(289,177,65,65);
        b1i.setIcon(new ImageIcon(getClass().getResource("Home/money-withdrawal.png")));
        add(b1i);

        JLabel b1l = new JLabel ("Withdraw");
        b1l.setBounds(288,257,69,20);
        b1l.setForeground(new Color(0, 0, 0,250));
        add(b1l);
        b1l.setFont(Usname);

        JLabel b1 = new JLabel();
        b1.setBounds(244,152,154,145);
        b1.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 377.png")));
        add(b1);

        b1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                boxoutline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                boxoutline.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 397.png")));
                boxoutline.setBounds(244,152,154,145);
            }
        });

        b1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                boxoutline.setBounds(0,0,0,0);
            }
        });

        b1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               Withdraw  Frame = new Withdraw ();
                dispose();
            }
        });
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
//       box 2 Deposit

        JLabel b2i = new JLabel();
        b2i.setBounds(540,180,65,65);
        b2i.setIcon(new ImageIcon(getClass().getResource("Home/fixed.png")));
        add(b2i);

        JLabel b2l = new JLabel ("Deposit");
        b2l.setBounds(545,259,54,20);
        b2l.setForeground(new Color(0, 0, 0,250));
        add(b2l);
        b2l.setFont(Usname);

        JLabel b2 = new JLabel();
        b2.setBounds(493,152,154,145);
        b2.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 377.png")));
        add(b2);

        b2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                boxoutline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                boxoutline.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 397.png")));
                boxoutline.setBounds(493,152,154,145);
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                boxoutline.setBounds(0,0,0,0);
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Deposit  Frame = new Deposit ();
                dispose();
            }
        });
//----------------------------------------------------------------------------------------------------------------------------------------------------------------
//       box 3 Funds Transfer

        JLabel b3i = new JLabel();
        b3i.setBounds(794,177,65,65);
        b3i.setIcon(new ImageIcon(getClass().getResource("Home/money-transfer.png")));
        add(b3i);

        JLabel b3l = new JLabel ("Funds Transfer ");
        b3l.setBounds(773,259,110,20);
        b3l.setForeground(new Color(0, 0, 0,250));
        add(b3l);
        b3l.setFont(Usname);

        JLabel b3 = new JLabel();
        b3.setBounds(742,152,154,145);
        b3.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 377.png")));
        add(b3);

        b3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                boxoutline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                boxoutline.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 397.png")));
                boxoutline.setBounds(742,152,154,145);
            }
        });

        b3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                boxoutline.setBounds(0,0,0,0);
            }
        });

        b3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Funds_Transfer  Frame = new Funds_Transfer ();
                dispose();
            }
        });
//------------------------------------------------------------------------------------------------------------------------------
//       box 4  ADD PAYEE

        JLabel b4i = new JLabel();
        b4i.setBounds(288,362,60,60);
        b4i.setIcon(new ImageIcon(getClass().getResource("Home/user (1).png")));
        add(b4i);

        JLabel b4l = new JLabel (" ADD PAYEE");
        b4l.setBounds(279,430,90,20);
        b4l.setForeground(new Color(0, 0, 0,250));
        add(b4l);
        b4l.setFont(Usname);

        JLabel b4 = new JLabel();
        b4.setBounds(244,328,154,145);
        b4.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 377.png")));
        add(b4);

        b4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                boxoutline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                boxoutline.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 397.png")));
                boxoutline.setBounds(244,328,154,145);
            }
        });

        b4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                boxoutline.setBounds(0,0,0,0);
            }
        });

        b4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                add_payees  Frame = new add_payees ();
                dispose();
            }
        });

//------------------------------------------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------------------------------------------
//       box 5  Balance

        JLabel b5l1 = new JLabel ("Balance");
        b5l1.setBounds(491,333,70,24);
        b5l1.setForeground(new Color(0, 0, 0,250));
        Font b5l11 = new Font ("Segoe UI",Font.BOLD,18);
        add(b5l1);
        b5l1.setFont(b5l11);

        JLabel b5l2 = new JLabel ("");
        b5l2.setBounds(757,347,119,24);
        b5l2.setForeground(new Color(0, 0, 0,250));
        add(b5l2);
        b5l2.setFont(b5l11);

        JLabel acc = new JLabel ("");
        acc.setBounds(521,357,130,20);
        acc.setForeground(new Color(0, 0, 0,250));
        add(acc);
        acc.setFont(text1);

        JLabel b5 = new JLabel();
        b5.setBounds(469,327,427,64);
        b5.setIcon(new ImageIcon(getClass().getResource("Home/Rectangle 327.png")));
        add(b5);

        b5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                boxoutline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                boxoutline.setIcon(new ImageIcon(getClass().getResource("Home/kljkklkjl.png")));
                boxoutline.setBounds(469,327,427,64);
            }
        });

        b5.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                boxoutline.setBounds(0,0,0,0);
            }
        });

//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banking_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM user  WHERE user_id = "+Integer.parseInt(UID));
            while(rs.next()){

                float balance = rs.getFloat("balance");
                String ac = rs.getString("account_no");
                String ag= rs.getString("full_name");

                b5l2.setText(String.format("%.2f",balance));
                acc.setText(ac);
                Uname.setText(ag);

            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Home/1.png")));
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
    private String getGreeting() {
        LocalTime currentTime = LocalTime.now();
        String greeting;

        if (currentTime.isAfter(LocalTime.of(0, 0)) && currentTime.isBefore(LocalTime.of(12, 0))) {
            greeting = "Good Morning";
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(17, 0))) {
            greeting = "Good Afternoon";
        } else if (currentTime.isAfter(LocalTime.of(17, 0)) && currentTime.isBefore(LocalTime.of(20, 0))) {
            greeting = "Good Evening";
        } else {
            greeting = "Good Night";
        }
        return greeting;
    }
}
