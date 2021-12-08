/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class String_Palindrome {
    public static void main(String[] args) {
        
        String s1= "Tanmoy";
      
        
        StringBuilder sb = new StringBuilder(s1);
        String s2 = sb.reverse().toString();
        
        if(s1.equals(s2)){
            System.out.println("Palindrome");
            
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
