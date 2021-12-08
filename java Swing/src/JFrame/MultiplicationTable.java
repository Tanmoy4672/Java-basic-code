
package JFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;


public class MultiplicationTable extends JFrame{
    
    private Container C;
    
    MultiplicationTable(){
        C = this.getContentPane();
        C.setLocale(null);
        C.setBackground(Color.red);
    }
    
    public static void main(String[] args) {
        
        MultiplicationTable frame = new MultiplicationTable();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,60,00,400);
        frame.setTitle("Multiplication Table");
      
    }
}
