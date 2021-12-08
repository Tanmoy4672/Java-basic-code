
package MethodOverridding;


public class Main {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name = "Biplob";
        t1.age = 34;
        t1.quallification = "Asit Professor";
        t1.displayInfo();
        
        System.out.println();
        Student s1 = new Student();
        s1.name = "Tanmoy  Shome";
        s1.age = 21;
        s1.displayInfo();
        
        
        
        
    }
}
