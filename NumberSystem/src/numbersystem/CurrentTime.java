/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersystem;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.text.DateFormatter;

/**
 *
 * @author User
 */
public class CurrentTime {
    public static void main(String[] args) {
        LocalTime time =LocalTime.now();
        System.out.println("Current time :"+time);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
         String formattedTime = time.format(formatter);
         
         System.out.println("Time: "+formattedTime);
    }
}
