package LongImageInDataBase;

import SelectImage.ConnectionProvider;
import java.sql.*;

public class SelectJDBC {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();

            String sql = "SELECT * FROM table1";

            Statement stmt = (Statement) con.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            System.out.println("Id     Name        City");
            while (rst.next()) {
                int id = rst.getInt("tId");  //we also can give column number
                String name = rst.getString("tName");
                String city = rst.getString("tCity");

                System.out.println(id + "\t" + name + "\t" + city);
            }

        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
}
