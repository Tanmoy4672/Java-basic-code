/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payments;

/**
 *
 * @author User
 */
public class Online extends Payments{
    
    
    
     private String paymentType;
    private int amount;

    public Online(String paymentType, int amount, int price) {
        super(price);
        this.paymentType = paymentType;
        this.amount = amount;
    }
    
    
}
