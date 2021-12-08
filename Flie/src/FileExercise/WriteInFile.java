package FileExercise;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteInFile {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            Formatter formatter = new Formatter("C:/Users/User/OneDrive/Documents/NetBeansProjects/Flie/Person/student.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("How many students: ");
            int num1 = input.nextInt();

            for (int i = 1; i <= num1; i++) {
                System.out.println("Enter studnet id and Name: ");
                String id = input.next();
                String name = input.nextLine();
                formatter.format("%s %s\r\n", id, name);
            }

//        formatter.format("%s %s\r\n", "101","Tanmoy");  //(\r\n)= for windows written and new line
//        formatter.format("%s %s", "101","Tanmoy");
            formatter.close();
            System.out.println("Written completed.");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
