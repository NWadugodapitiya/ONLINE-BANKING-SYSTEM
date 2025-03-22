import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Funds_Transfer extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String UID = login.userid();


    Funds_Transfer(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.BLACK);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
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

                    String query = "insert into login_infor (User_id,Password,Date_time,login_and_logout)" + " values (?,?,?,?)";
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
//------------------------------------------------------------------------------------------------------------------------------

        JLabel i1 = new JLabel();
        i1.setIcon(new ImageIcon(getClass().getResource("Home/Dashboard.png")));
        i1.setBounds(21,99,16,15);
        add(i1);

        JLabel i2 = new JLabel();
        i2.setIcon(new ImageIcon(getClass().getResource("Home/B Teachers.png")));
        i2.setBounds(21,139,15,17);
        add(i2);

        JLabel i3 = new JLabel();
        i3.setIcon(new ImageIcon(getClass().getResource("Home/Library.png")));
        i3.setBounds(21,186,16,12);
        add(i3);

        JLabel i4 = new JLabel();
        i4.setIcon(new ImageIcon(getClass().getResource("Home/Students.png")));
        i4.setBounds(21,227,10,14);
        add(i4);

        JLabel i5 = new JLabel();
        i5.setIcon(new ImageIcon(getClass().getResource("Home/Massage.png")));
        i5.setBounds(21,271,18,10);
        add(i5);

//------------------------------------------------------------------------------------------------------------------------------
        JLabel T1 = new JLabel ("Home");
        T1.setBounds(42,94,45,20);
        T1.setForeground(new Color(104, 104, 104, 255));
        add(T1);
        Font text1 = new Font ("Segoe UI",Font.BOLD,15);
        T1.setFont(text1);

        JLabel T2 = new JLabel ("Funds Transfer ");
        T2.setBounds(42,138,110,20);
        T2.setForeground(new Color(0, 0, 0, 255));
        add(T2);
        Font text2 = new Font ("Segoe UI",Font.BOLD,15);
        T2.setFont(text2);

        JLabel T3 = new JLabel ("All Transactions");
        T3.setBounds(42,180,113,20);
        T3.setForeground(new Color(112, 112, 112, 255));
        add(T3);
        Font text3 = new Font ("Segoe UI",Font.BOLD,15);
        T3.setFont(text3);

        JLabel T4 = new JLabel ("User");
        T4.setBounds(42,223,35,20);
        T4.setForeground(new Color(112, 112, 112, 255));
        add(T4);
        Font text4 = new Font ("Segoe UI",Font.BOLD,15);
        T4.setFont(text4);

        JLabel T5 = new JLabel ("Contact");
        T5.setBounds(42,264,56,20);
        T5.setForeground(new Color(112, 112, 112, 255));
        add(T5);
        Font text5 = new Font ("Segoe UI",Font.BOLD,15);
        T5.setFont(text5);


//======================================================================================================================
        T1.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                i1.setIcon(new ImageIcon(getClass().getResource("Home/B Dashboard.png")));
                T1.setForeground(new Color(0, 0, 0,250));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i1.setIcon(new ImageIcon(getClass().getResource("Home/Dashboard.png")));
                T1.setForeground(new Color(112, 112, 112, 255));
            }
        });

        T1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Home  Frame = new Home ();
                dispose();
            }
        });

//======================================================================================================================
        T2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                T2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
            }
        });

        T2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Funds_Transfer   Frame = new Funds_Transfer ();
                dispose();
            }
        });

//======================================================================================================================
        T3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i3.setIcon(new ImageIcon(getClass().getResource("Home/B Library.png")));
                T3.setForeground(new Color(0, 0, 0,250));
                T3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i3.setIcon(new ImageIcon(getClass().getResource("Home/Library.png")));
                T3.setForeground(new Color(112, 112, 112, 255));}
        });

        T3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                All_Transactions  Frame = new All_Transactions ();
                dispose();
            }
        });
//======================================================================================================================
        T4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Home/B Students.png")));
                T4.setForeground(new Color(0, 0, 0,250));
                T4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i4.setIcon(new ImageIcon(getClass().getResource("Home/Students.png")));
                T4.setForeground(new Color(112, 112, 112, 255));
            }
        });

        T4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                User  Frame = new User ();
                dispose();
            }
        });
