import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();


    User(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------
        Font text1 = new Font ("Segoe UI",Font.BOLD,15);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        Font Atet1 = new Font ("Arial Rounded MT",Font.BOLD,17);
        Font Qq022 = new Font ("Segoe UI",Font.PLAIN,18);
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
                    preparedStmt.setString(4, formattedDate);
                    preparedStmt.setString(5, "Logout");
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
        T1.setForeground(new Color(104, 104, 104, 255));
        add(T1);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("All Transactions");
        T2.setBounds(51,180,115,20);
        T2.setForeground(new Color(112, 112, 112, 255));
        add(T2);
        T2.setFont(text1);

        JLabel T3 = new JLabel ("User");
        T3.setBounds(51,223,32,20);
        T3.setForeground(new Color(0, 0, 0, 255));
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
                T1.setForeground(new Color(0, 0, 0,250));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                T1.setForeground(new Color(112, 112, 112, 255));
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
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
            }
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
        JLabel q022 = new JLabel ("User NIC                       =");
        q022.setBounds(309,72,200,24);
        q022.setForeground(Color.BLACK);
        add(q022);
        q022.setFont(Qq022);

        JTextField A1 = new JTextField();
        A1.setBounds (532,72,305,28);
        A1.setForeground(Color.BLACK);
        A1.setBackground(new Color(101, 52, 216, 0));
        A1.setBorder(null);
        A1.setEditable(true);
        A1.setOpaque(false);
        add(A1);
        A1.setFont(Atet1);

        JLabel q03 = new JLabel ("Full Name                     =");
        q03.setBounds(309,120,200,24);
        q03.setForeground(Color.BLACK);
        add(q03);
        q03.setFont(Qq022);

        JTextField A2 = new JTextField();
        A2.setBounds (532,120,305,28);
        A2.setForeground(Color.BLACK);
        A2.setBackground(new Color(101, 52, 216, 0));
        A2.setBorder(null);
        A2.setEditable(true);
        A2.setOpaque(false);
        add(A2);
        A2.setFont(Atet1);

        JLabel q04 = new JLabel ("Email                            =");
        q04.setBounds(309,168,200,24);
        q04.setForeground(Color.BLACK);
        add(q04);
        q04.setFont(Qq022);

        JTextField A3 = new JTextField();
        A3.setBounds (532,168,305,28);
        A3.setForeground(Color.BLACK);
        A3.setBackground(new Color(101, 52, 216, 0));
        A3.setBorder(null);
        A3.setEditable(true);
        A3.setOpaque(false);
        add(A3);
        A3.setFont(Atet1);

        JLabel q05 = new JLabel ("Address                        =");
        q05.setBounds(309,216,200,24);
        q05.setForeground(Color.BLACK);
        add(q05);
        q05.setFont(Qq022);

        JTextField A4 = new JTextField();
        A4.setBounds (532,216,305,28);
        A4.setForeground(Color.BLACK);
        A4.setBackground(new Color(101, 52, 216, 0));
        A4.setBorder(null);
        A4.setEditable(true);
        A4.setOpaque(false);
        add(A4);
        A4.setFont(Atet1);

        JLabel q06 = new JLabel ("Telephone Number      =");
        q06.setBounds(309,264,200,24);
        q06.setForeground(Color.BLACK);
        add(q06);
        q06.setFont(Qq022);

        JTextField A5 = new JTextField();
        A5.setBounds (532,264,305,28);
        A5.setForeground(Color.BLACK);
        A5.setBackground(new Color(101, 52, 216, 0));
        A5.setBorder(null);
        A5.setEditable(true);
        A5.setOpaque(false);
        add(A5);
        A5.setFont(Atet1);

        JLabel q07 = new JLabel ("Date of birth                 =");
        q07.setBounds(309,312,200,24);
        q07.setForeground(Color.BLACK);
        add(q07);
        q07.setFont(Qq022);

        JTextField A6 = new JTextField();
        A6.setBounds (532,312,305,28);
        A6.setForeground(Color.BLACK);
        A6.setBackground(new Color(101, 52, 216, 0));
        A6.setBorder(null);
        A6.setEditable(true);
        A6.setOpaque(false);
        add(A6);
        A6.setFont(Atet1);

        JLabel q08 = new JLabel ("Change Password         =");
        q08.setBounds(309,360,200,24);
        q08.setForeground(Color.BLACK);
        add(q08);
        q08.setFont(Qq022);

        JTextField A7 = new JTextField();
        A7.setBounds (532,358,305,28);
        A7.setForeground(Color.BLACK);
        A7.setBackground(new Color(101, 52, 216, 0));
        A7.setBorder(null);
        A7.setEditable(true);
        A7.setOpaque(false);
        add(A7);
        A7.setFont(Atet1);

        JLabel q09 = new JLabel ("Last Update  = ");
        q09.setBounds(228,447,220,20);
        q09.setForeground(Color.BLACK);
        add(q09);
        Font Qq09 = new Font ("Segoe UI",Font.PLAIN,12);
        q09.setFont(Qq09);
//------------------------------------------------------------------------------------------------------------------------------

        JLabel update = new JLabel();
        update.setIcon(new ImageIcon(getClass().getResource("Home/Update.png")));
        update.setBounds(750,437,104,28);
        add(update);

        JLabel updatex = new JLabel();
        updatex.setIcon(new ImageIcon(getClass().getResource("Home/Update_B.png")));
        add(updatex);

        update.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                updatex.setBounds(748,434,108,34);
                update.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        update.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                updatex.setBounds(0,0,0,0);
            }
        });
// ------------------------------------------------------------------------------------------------------------------------------




        //------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");
            Statement st = (Statement) con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM user_register WHERE user_nic = "+Integer.parseInt(UID));

            while(rs.next()){

                String user_nic= rs.getString("user_nic");
                String name= rs.getString("full_name");
                String email= rs.getString("email");
                String address= rs.getString("Address");
                String tel1= rs.getString("Tel1");
                String date_of_birth= rs.getString("date_of_birth");
                String password= rs.getString("password");
                String update_date= rs.getString("update_date");

                A1.setText(user_nic);
                A2.setText(name);
                A3.setText(email);
                A4.setText(address);
                A5.setText(tel1);
                A6.setText(date_of_birth);
                A7.setText(password);
                q09.setText("Last Update  =  "+ update_date);

            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }


        update.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                PreparedStatement pst;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");

                    java.sql.Statement stmt = con.createStatement();
                    pst = con.prepareStatement("update user_register set full_name=?,email=?,Address=?,Tel1=?,date_of_birth=?,password=?,update_date=? WHERE user_nic ="+Integer.parseInt(UID));

                    LocalDateTime myDateObj = LocalDateTime.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                    String formattedDate = myDateObj.format(myFormatObj);
                    System.out.println("Date and Time: " + formattedDate);

                    {

                        pst.setString(1, A2.getText());
                        pst.setString(2, A3.getText());
                        pst.setString(3, A4.getText());
                        pst.setString(4, A5.getText());
                        pst.setString(5, A6.getText());
                        pst.setString(6, A7.getText());
                        pst.setString(7, formattedDate);


                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "update ok","success",JOptionPane.WARNING_MESSAGE);

                        User Frame = new User();
                        dispose();

                    }
                    stmt.close();
                    con.close();
                }catch (Exception eo){
                    System.out.println(eo);
                }

            }
        });


//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Home/3.png")));
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
