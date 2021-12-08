/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author User
 */
public class radioButtonDemo extends JFrame{
    private Container C;
    private JRadioButton male,female;
    private ButtonGroup grp;
    
    radioButtonDemo(){
        initComponents();
    }
    
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 400, 400);
        this.setTitle("Radio Button");
        
        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.red);
        
        grp = new ButtonGroup();
        
        
        male = new JRadioButton("Male");
        male.setBounds(50, 50, 100, 50);
        male.setBackground(Color.red);
        male.setSelected(true);//internally sellected male button
        C.add(male);
        
        
        female = new JRadioButton("Female");
        female.setBounds(160, 50, 100, 50);
        female.setBackground(Color.red);
        C.add(female);
        
        //you have to add in group after adding container
        grp.add(male);
        grp.add(female);
    }
    
    
    public static void main(String[] args) {
        radioButtonDemo frame = new radioButtonDemo();
        frame.setVisible(true);
    }
    
}
