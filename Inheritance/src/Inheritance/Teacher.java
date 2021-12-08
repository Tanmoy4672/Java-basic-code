package Inheritance;

public class Teacher extends Person {

    String qualification;
 

    void dispalyInformation2() {
        displayInformation1();
        System.out.println("Qualificatin: "+ qualification);
    }
}
