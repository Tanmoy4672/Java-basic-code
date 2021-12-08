
package java.swing;

import javax.swing.JOptionPane;

public class ConfirmDialog {
    public static void main(String[] args) {
       int option =  JOptionPane.showConfirmDialog(null,"Do you want to quit?","title",JOptionPane.YES_NO_CANCEL_OPTION);
       if(option ==JOptionPane.YES_OPTION)
       {
           System.exit(0);
       }else{
           System.out.println("YOU HAVE CLICKED NO OPTION");
       }
    }
}
