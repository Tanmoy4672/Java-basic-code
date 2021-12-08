/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class ActionListenerDemo2ALLAction extends JFrame {

    private Container C;
    private JTextField tf1, tf2;

    ActionListenerDemo2ALLAction() {
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

        Handler handler = new Handler();
        tf1.addActionListener(handler);
        tf2.addActionListener(handler);
    }

    class Handler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == tf1) {  //getsource will check
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1 =" + s);
                }
            } else {
                String s = tf2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Anything");
                } else {
                    JOptionPane.showMessageDialog(null, "tf2 =" + s);
                }
            }

        }
    }

    public static void main(String[] args) {

        ActionListenerDemo2ALLAction frame = new ActionListenerDemo2ALLAction();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 100, 400, 500);
        frame.setTitle("Action Listener Demo");

    }
}
