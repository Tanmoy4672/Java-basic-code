
package LongImageInDataBase;

import SelectImage.ConnectionProvider;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class main {
    public static void main(String[] args) {
        try {
            
            Connection c = ConnectionProvider.getConnection();
            String sql = "INSERT INTO table3(tImg)VALUES(?)";
            PreparedStatement pstmt = (PreparedStatement) c.prepareStatement(sql);
            
            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            
            //file input streem object
            FileInputStream fis = new FileInputStream(file);
            pstmt.setBinaryStream(1, fis,fis.available());
            
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Image Store");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
