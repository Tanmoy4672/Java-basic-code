/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersystem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class CurrentDate {
    public static void main(String[] args) {
        Date date= new Date();
        System.out.println("Date :"+date);
        
        DateFormat dateformate = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateformate.format(date);
        System.out.println("Current date :"+currentDate);
    }
}
