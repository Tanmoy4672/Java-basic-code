package JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionListenerDemo1 extends JFrame {

    private Container C;
    private JTextField tf1, tf2;

    ActionListenerDemo1() {
        initComponents();
    }

    public void initComponents() {

        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.red);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 200, 50);
        C.add(tf1);
        

        tf2 = new JTextField();
        tf2.setBounds(50, 110, 200, 50);
        C.add(tf2);
        
        //action Listener
        tf1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String s = tf1.getText();
               if(s.isEmpty()){
                   JOptionPane.showMessageDialog(null,"Please Enter Anything");
               }else{
                    JOptionPane.showMessageDialog(null,"tf1 ="+s);
               }
               
            }
           
        });
        
        tf2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String s = tf2.getText();
               if(s.isEmpty()){
                   JOptionPane.showMessageDialog(null,"Please Enter Anything");
               }else{
                    JOptionPane.showMessageDialog(null,"tf2 ="+s);
               }
               
            }
           
        });

    }

    public static void main(String[] args) {

        ActionListenerDemo1 frame = new ActionListenerDemo1();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 100, 400, 500);
        frame.setTitle("Action Listener Demo");

    }

}
