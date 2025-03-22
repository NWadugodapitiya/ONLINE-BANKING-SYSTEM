import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Forget_password extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;

    Forget_password(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------
        JLabel tc = new JLabel ("Forget Password");
        tc.setBounds(45,23,400,52);
        tc.setForeground(Color.black);
        add(tc);
        Font Temc = new Font ("Arial Rounded MT",Font.BOLD,45);
        tc.setFont(Temc);
        //------------------------------------------------------------------------------------------------------------------------------
        JTextField t1 = new JTextField();
        t1.setBounds (578,120,240,34);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(101, 52, 216, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        Font Atetl = new Font ("Arial Rounded MT",Font.BOLD,17);
        t1.setFont(Atetl);

        JTextField t2 = new JTextField();
        t2.setBounds (578,175,240,34);
        t2.setForeground(Color.BLACK);
        t2.setBackground(new Color(101, 52, 216, 0));
        t2.setBorder(null);
        t2.setEditable(true);
        t2.setOpaque(false);
        add(t2);
        Font Atet2 = new Font ("Arial Rounded MT",Font.BOLD,17);
        t2.setFont(Atet2);

        JPasswordField t3 =new JPasswordField();
        t3.setBounds(578,230,240,34);
        t3.setForeground(Color.black);
        t3.setBorder(null);
        t3.setEditable(true);
        t3.setOpaque(false);
        add(t3);
        Font Atet3 = new Font ("Arial Rounded MT",Font.BOLD,11);
        t3.setFont(Atet3);

        JPasswordField t4 =new JPasswordField();
        //        t4.setBounds(578,285,240,34);
        t4.setForeground(Color.black);
        t4.setBorder(null);
        t4.setEditable(true);
        t4.setOpaque(false);
        add(t4);
        Font Atet4 = new Font ("Arial Rounded MT",Font.BOLD,11);
        t4.setFont(Atet4);
//------------------------------------------------------------------------------------------------------------------------------

// User NIC

        t1.requestFocus(true);

        JLabel QQ = new JLabel();
        QQ.setIcon(new ImageIcon(getClass().getResource("Forget_P/usern.png")));
        add(QQ);

        JLabel l3 = new JLabel ("User NIC");
        l3.setForeground(new Color(58, 58, 58));
        add(l3);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,17);
        l3.setFont(Atel3);


        l3.setBounds(602,125,71,23);
        QQ.setBounds(582,125,15,22);

        DocumentListener documentListener = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(602,125,71,23);
                    QQ.setBounds(582,125,15,22);
                } else{
                    l3.setBounds(0,0,0,0);
                    QQ.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(602,125,71,23);
                    QQ.setBounds(582,125,15,22);
                } else{
                    l3.setBounds(0,0,0,0);
                    QQ.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(602,125,71,23);
                    QQ.setBounds(582,125,15,22);
                } else{
                    l3.setBounds(0,0,0,0);
                    QQ.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t1.getText());

            }
        };
        t1.getDocument().addDocumentListener(documentListener);


//------------------------------------------------------------------------------------------------------------------------------

// Your Email

        JLabel nn = new JLabel();
        nn.setIcon(new ImageIcon(getClass().getResource("Forget_P/usern.png")));
        nn.setBounds(582,180,15,22);
        add(nn);

        JLabel l4 = new JLabel ("Your Email");
        l4.setForeground(new Color(58, 58, 58));
        l4.setBounds(602,182,156,23);
        add(l4);
        Font Atel4 = new Font ("Arial Rounded MT",Font.BOLD,17);
        l4.setFont(Atel4);


        DocumentListener documentListenert2 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    l4.setBounds(602,182,156,23);
                    nn.setBounds(582,180,15,22);
                } else{
                    l4.setBounds(0,0,0,0);
                    nn.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    l4.setBounds(602,182,156,23);
                    nn.setBounds(582,180,15,22);
                } else{
                    l4.setBounds(0,0,0,0);
                    nn.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    l4.setBounds(602,182,156,23);
                    nn.setBounds(582,180,15,22);
                } else{
                    l4.setBounds(0,0,0,0);
                    nn.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t2.getText());

            }
        };
        t2.getDocument().addDocumentListener(documentListenert2);

//------------------------------------------------------------------------------------------------------------------------------

