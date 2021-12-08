/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersystem;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NumberSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any NUmber: ");
        int decimal = input.nextInt();
        
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary =" + binary);

        String octal = Integer.toOctalString(decimal);
        System.out.println("Binary =" + octal);

        String hexa = Integer.toHexString(decimal);
        System.out.println("Binary =" + hexa);

        
        //binary to decimal
        
        System.out.print("Enter any NUmber: ");
        String binary1 = input.nextLine();
        
        Integer decimal1= Integer.parseInt(binary1,2);
        System.out.println("Decimal ="+decimal1);
        
        
    }

}
