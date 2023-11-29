import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame {
    static Point mouseDownScreenCoords;
    static Point mouseDownCompCoords;
    private Object l1;
    String xx;
    private static String z;

    login(){
        setLayout(null);
//------------------------------------------------------------------------------------------------------------------------------
        JTextField t1 = new JTextField();
        t1.setBounds (77,180,386,50);
        t1.setForeground(Color.BLACK);
        t1.setBackground(new Color(101, 52, 216, 0));
        t1.setBorder(null);
        t1.setEditable(true);
        t1.setOpaque(false);
        add(t1);
        Font Atetl = new Font ("calibri",Font.BOLD,22);
        t1.setFont(Atetl);

        JPasswordField t2 =new JPasswordField();
        t2.setBounds(77,253,386,50);
        t2.setForeground(Color.black);
        t2.setBorder(null);
        t2.setEditable(true);
        t2.setOpaque(false);
        add(t2);
        Font t22 = new Font ("calibri",Font.BOLD,11);
        t2.setFont(t22);

        //   User Name

        JLabel l3 = new JLabel ("User ID");
        l3.setForeground(new Color(58, 58, 58, 255));
        t1.add(l3);
        Font Atel3 = new Font ("Arial Rounded MT",Font.BOLD,17);
        l3.setFont(Atel3);

        JLabel QQ = new JLabel();
        QQ.setIcon(new ImageIcon(getClass().getResource("Login/usern.png")));
        add(QQ);

        //   Password

        JLabel V3 = new JLabel ("Enter Password");
        V3.setForeground(new Color(58, 58, 58, 255));
        t2.add(V3);
        Font AteV3 = new Font ("Arial Rounded MT",Font.BOLD,17);
        V3.setFont(AteV3);

        JLabel VV = new JLabel();
        VV.setIcon(new ImageIcon(getClass().getResource("Login/pass.png")));
        add(VV);

//------------------------------------------------------------------------------------------------------------------------------
        l3.setBounds(38,16,300,20);
        QQ.setBounds(82,193,15,22);

        V3.setBounds(38,16,300,20);
        VV.setBounds(84,270,13,17);



        t1.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){
                    t2.requestFocus(true);

                }
            }
        });


        DocumentListener documentListenert4 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(38,16,300,20);
                    QQ.setBounds(82,193,15,22);
                } else{
                    l3.setBounds(0,0,0,0);
                    QQ.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(38,16,300,20);
                    QQ.setBounds(82,193,15,22);
                } else{
                    l3.setBounds(0,0,0,0);
                    QQ.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t1.getText().isEmpty()){
                    l3.setBounds(38,16,300,20);
                    QQ.setBounds(82,193,15,22);
                } else{
                    l3.setBounds(0,0,0,0);
                    QQ.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t1.getText());

            }
        };
        t1.getDocument().addDocumentListener(documentListenert4);


        DocumentListener documentListenert5 = new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    V3.setBounds(38,16,300,20);
                    VV.setBounds(84,270,13,17);
                } else{
                    V3.setBounds(0,0,0,0);
                    VV.setBounds(0,0,0,0);
                }
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    V3.setBounds(38,16,300,20);
                    VV.setBounds(84,270,13,17);
                } else{
                    V3.setBounds(0,0,0,0);
                    VV.setBounds(0,0,0,0);
                }
            }

            public void removeUpdate(DocumentEvent documentEvent) {
                printIT(documentEvent);
                if(t2.getText().isEmpty()){
                    V3.setBounds(38,16,300,20);
                    VV.setBounds(84,270,13,17);
                } else{
                    V3.setBounds(0,0,0,0);
                    VV.setBounds(0,0,0,0);
                }
            }

            private void printIT(DocumentEvent documentEvent) {
                System.out.println(t2.getText());

            }
        };
        t2.getDocument().addDocumentListener(documentListenert5);

        JLabel login = new JLabel();
        login.setIcon(new ImageIcon(getClass().getResource("Login/Login.png")));
        login.setBounds(81,343,127,41);
        add(login);

        JLabel loginx = new JLabel();
        loginx.setIcon(new ImageIcon(getClass().getResource("Login/login x.png")));
        //    loginx.setBounds(61,337,166,59);
        add(loginx);

        login.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                loginx.setBounds(78,340,133,47);
                login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });

        login.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                loginx.setBounds(0,0,0,0);
            }
        });

//------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------------
        JLabel l1 = new JLabel ("New User?");
        l1.setBounds(315,66,80,17);
        l1.setForeground(Color.BLACK);
        add(l1);
        Font Atl1 = new Font ("Arial Rounded MT",Font.PLAIN,15);
        l1.setFont(Atl1);

        JLabel ll = new JLabel ("Welcome Back!");
        ll.setForeground(Color.BLACK);
        ll.setBounds(65,91,204,32);
        add(ll);
        Font Atell = new Font ("Arial Rounded MT",Font.BOLD,27);
        ll.setFont(Atell);

        JLabel l2 = new JLabel ("Login to continue");
        l2.setForeground(Color.BLACK);
        l2.setBounds(65,125,126,17);
        add(l2);
        Font Atel2 = new Font ("Arial Rounded MT",Font.BOLD,15);
        l2.setFont(Atel2);

        JLabel l4 = new JLabel ("Sign Up");
        l4.setForeground(new Color(101, 52, 216));
        l4.setBounds(392,66,55,18);
        add(l4);
        Font Atl4 = new Font ("Arial Rounded MT",Font.BOLD,14);
        l4.setFont(Atl4);

        JLabel log = new JLabel ("");
        log.setBounds(70,425,300,20);
        add(log);
        Font Log = new Font ("calibri",Font.BOLD,18);
        log.setFont(Log);

        JLabel Cle = new JLabel ("FORGET PASSWORD?");
        Cle.setForeground(new Color(0,0,0));
        Cle.setBounds(255,358,157,23);
        add(Cle);
        Font Cler = new Font ("Arial Rounded MT",Font.BOLD,14);
        Cle.setFont(Cler);

        Cle.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                Cle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                Cle.setBounds(250,358,165,23);
                Cle.setForeground(new Color(101, 52, 216));
                Font Cler = new Font ("Arial Rounded MT",Font.BOLD,15);
                Cle.setFont(Cler);
            }
        });


        Cle.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                Cle.setBounds(255,358,157,23);
                Cle.setForeground(new Color(0,0,0));
                Font Cler = new Font ("Arial Rounded MT",Font.BOLD,14);
                Cle.setFont(Cler);
            }
        });
