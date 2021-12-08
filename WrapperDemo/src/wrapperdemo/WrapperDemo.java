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
public class WrapperDemo {

    
    /**
     primitive datatype to object datatype
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x =50;
        Integer y = Integer.valueOf(x);
        System.out.println("y ="+y);
        
        Integer z = x;//Integer.valueof(x)
        System.out.println("Y ="+z);
        
        //object datatype to primitive value
        
        Double d = new Double(10.6);
        System.out.println("D = "+d);
        
        double e =d.doubleValue();
        System.out.println("E = "+e);
        
        String s = "6";
        int sumv = 4 + Integer.parseInt(s);
        System.out.println(sumv);
       
        
        
    }
    
}