//  Your Account Number

        JLabel bb = new JLabel();
        bb.setIcon(new ImageIcon(getClass().getResource("Forget_P/pass.png")));
        bb.setBounds(583,238,13,17);
        add(bb);

        JLabel l5 = new JLabel ("Account Number");
        l5.setForeground(new Color(58, 58, 58));
        l5.setBounds(602,235,181,23);
        add(l5);
        Font Atel5 = new Font ("Arial Rounded MT",Font.BOLD,17);
        l5.setFont(Atel5);

        DocumentListener documentListenert3 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    l5.setBounds(602,235,181,23);
                    bb.setBounds(583,238,13,17);
                } else{
                    l5.setBounds(0,0,0,0);
                    bb.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    l5.setBounds(602,235,181,23);
                    bb.setBounds(583,238,13,17);
                } else{
                    l5.setBounds(0,0,0,0);
                    bb.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t3.getText().isEmpty()){
                    l5.setBounds(602,235,181,23);
                    bb.setBounds(583,238,13,17);
                } else{
                    l5.setBounds(0,0,0,0);
                    bb.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t3.getText());

            }
        };
        t3.getDocument().addDocumentListener(documentListenert3);

//------------------------------------------------------------------------------------------------------------------------------

// User New Password

        JLabel vv = new JLabel();
        vv.setIcon(new ImageIcon(getClass().getResource("Forget_P/pass.png")));
          //    vv.setBounds(583,291,13,17);
        add(vv);


        JLabel l6 = new JLabel ("New Password");
        l6.setForeground(new Color(58, 58, 58));
         //       l6.setBounds(604,288,150,23);
        add(l6);
        Font Atel6 = new Font ("Arial Rounded MT",Font.BOLD,17);
        l6.setFont(Atel6);

        DocumentListener documentListenert4 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l6.setBounds(604,288,150,23);
                    vv.setBounds(583,291,13,17);
                } else{
                    l6.setBounds(0,0,0,0);
                    vv.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l6.setBounds(604,288,150,23);
                    vv.setBounds(583,291,13,17);
                } else{
                    l6.setBounds(0,0,0,0);
                    vv.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t4.getText().isEmpty()){
                    l6.setBounds(604,288,150,23);
                    vv.setBounds(583,291,13,17);
                } else{
                    l6.setBounds(0,0,0,0);
                    vv.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t4.getText());

            }
        };
        t4.getDocument().addDocumentListener(documentListenert4);


//------------------------------------------------------------------------------------------------------------------------------
        JLabel cangp = new JLabel();
        cangp.setIcon(new ImageIcon(getClass().getResource("Forget_P/change pass.png")));
        cangp.setBounds(573,337,227,41);
        add(cangp);

        JLabel caxx = new JLabel();
        caxx.setIcon(new ImageIcon(getClass().getResource("Forget_P/change pass.png")));
        add(caxx);

        JLabel cangpx = new JLabel();
        cangpx.setIcon(new ImageIcon(getClass().getResource("Forget_P/change pass x.png")));
        //    loginx.setBounds(61,337,166,59);
        add(cangpx);


        cangp.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                cangpx.setBounds(569,334,235,47);
                cangp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        cangp.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                cangpx.setBounds(0,0,0,0);
            }
        });

// ------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.black);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//----------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Forget_P/exit.png")));
        add(a2);
//----------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                a2.setBounds(896,468,60,25);
                exit.setForeground(Color.white);
                cangp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                a2.setBounds(0,0,0,0);
                exit.setForeground(Color.black);
            }
        });
//----------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------

//-------------------------------------------------------------------------------------------------------------------------------

        caxx.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                cangpx.setBounds(569,334,235,47);

            }
        });

        caxx.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                cangpx.setBounds(0,0,0,0);
            }
        });

//-------------------------------------------------------------------------------------------------------------------------------

        t1.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){

                    t2.requestFocus(true);

                }
            }
        });

        t2.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){

                    t3.requestFocus(true);

                }
            }
        });

        JLabel a = new JLabel();
        add(a);
//--------------------------------------
        Thread snn = new Thread() {
            @Override
            public void run() {
                for(int j = 1; j <= 5000; j++){
                    for(int lk = 1; lk <= 1; lk++){
                        for (int i = 0; i < 45; i=i+14) {
                            {
                                a.setBounds(i,28,468,447);
                                a.setIcon(new ImageIcon(getClass().getResource("Forget_P/"+lk+".png")));
                                try {
                                    sleep(100);
                                } catch (InterruptedException ex) {}
                            }
                        }
                        //-----------

                        try
                        {
                            Thread.sleep(5000);
                            //-----------------------------------

                        }catch (InterruptedException ie)
                        {
                            System.out.println(ie.getMessage());
                        }  }   }    }
        };
        snn.start();
