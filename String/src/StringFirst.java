/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StringFirst {
    public static void main(String[] args) {
         
        String s1 = "Tanmoy Shome";
        String s2 = new String("Tanmoy Shome");
        
        System.out.println(s1);
        System.out.println(s2);
        
        int len = s1.length();
        System.out.println(len);
        
        if(s1.equals(s2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equal");
        }
        
        boolean con = s1.contains(s2);
        System.out.println(con);
            
    }
}
