/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperdemo;

/**
 *
 * @author User
 */
public class ConversionBtweenStringPrimitve {
    public static void main(String[] args) {
        
        
        //double to string
        double i = 100.5;
        String S = Double.toString(i); //wrapper method
        System.out.println("S = "+S);
        
        
        //String to double
        String s = "43";
        int in = Integer.parseInt(s);
        System.out.println("S ="+in);
    }
}
