import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

 class Login_User {

    private String username;
    private String password;
     String Resalt;

    public String getUsname(){

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/banking_system", "root", "");
            Statement st = con.createStatement();

            ResultSet rs=st.executeQuery("SELECT * FROM user WHERE user_id = '"+username+ "' && password ='"+password+"'");

            if(rs.next()){
                Resalt ="success";
            }
            else{
                Resalt = "unsuccess";
            }
        }

        catch (Exception ew){
            System.out.println(ew);
        }



        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/banking_system","root","");

            String query = "insert into login_infor(user_id,Password,Date_time,login_and_logout)" + " values (?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(query);

            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

            String formattedDate = myDateObj.format(myFormatObj);
            System.out.println("Date and Time: " + formattedDate);


            preparedStmt.setString(1, username);
            preparedStmt.setString(2, password);
            preparedStmt.setString(3, formattedDate);
            preparedStmt.setString(4, "Login");
            preparedStmt.execute();


            con.close();
        }
        catch (ClassNotFoundException | SQLException en)
        {
            System.err.println("Got an excepttion!");
            System.err.println(en.getMessage());

        }

        return Resalt;
    }

    public void setUserid(String newUserid){
         username = newUserid;
    }

    public void setPassword(String newPassword){
         password = newPassword;
    }


}