/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        
        //concatenates to StringBuilder
        StringBuilder str = new StringBuilder("TanmoyH");
        System.out.println("Str ="+str);
        
        
        str.append(23);
        System.out.println(str);
        
        str.reverse();
        System.out.println(str);
       
    }
}
