
package JFrame;

import javax.swing.JFrame;


public class FrameDemo {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //after cross 
        
        frame.setSize(300,400); //frame size
        frame.setLocation(200, 50);
        //frame.setLocationRelativeTo(null); //locate GUI
        
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Tanmoy");
        frame.setResizable(false); //couldn't resize frame
        
        
    }
}
