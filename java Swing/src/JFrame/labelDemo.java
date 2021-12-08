
package JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.JFrame;
import javax.swing.JLabel;





public class labelDemo extends JFrame{
    
    private Container C;
    private JLabel userlabel,passlabel;
    private Font f;
    
    labelDemo(){
        initComponenets();
    }
    
    public void initComponenets(){
        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.ORANGE);
        
        
        f = new Font("Arial",Font.BOLD,14);
        
        userlabel = new JLabel();
        userlabel.setText("Enter your user name: ");
        userlabel.setBounds(50, 20, 160, 30);
        C.add(userlabel);
        userlabel.setFont(f);
        userlabel.setForeground(Color.red);
        userlabel.setOpaque(true);// for forground colour
        userlabel.setBackground(Color.BLUE);
        
        
        passlabel = new JLabel("Enter your password : ");//setText in constractor
     //   passlabel.setText("Enter your Password : ");
        passlabel.setBounds(50, 70, 250, 50);
        C.add(passlabel);
        passlabel.setFont(f);
        passlabel.setToolTipText("Enter correctly your username"); //tip text
    }
    public static void main(String[] args) {
        
        labelDemo frame = new labelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 300);
        frame.setTitle("Tanmoy");
    }
}
