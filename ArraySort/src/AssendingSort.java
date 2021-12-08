
import java.util.Arrays;
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
public class AssendingSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] number = {20,-98,6,90,60};
        
        Arrays.sort(number);
        
        //asscending
        System.out.println("Assending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+number[i]);
        }
        System.out.println("\nDessending: ");
        for (int i = 4; i >=0; i--) {
            System.out.print(" "+number[i]);
        }
    }
    
}
