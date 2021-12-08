/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileExercise;

import java.io.File;

/**
 *
 * @author User
 */
public class CreatFile {

    public static void main(String[] args) {
        File dir = new File("Person");
        dir.mkdir(); //directory will be created   
        String path = dir.getAbsolutePath();

//        File file1 = new File("C:/Users/User/OneDrive/Documents/NetBeansProjects/Flie/Person/Student.txt");
//        File file2 = new File("C:/Users/User/OneDrive/Documents/NetBeansProjects/Flie/Person/Teacher.txt");
        File file1 = new File(path + "/Student.txt");
        File file2 = new File(path + "/Teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created.");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        file2.delete();
        if (file1.exists()) {
            System.out.println("File exist.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
