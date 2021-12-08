package JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class TextFieldDemo extends JFrame{
    
    private Container C;
    private JTextField tf1,tf2;
    private Font f;
    
    TextFieldDemo(){
        initComponents();
    }
    
    public void initComponents(){
        
        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.red);
        
        f = new Font("Arial",Font.BOLD + Font.ITALIC,18);
        
        tf1 = new JTextField();
        tf1.setBounds(50, 50,200, 50);
        C.add(tf1);
        tf1.setFont(f);
        tf1.setForeground(Color.red);
        tf1.setBackground(Color.GREEN);
        tf1.setHorizontalAlignment(JTextField.CENTER); //where typing start
        
        tf2 = new JTextField("tanmoy");
        tf2.setBounds(50, 110,200, 50);
        C.add(tf2);
       
        
    }
    
    public static void main(String[] args) {
        TextFieldDemo frame = new TextFieldDemo();
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Tanmoy");
    }
}
