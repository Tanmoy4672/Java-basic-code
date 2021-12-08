/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Average {
   public static void main(String[] args) {
        double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;

        for (int i=0; i<6; i++) {
           sum += numArray[i];
        }

        double average = sum / numArray.length;
        System.out.println("The average is: %.2f"+average);
    } 
}
