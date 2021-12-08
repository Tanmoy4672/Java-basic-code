/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StringSecond {
    public static void main(String[] args) {
       String firstName = "Tanmoy";
       String secondName = " Shome";
       
       String fullName = firstName + secondName;
        System.out.println("Name :"+fullName);
        
        String Fullname = firstName.concat(secondName);
        System.out.println("Fullname ="+fullName);
        
        String upperName = fullName.toUpperCase();
        System.out.println("Upper name: "+upperName);
        
        String lowerName = fullName.toLowerCase();
        System.out.println("Lower Name :"+lowerName);
        
        boolean b = firstName.startsWith("T");
        System.out.println("Contain :"+b);
        
        b = secondName.endsWith("e");
        System.out.println(b);
        
        String[] name ={"Anisul", "Islam","Kabir"};
        for(String x: name){
            System.out.print( x+",");
            
        }
        
    }
 
}
