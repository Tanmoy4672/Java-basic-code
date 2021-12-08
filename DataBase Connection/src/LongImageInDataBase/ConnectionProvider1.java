package LongImageInDataBase;

import com.mysql.jdbc.Connection;
import java.sql.*;


public class ConnectionProvider1 {
    
    private static Connection con;
    
    public static Connection getConnection(){
    
        try{
        if(con==null){
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/testconnection","root","root");
        }
        
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
    
}
