
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ArraylistThree {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList <Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        
        number1.add(10);
        number1.add(20);
        System.out.println("Number1 ="+number1);
        
        number2.add(30);
        number2.add(40);
        number2.add(50);
        System.out.println("Number2 ="+number2);
        
        number3.add(60);
        number3.add(70);
        number3.add(80);
        System.out.println("Number3 ="+number3);
        
        boolean result = number1.equals(number2);
        System.out.println("Compare ="+result);
        
         result = number1.equals(number3);
        System.out.println("Compare ="+result);
    }
      
      
      
}
