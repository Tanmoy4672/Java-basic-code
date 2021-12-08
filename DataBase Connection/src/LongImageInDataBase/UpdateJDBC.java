package LongImageInDataBase;

import SelectImage.ConnectionProvider;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpdateJDBC {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();
            String sql = "UPDATE table1 SET tName=?, tCity=? WHERE tId=?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter new name:");
            String name = br.readLine();
            System.out.println("Enter new City:");
            String city = br.readLine();
            System.out.println("Enter your id:");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);

            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.setInt(3, id);

            pstmt.executeUpdate();
            System.out.println("Done....");
            con.close();

        } catch (Exception e) {
            e.fillInStackTrace();
        }

    }

}
