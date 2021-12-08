/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class ImageInLabel extends JFrame{
    
    private Container C;
    private JLabel imgLabel;
    private  ImageIcon img;
    
    ImageInLabel(){
        initComponenets();
    }
    
    
    public void initComponenets(){
        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.ORANGE);
        
        img = new ImageIcon(getClass().getResource("tamoy.png"));
        
        imgLabel = new JLabel();
        imgLabel.setBounds(50,30, img.getIconWidth(),img.getIconHeight());
        C.add(imgLabel);
        
        
       
      
    }
    
    
    public static void main(String[] args) {
        
         
        
        ImageInLabel frame = new ImageInLabel();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 300);
        frame.setTitle("Tanmoy");
    }
        
    
}
