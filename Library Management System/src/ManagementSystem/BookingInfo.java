package ManagementSystem;

import java.util.Arrays;
import java.util.Scanner;

public class BookingInfo {

    Scanner input = new Scanner(System.in);

    int room_no;
    String room_type;
    String result;

    public void RoomType() {

        System.out.println("Which type of room do you prefer?");
        System.out.println("1.AC\n2.Non-AC");
        room_type = input.nextLine();

        if ("AC".equals(room_type)) {
            AcRoom();
            result = room_type;
        } else if ("Non-AC".equals(room_type)) {
            result = room_type;
            NonAcRoom();

        }
    }

    void AcRoom() {
        System.out.println("Choose your Room NO:");
        int[] room = {201, 202, 203, 204, 205};
        for (int i = 0; i < 5; i++) {
            System.out.print(room[i] + " ");
        }
        System.out.println();
        room_no = input.nextInt();
    }

    void NonAcRoom() {
        System.out.println("Choose your Room NO:");
        int[] room = {301, 302, 303, 304, 305};
        for (int i = 0; i < 5; i++) {
            System.out.print(room[i] + " ");
        }
        System.out.println();
        room_no = input.nextInt();
    }

    public void diplayBookingsDetails() {
        System.out.println("Rooe Type :" + result);
        System.out.println("Room No :" + room_no);

    }

}
