package ManagementSystem;

import java.util.Scanner;

public class HotelRecord {

    Scanner input = new Scanner(System.in);

    String entry_Time, exit_time;
    String entry_date, exit_date;

    public void GuestEntryTime() {
        System.out.println("Guest Entry time(hh-mm-ss): ");
        entry_Time = input.nextLine();
    }

    public void guestExitTime() {
        System.out.println("Guest exit time(hh-mm-ss): ");
        exit_time = input.nextLine();
    }

    public void visitingDate() {
        System.out.println("Guest entry date(dd-mm-yyyy): ");
        entry_date = input.nextLine();
        System.out.println("Guest exit date(dd-mm-yyyy): ");
        exit_date = input.nextLine();
    }

    public void displayHotelRecord() {
        System.out.println("Guest Entry and Exit time: " + entry_Time + "&" + exit_time);
        System.out.println("Guest Entry and Exit Date: " + entry_date + " & " + exit_date);
    }

}
