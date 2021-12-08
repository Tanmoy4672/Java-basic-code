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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class ComboBoxDemo extends JFrame {
    
    private Container C;
    private JComboBox adBox;
    private String[] prolanguage = {"c", "c++", "php", "java", "python"};
    private JLabel label;
    private JButton button;
    
    ComboBoxDemo() {
        initComponents();
    }
    
    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 500, 400);
        this.setTitle("ComboBox Demo");
        
        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.red);
        
        adBox = new JComboBox(prolanguage);
        adBox.setBounds(50, 160, 100, 30);
        adBox.setBackground(Color.red);
        adBox.addItem("React");
        adBox.removeItem("java");
        adBox.setEditable(true);
        C.add(adBox);
        
        label = new JLabel();
        label.setBounds(160, 150, 200, 50);
        label.setBackground(Color.PINK);
        C.add(label);
        
         button = new JButton("Check");
        button.setBounds(50, 250, 80, 40);
        button.setBackground(Color.PINK);
        C.add(button);

        //  adBox.setSelectedIndex(4);  //Always selected
        //adBox.setSelectedItem("java");
        System.out.println("Total item =" + adBox.getItemCount());
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                String s = adBox.getSelectedItem().toString();
                label.setText("You have selseted :"+s);
            }
        });
        
    }
    
   
    
    public static void main(String[] args) {
        ComboBoxDemo frame = new ComboBoxDemo();
        frame.setVisible(true);
    }
}