//======================================================================================================================
        T5.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                i5.setIcon(new ImageIcon(getClass().getResource("Home/B Massage.png")));
                T5.setForeground(new Color(0, 0, 0,250));
                T5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                i5.setIcon(new ImageIcon(getClass().getResource("Home/Massage.png")));
                T5.setForeground(new Color(112, 112, 112, 255));}
        });

        T5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Contact  Frame = new Contact ();
                dispose();
            }
        });
//======================================================================================================================


        JLabel prof = new JLabel();
        prof.setIcon(new ImageIcon(getClass().getResource("Home/profile 01.png")));
        prof.setBounds(815,52,72,72);
        add(prof);

        JLabel profl = new JLabel();
        profl.setIcon(new ImageIcon(getClass().getResource("Home/profile.png")));
        add(profl);

//======================================================================================================================

        prof.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                profl.setIcon(new ImageIcon(getClass().getResource("Home/profile.png")));
                profl.setBounds(813,50,76,76);
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



//------------------------------------------------------------------------------------------------------------------------------
        JLabel GClass = new JLabel ("Pay From");
        GClass.setBounds(216,73,83,26);
        GClass.setForeground(new Color(0, 0, 0, 255));
        add(GClass);
        Font GrClass = new Font ("Segoe UI",Font.BOLD,16);
        GClass.setFont(GrClass);

        JComboBox duraw = new JComboBox();
        duraw.setBounds(263,98,260,20);
        duraw.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        duraw.setForeground(Color.BLACK);
        duraw.setBackground(Color.white);
        duraw.addItem("Select Account");
        add(duraw);
        Font duraaww = new Font ("Arial Rounded MT",Font.PLAIN,11);
        duraw.setFont(duraaww);


        JLabel cat1 = new JLabel ("Pay To");
        cat1.setBounds(216,144,58,26);
        cat1.setForeground(new Color(0, 0, 0,250));
        add(cat1);
        Font calandertext = new Font ("Segoe UI",Font.BOLD,16);
        cat1.setFont(calandertext);

        JComboBox duraw1 = new JComboBox();
        duraw1.setBounds(263,167,260,20);
        duraw1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        duraw1.setForeground(Color.BLACK);
        duraw1.setBackground(Color.white);
        duraw1.addItem("Select Account");
        add(duraw1);
        Font duraaww1 = new Font ("Arial Rounded MT",Font.PLAIN,11);
        duraw1.setFont(duraaww1);



        JLabel subject = new JLabel ("Amount");
        subject.setBounds(209,254,70,18);
        subject.setForeground(new Color(104, 104, 104, 255));
        add(subject);
        Font subject1 = new Font ("Segoe UI",Font.BOLD,16);
        subject.setFont(subject1);

        JLabel subjecttext = new JLabel ("Receiver Reference");
        subjecttext.setBounds(209,301,155,18);
        subjecttext.setForeground(new Color(104, 104, 104, 255));
        add(subjecttext);
        Font subjecttext1 = new Font ("Segoe UI",Font.BOLD,16);
        subjecttext.setFont(subjecttext1);

        JLabel lessons = new JLabel ("My reference");
        lessons.setBounds(209,346,103,18);
        lessons.setForeground(new Color(104, 104, 104, 255));
        add(lessons);
        Font lessons1 = new Font ("Segoe UI",Font.BOLD,16);
        lessons.setFont(lessons1);


        JLabel l3 = new JLabel ("Pay Now");
        l3.setForeground(new Color(0, 0, 0, 255));
        l3.setBounds(611,411,81,26);
        add(l3);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,19);
        l3.setFont(Atel3);

// ------------------------------------------------------------------------------------------------------------------------------
        JPanel b2 = new JPanel();
        b2.setBounds(595,64,120,106);
        b2.setBackground(new Color(21,21,21,0));
        add(b2);

        JPanel b3 = new JPanel();
        b3.setBounds(586,406,129,36);
        b3.setBackground(new Color(21,21,21,0));
        add(b3);



        JLabel www = new JLabel();
        add(www);

        b2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                add_payees Frame = new add_payees();
                dispose();
            }
        });

