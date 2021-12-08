package ManagementSystem;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        int person;
        String customer_name;
        int mobile_number;

        int recordId = 3014545;
        int empolyeeId;

        Scanner input = new Scanner(System.in);

        System.out.println("Are you \n1.A hotel employee\n2.A Guest?");
        person = input.nextInt();
        switch (person) {
            case 2:
                //first object
                BookingInfo BI = new BookingInfo();
                HotelBill HB = new HotelBill();
                System.out.println("***\\WELCOME TO SAURI HOTEL//***");
                System.out.print("Guest Name :");
                customer_name = input.nextLine();
                System.out.print("Guest Contact Number: ");
                mobile_number = input.nextInt();
                BI.RoomType(); //first object method
                HB.ChoiceType(); //second object method
                HB.hotel_mill();
                //output
                System.out.println();
                System.out.println("***\\WELCOME TO SAURI HOTEL//***");
                System.out.println("Guest name: " + customer_name);
                System.out.println("Contact number: " + mobile_number);
                BI.diplayBookingsDetails(); //show Booking Details
                HB.DisplayBill();
                break;
            case 1:
                System.out.println("***\\WELCOME TO SAURI HOTEL//***");

                System.out.print("Empolyee ID: ");
                empolyeeId = input.nextInt();

                if (empolyeeId == recordId) {
                    System.out.println("Access");
                    System.out.println("Empolyee name: Tanmoy Shome");

                    HotelRecord HR = new HotelRecord();
                    HR.visitingDate();
                    HR.GuestEntryTime();
                    HR.guestExitTime();
                    HR.displayHotelRecord();
                    break;
                } else {
                    System.out.println("Try after sometimes.");
                }
            default:
                System.out.println("Try Again");
                break;
        }
    }
}
