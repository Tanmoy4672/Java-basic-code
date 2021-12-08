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
public class confirmDialog2 {
    public static void main(String[] args) {
        int choice =JOptionPane.showConfirmDialog(null, "Do you want to quit?","Title",JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION){
            System.exit(0);
        }else{
            System.out.println("");
        }
    }
}
