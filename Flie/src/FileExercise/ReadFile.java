/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileExercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReadFile {

    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/User/OneDrive/Documents/NetBeansProjects/Flie/Person/student.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String id = input.next();
                String name = input.next();
                System.out.println("Id: " + id + " Name:" + name);
            }
            input.close();
            System.out.println("Reading completed.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
