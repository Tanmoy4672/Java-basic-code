
import java.util.Scanner;

public class CircleDemo {

    public static void main(String[] args) {
        
    
        int array[] = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            array[i] = sc.nextInt(i);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Element at index " + i + " : " + array[i]);
        }
    }
}
