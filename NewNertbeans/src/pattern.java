
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class pattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input line: ");
        int n = input.nextInt();
        
        for (int  row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                
                System.out.print("  "+col);
                
            }
 
            System.out.println();
        }
        
        
    }
    
}
