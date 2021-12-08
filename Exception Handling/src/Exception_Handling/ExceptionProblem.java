package Exception_Handling;

import java.util.Scanner;

public class ExceptionProblem {

    public static void main(String[] args) {

        int count = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter second number: ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("Result :" + num1 + "/" + num2 + " = " + result);
                count ++; //count =2;
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                System.out.println("You must enter an integer.Please try again..");
            }
        } while (count == 1);
    }
}
