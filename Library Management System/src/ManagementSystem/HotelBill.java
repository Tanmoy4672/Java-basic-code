package ManagementSystem;

import java.util.Scanner;

public class HotelBill {

    Scanner input = new Scanner(System.in);

    int bill_no1 = 3000;
    int bill_no2 = 5000;
    int bill;
    int cardNummber;

    int bed;
    int foodItem;
    double bengali = 350;
    double Chinese = 800;
    double thai = 900;
    double foodBill;

    public void ChoiceType() {

        System.out.println("Which type of room do you prefer?");
        System.out.println("1.Single bed\n2.Doouble Bed");
        bed = input.nextInt();

        switch (bed) {
            case 1:
                bill = bill_no1;
                discount();
                break;
            case 2:
                bill = bill_no2;
                discount();
                break;

        }
    }

    public void hotel_mill() {

        System.out.println("Which type of food do you prefer?");
        System.out.println("1.Bengali\n2.Chinese\n3.Thai");
        foodItem = input.nextInt();

        switch (foodItem) {
            case 1:
                foodBill = bengali;
                break;
            case 2:
                foodBill = Chinese;
                break;
            case 3:
                foodBill = thai;
                break;

        }
    }
    
    void discount(){
        System.out.println("Gift card number is '505050'.");
        System.out.println("If you give the gift card ,you will get 10% discount.");
        System.out.println("Enter your Gift Card Number:");
        cardNummber = input.nextInt();
          
        if(cardNummber == 505050){
            System.out.println("You've gotten 10% discount.");
            bill = (bill*90)/100;
        }           
    }

    public void DisplayBill() {
        System.out.println("Total Bill: " + bill);
        System.out.println("Food Bill: "+foodBill);
    }

}
