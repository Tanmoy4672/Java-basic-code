/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StringThree {
    public static void main(String[] args) {
       String Country ="Bangladesh is my country";
        System.out.println(Country);
        
        char ch = Country.charAt(0);  //find by charectar string
        System.out.println("Ch ="+ch);
        
        int value = Country.codePointAt(0);
        System.out.println(value);
        
        int pos = Country.indexOf('n');
        System.out.println("first position of n: "+pos);
        
        pos = Country.lastIndexOf('n');
        System.out.println("Last position of n:"+pos);
    }
}
