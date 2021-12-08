/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Student {
    String name;
    int id;
    static String universityName ="DU";

    Student(String na,int i) {
        name = na;
        id = i;   
    }
   
    void displayinfo(){
        System.out.println("Name:"+name);
        System.out.println("Id: "+id);
        System.out.println("University: "+universityName);
    }
    
}
