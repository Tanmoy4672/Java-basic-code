/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SelectImage;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Image;
import java.io.InputStream;
import javax.swing.*;
import java.sql.*;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class ShowImageHelper {
    public static ImageIcon getImageIconById(int id,Connection con) {
        ImageIcon icon = null;
        try {
            String sql = "SELECT tImg FORM table2 WHERE tId =?";
            PreparedStatement pstmt= (PreparedStatement) con.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet set = pstmt.executeQuery();
            if(set.next()){
                Blob b =set.getBlob("tImg");
                InputStream is = b.getBinaryStream();
                
                Image image = ImageIO.read(is);
                
                icon = new ImageIcon(image);
                
            }
            
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return icon;
    }
    
}
