
public class Teacher {
     String name, gender;
    int number;

    void diplayInfo() { //hasn't parameter

        System.out.println("\nName :" + name + "\nGender: " + gender + "\nNumber: " + number);
    }
    
    //constructor
    Teacher(String name,String gender, int number){  //constructor is a kind of a method
    
        name = this.name;
        gender = this.gender;
        number = this.number;
    
    }
}