////------------------------------------------------------------------------------------------------------------------------------
        b2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                www.setIcon(new ImageIcon(getClass().getResource("Home/qwq.png")));
                www.setBounds(589,61,132,118);
                www.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                www.setBounds(0,0,0,0);
            }
        });

        b3.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                www.setIcon(new ImageIcon(getClass().getResource("Home/332sdcsd.png")));
                www.setBounds(580, 403, 141, 48);
                www.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        b3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                www.setBounds(0,0,0,0);
            }
        });
////----------------------------------------------------------------------------------------------------------------------------------------------------------------
        JTextField t1 = new JTextField();
        t1.setBounds (209,254,314,29);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(101, 52, 216, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        Font Atetl = new Font ("calibri",Font.BOLD,16);
        t1.setFont(Atetl);

        JTextField t2 = new JTextField();
        t2.setBounds (209,300,314,29);
        t2.setForeground(Color.BLACK);
        t2.setBackground(new Color(101, 52, 216, 0));
        t2.setBorder(null);
        t2.setEditable(true);
        t2.setOpaque(false);
        add(t2);
        Font Atet2 = new Font ("calibri",Font.BOLD,16);
        t2.setFont(Atet2);

        JTextField t3 = new JTextField();
        t3.setBounds (209,345,314,29);
        t3.setForeground(Color.BLACK);
        t3.setBackground(new Color(101, 52, 216, 0));
        t3.setBorder(null);
        t3.setEditable(true);
        t3.setOpaque(false);
        add(t3);
        Font Atet3 = new Font ("calibri",Font.BOLD,16);
        t3.setFont(Atet3);

        DocumentListener documentListenert4 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    subject.setBounds(209,254,70,18);
                } else{
                    subject.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    subject.setBounds(209,254,70,18);
                } else{
                    subject.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    subject.setBounds(209,254,70,18);
                } else{
                    subject.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t1.getText());

            }
        };
        t1.getDocument().addDocumentListener(documentListenert4);

        DocumentListener documentListenert2 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    subjecttext.setBounds(209,301,155,18);
                } else{
                    subjecttext.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    subjecttext.setBounds(209,301,155,18);
                } else{
                    subjecttext.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    subjecttext.setBounds(209,301,155,18);
                } else{
                    subjecttext.setBounds(0,0,0,0);
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
                    lessons.setBounds(209,346,103,18);
                } else{
                    lessons.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    lessons.setBounds(209,346,103,18);
                } else{
                    lessons.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    lessons.setBounds(209,346,103,18);
                } else{
                    lessons.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t3.getText());

            }
        };
        t3.getDocument().addDocumentListener(documentListenert3);
//------------------------------------------------------------------------------------------------------------------------------
        JFrame frame = new JFrame();
        JTable table = new JTable();

        Object[] columns = {"login and logout","Date time"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);

        table.setModel(model);
        table.setBackground(Color.LIGHT_GRAY);
        table.setForeground(Color.black);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(751, 166, 199, 285);
        pane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        frame.setLayout(null);
        add(pane);

        Object[] row = new Object[2];

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM login_infor  WHERE user_id = "+Integer.parseInt(UID));

            while (rs.next()) {
                row[0] = rs.getString("login_and_logout");
                row[1] = rs.getString("Date_time");

                // add row to the model
                model.addRow(row);
                //int i = table.getSelectedRow();
            }
        } catch (Exception ew) {
            System.out.println(ew);
        }
//==============================================================================
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM accounts WHERE user_id = "+Integer.parseInt(UID));

            while(rs.next()){
                String name= rs.getString("accounts name");
                String amount= rs.getString("amount");

                duraw.setSelectedItem(name+" "+amount);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");
            Statement st = (Statement) con.createStatement ();
            ResultSet rs = st.executeQuery("SELECT * FROM payees WHERE user_id = "+Integer.parseInt(UID));

            while(rs.next()){
                String nname= rs.getString("Nick_name");
                String account_number= rs.getString("Account_number");

                duraw1.setSelectedItem(nname+" "+account_number);
            }
        }
        catch(Exception ew){
            System.out.println(ew);
        }
//------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        a.setBounds(0,0,950,502);
        a.setIcon(new ImageIcon(getClass().getResource("Home/6.png")));
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
        Funds_Transfer Frame = new Funds_Transfer();

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
