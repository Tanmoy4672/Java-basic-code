
package Hashmap;

import java.util.HashMap;
//import java.util.Scanner;


public class HashMapDemo {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        
        HashMap<Integer,String> customer = new HashMap<Integer,String>();
        customer.put(101, "Tanmoy");
        customer.put(102, "Shome");
        
          //problem
//        System.out.println("Enter 101 or 102 value:");
//       
//        int result = input.nextInt();
        System.out.println("Customer details: "+customer.get(101));
        
        
    }
 
}
