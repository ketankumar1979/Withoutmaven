package ketanselanium.ExtentReport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    public static void main(String[]args)throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        //2.establish connection
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","Tiavenus1516!");
       Statement st = conn.createStatement();
        ResultSet result = st.executeQuery("Select * from user_info");

       while (result.next()) {

           int id = result.getInt("id");
           String firstname = result.getString("firstname");
           String lastname = result.getString("lastname");
           System.out.println(id);
           System.out.println(firstname);
           System.out.println(lastname);
       }
           result.close();


    }
}
