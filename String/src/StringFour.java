/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StringFour {
    public static void main(String[] args) {
        
        String s1 = "This is my country";
        String s2 = s1.replace('i', 'j');
        System.out.println(s2);
        
        String[] s3 = s1.split(" ");
        for(String x :s3){
            System.out.print(x);
        }
    }
}
