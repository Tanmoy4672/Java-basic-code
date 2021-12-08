/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersystem;

import java.util.Random;

/**
 *
 * @author User
 */
public class GenerateRandomNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        
        //output random number in every step
        int randomNumber = rand.nextInt(10);
        System.out.println("Random Number: "+randomNumber);
        
        int randomNum = (int) (Math.random()*10);
        System.out.println("Random Number using Math method: "+randomNum);
        
        
    }
}
