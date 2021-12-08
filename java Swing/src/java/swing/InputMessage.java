package java.swing;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class InputMessage {
    public static void main(String[] args) {
       String name = JOptionPane.showInputDialog("Enter your name: ");
       JOptionPane.showMessageDialog(null,name+ "Wellcome to swing ");
    }
}
