
package JFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class FrameDemo3 extends JFrame{
    
    private ImageIcon icon;
    private Container c;  //Contaier for background
    
    FrameDemo3() {
        
        initComponenets();
    }

    public void initComponenets(){
        c = this.getContentPane();
        c.setBackground(Color.red);
        icon = new ImageIcon(getClass().getResource("icons8-apple-logo-48.png"));
        this.setIconImage(icon.getImage());
        
    }
    public static void main(String[] args) {

        FrameDemo3 frame = new FrameDemo3();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 100, 400, 500);
        frame.setTitle("Tanmoy");

    }
    
}
