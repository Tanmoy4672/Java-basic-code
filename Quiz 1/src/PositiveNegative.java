/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class PositiveNegative {
     public static void main(String[] args) {

        double number = 12.3d;
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

   
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");
        
    
        else
            System.out.println(number + " is 0.");
    }
}
