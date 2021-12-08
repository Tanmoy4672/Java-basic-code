package Problem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int fr_num = input.nextInt();
        System.out.println("Enter Second number: ");
        int Sc_num = input.nextInt();

        int result = First_class.display(fr_num,Sc_num);

        System.out.println("Result:" + result);
    }
}