//------------------------------------------------------------------------------------------------------------------------------
        JLabel xmain = new JLabel();
        xmain.setIcon(new ImageIcon(getClass().getResource("Forget_P/Main.png")));
        xmain.setBounds(0,0,950,502);
        add(xmain);
//------------------------------------------------------------------------------------------------------------------------------
        t3.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){

                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");
                        Statement st = (Statement) con.createStatement ();
                        ResultSet rs=st.executeQuery("SELECT * FROM user_register WHERE user_nic = '"+t1.getText()+ "' && email ='"+t2.getText()+ "' && Account_number ='"+t3.getText()+"'");


                        if (rs.next()){

                            t4.setBounds(578,285,240,34);
                            t4.requestFocus(true);
                            l6.setBounds(604,288,150,23);
                            vv.setBounds(583,291,13,17);
                            xmain.setIcon(new ImageIcon(getClass().getResource("Forget_P/Main2.png")));
                            cangp.setBounds(0,0,0,0);
                            caxx.setBounds(573,337,227,41);

                            System.out.println();
                        }

                        else{System.out.println();
                        JOptionPane.showMessageDialog(null, "Invalid ","Invalid",JOptionPane.ERROR_MESSAGE);

                        Forget_password Frame = new Forget_password();
                        dispose();
                    }

                    }

                    catch(Exception ew){
                        System.out.println(ew);
                    }

                }
            }
        });



        t4.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){

                    PreparedStatement pstx;
                    try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");

                        java.sql.Statement stmtx = conx.createStatement();
                        pstx = (PreparedStatement) conx.prepareStatement("update user_register set password=?,update_date=? WHERE user_nic ="+t1.getText());

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                        String formattedDate = myDateObj.format(myFormatObj);
                        System.out.println("Date and Time: " + formattedDate);

                        {

                            pstx.setString(1, t4.getText());
                            pstx.setString(2, formattedDate);
                            pstx.executeUpdate();
                            JOptionPane.showMessageDialog(null, "update ok","success",JOptionPane.WARNING_MESSAGE);


                            login Frame = new login();
                            dispose();

                        }
                        stmtx.close();
                        conx.close();
                    }catch (Exception eo){
                        System.out.println(eo);
                    }

                }
            }
        });
//------------------------------------------------------------------------------------------------------------------------------


        cangp.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");
                    Statement st = (Statement) con.createStatement ();
                    ResultSet rs=st.executeQuery("SELECT * FROM user_register WHERE user_nic = '"+t1.getText()+ "' && email ='"+t2.getText()+ "' && Account_number ='"+t3.getText()+"'");


                    if (rs.next()){

                        t4.setBounds(578,285,240,34);
                        t4.requestFocus(true);
                        l6.setBounds(604,288,150,23);
                        vv.setBounds(583,291,13,17);
                        xmain.setIcon(new ImageIcon(getClass().getResource("Forget_P/Main2.png")));
                        cangp.setBounds(0,0,0,0);
                        caxx.setBounds(573,337,227,41);

                        System.out.println();
                    }

                    else{System.out.println();
                        JOptionPane.showMessageDialog(null, "Invalid ","Invalid",JOptionPane.ERROR_MESSAGE);

                        Forget_password Frame = new Forget_password();
                        dispose();
                    }

                }

                catch(Exception ew){
                    System.out.println(ew);
                }
            }
        });


//--------------------------------------------------------------------------------------
        caxx.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                PreparedStatement pstx;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/online_banking_system","root","");

                    java.sql.Statement stmtx = conx.createStatement();
                    pstx = (PreparedStatement) conx.prepareStatement("update user_register set password=?,update_date=? WHERE user_nic ="+t1.getText());

                    LocalDateTime myDateObj = LocalDateTime.now();
                    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

                    String formattedDate = myDateObj.format(myFormatObj);
                    System.out.println("Date and Time: " + formattedDate);

                    {

                        pstx.setString(1, t4.getText());
                        pstx.setString(2, formattedDate);
                        pstx.executeUpdate();
                        JOptionPane.showMessageDialog(null, "update ok","success",JOptionPane.WARNING_MESSAGE);


                        login Frame = new login();
                        dispose();

                    }
                    stmtx.close();
                    conx.close();
                }catch (Exception eo){
                    System.out.println(eo);
                }


            }
        });

//-------------------------------------------------------------------------------------------------------------------------------
        setSize (950,502);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setBackground(new Color(255, 255, 255,0));
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


