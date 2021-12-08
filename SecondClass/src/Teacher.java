
public class Teacher {

    String name, gender;
    int number;

    void diplayInfo() { //hasn't parameter

        System.out.println("\nName :" + name + "\nGender: " + gender + "\nNumber: " + number);
    }
    
    //method
    void setinfo(String na,String mal,int phn){  //parameter
       name = na;
       gender = mal;
       number = phn;
        
    }
}
