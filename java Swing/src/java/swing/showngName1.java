/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.swing;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class showngName1 {
     public static void main(String[] args) {
       String name = JOptionPane.showInputDialog(null,"Enter your name: ","This is title",JOptionPane.QUESTION_MESSAGE);
       String name1 = ("Enter your last name: ");
       String full_name = name +" " +name1;
       
       JOptionPane.showMessageDialog(null, "Your full name."+full_name);
    }
}
