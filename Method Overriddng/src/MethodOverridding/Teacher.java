
package MethodOverridding;

public class Teacher extends Student{
    
    String quallification;
    
    @Override
   void displayInfo(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Qualification: "+quallification);
    }
}