//------------------------------------------------------------------------------------------------------------------------------

        l4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Register Frame = new Register();
                dispose();
            }
        });

        Cle.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
              Forget_password Frame = new Forget_password();
                dispose();
            }
        });


        l4.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                l4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                l4.setForeground(new Color(101, 52, 216));
                l4.setBounds(391,66,65,20);
                Font Atl4 = new Font ("Arial Rounded MT",Font.BOLD,16);
                l4.setFont(Atl4);
            }
        });


        l4.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                l4.setForeground(new Color(101, 52, 216));
                l4.setBounds(392,66,55,18);
                Font Atl4 = new Font ("Arial Rounded MT",Font.BOLD,14);
                l4.setFont(Atl4);
            }
        });

        JLabel user = new JLabel();
        user.setIcon(new ImageIcon(getClass().getResource("Login/up.png")));
        user.setBounds(56,169,406,145);
        add(user);

// ------------------------------------------------------------------------------------------------------------------------------
        JLabel exit = new JLabel ("Exit");
        exit.setBounds(909,470,30,20);
        exit.setForeground(Color.black);
        add(exit);
        Font Exit = new Font ("calibri",Font.BOLD,18);
        exit.setFont(Exit);
//----------------------------------------------------------------------------------
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(getClass().getResource("Login/exit.png")));
        add(a2);
//----------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                a2.setBounds(896,468,60,25);
                exit.setForeground(Color.white);
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent e) {
                a2.setBounds(0,0,0,0);
                exit.setForeground(Color.black);
            }
        });
//----------------------------------------------------------------------------------------------------------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
//----------------------------------------------------------------------------------------------------------

//----------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------


//-------------------------------------------------------------------------------------------------------------------------------
        login.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {


                if(t1.getText().isEmpty() && t2.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, " Type Item User ID and Password ","Type Item User ID and Password ",JOptionPane.WARNING_MESSAGE);
                } else{

                    Login_User df = new Login_User();

                    String us = t1.getText();
                    df.setUserid(us);

                    String ps = t2.getText();
                    df.setPassword(ps);

                    if(df.getUsname().equals("success")) {
                        JOptionPane.showMessageDialog(null, " Login Success", "Login ok ", JOptionPane.WARNING_MESSAGE);

                         z = t1.getText();

                          Home Frame = new Home();
                            dispose();

                    }
                    else{
                            JOptionPane.showMessageDialog(null, "Invalid User ID or Password ","Invalid User ID or Password",JOptionPane.ERROR_MESSAGE);

                            login Frame = new login();
                            dispose();
                    }
                }
            }
        });
//-------------------------------------------------------------------------------------------------------------------------------
        t2.addKeyListener(new KeyAdapter() {
            public void keyPressed(final KeyEvent ke){
                int keypad = ke.getKeyCode();
                if (keypad == KeyEvent.VK_ENTER){

                    if(t1.getText().isEmpty() && t2.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null, " Type Item User ID and Password ","Type Item User ID and Password ",JOptionPane.WARNING_MESSAGE);
                    } else{

                        Login_User df = new Login_User();

                        String us = t1.getText();
                        df.setUserid(us);

                        String ps = t2.getText();
                        df.setPassword(ps);

                        if(df.getUsname().equals("success")) {
                            JOptionPane.showMessageDialog(null, " Login Success", "Login ok ", JOptionPane.WARNING_MESSAGE);

                             z = t1.getText();


                            Home Frame = new Home();
                            dispose();

                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Invalid User ID or Password ","Invalid User ID or Password",JOptionPane.ERROR_MESSAGE);

                            login Frame = new login();
                            dispose();
                        }
                    }

            }
        }
    });



//--------------------------------------------------------------------------------------------------------------------------------
        JLabel a = new JLabel();
        add(a);
//--------------------------------------
        Thread snn = new Thread() {
            @Override
            public void run() {
                for(int j = 1; j <= 5000; j++){
                    for(int lk = 1; lk <= 1; lk++){
                        for (int i = 389; i < 456; i=i+14) {
                            {
                                a.setBounds(i,28,468,447);
                                a.setIcon(new ImageIcon(getClass().getResource("Login/"+lk+".png")));
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
        xmain.setIcon(new ImageIcon(getClass().getResource("Login/Main.png")));
        xmain.setBounds(0,0,950,502);
        add(xmain);

//------------------------------------------------------------------------------------------------------------------------------
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
    public static String userid(){
        return z;
    }
}
