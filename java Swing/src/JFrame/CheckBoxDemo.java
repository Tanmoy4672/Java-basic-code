/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class CheckBoxDemo extends JFrame{
    
    private Container C;
    private JCheckBox java1,java2;
    private ButtonGroup grp;

    CheckBoxDemo() {
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 500, 400);
        this.setTitle("CheckBox Demo");
        
        grp = new ButtonGroup();
        
        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.red);
        
        java1 = new JCheckBox("Java",true);
        java1.setBounds(50, 100, 100, 30);
        java1.setBackground(Color.red);
        //java1.setSelected(true);
        C.add(java1);
        
        java2 = new JCheckBox("mysql");
        java2.setBounds(50, 160, 100, 30);
        java2.setBackground(Color.red);
        C.add(java2);
        
        grp.add(java1);
        grp.add(java2);
    }
    
    
    public static void main(String[] args) {
        CheckBoxDemo frame = new CheckBoxDemo();
        frame.setVisible(true);
    }
    
}
