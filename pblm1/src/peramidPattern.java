
import java.util.Scanner;

public class peramidPattern {

    public static void main(String[] args) {

        int row, col;
        System.out.println("Enter Length:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (row = 1; row <= num; row++) {
            for (col = 1; col <= row; col++) {
                int res = col % 2;
                System.out.print(res);
            }
            System.out.println();
        }

        System.out.println();

        for (row = num; row >= 1; row--) {
            for (col = 1; col <= num - row; col++) {
                // printf(" ");
                System.out.print(" ");
            }
            for (col = 1; col <= 2 * row - 1; col++) {
                int res = col % 2;
                System.out.print(res);
            }
            System.out.println();
        }

        System.out.println();
        for (row = num; row >= 1; row--) {
            for (col = 1; col <= num - row; col++) {
                // printf(" ");
                System.out.print(" ");
            }
            for (col = 1; col <= 2 * row - 1; col++) {
                int res = col % 2;
                System.out.print(res);
            }
            System.out.println();
        }
        System.out.println();
         for (row = num; row >= 1; row--) {
            for (col = 1; col <= num - row; col++) {
                // printf(" ");
                System.out.print(" ");
            }
            for (col = 1; col <= 2 * row - 1; col++) {
                int res = col % 2;
                System.out.print(res);
            }
            System.out.println();
        }
    }
}
