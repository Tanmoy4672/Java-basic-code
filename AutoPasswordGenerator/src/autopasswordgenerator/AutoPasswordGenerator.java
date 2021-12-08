/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autopasswordgenerator;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AutoPasswordGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            ArrayList<String> rolls = new ArrayList<>();
            rolls.add("201-35-"+6001);
            rolls.add("201-35-"+6003);
            rolls.add("201-35-"+6007);
            rolls.add("201-35-"+6006);
            rolls.add("201-35-"+6002);
            rolls.add("201-35-"+6005);
            rolls.add("201-35-"+6009);
            
            
            for (String roll : rolls) {
                System.out.println("Roll ="+roll);
            }
        
            int roll = generate(6000, 6010);
            System.out.println(roll);
            String Finalroll= "201-35-"+roll;
            
            while (true) {
                if (rolls.contains(Finalroll)) {
                    roll = generate(6000, 6010);
                    Finalroll = "201-35-"+roll;
                    System.out.println("new generated pass "+Finalroll);
                }else{
                    rolls.add(Finalroll);
                    break;
                }
                
            }
            
            
            for (String i : rolls) {
                System.out.println("Roll ="+i);
            }
            
       
    }
    
    public static int generate(int min,int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
