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
public class Cash extends Payments{
    private String CustomerName;
    private int amount;

    public Cash(String CustomerName, int amount, int price) {
        super(price);
        this.CustomerName = CustomerName;
        this.amount = amount;
    }
    
     
    
    public void ProductDiscount(){
    }
}
