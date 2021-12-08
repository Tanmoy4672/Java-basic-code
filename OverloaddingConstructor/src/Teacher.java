
public class Teacher {
    String Name,gender;
    int phone;
    
    Teacher(){
        System.out.println("No Information.");    
    }
    
    Teacher(String Nam,String gen){
        Name = Nam; 
        gender = gen;
       
    }
    Teacher(String na,String ge,int ph){
        Name = na;
        gender = ge;
        phone = ph;   
    }
    
    void displayInfo(){
        System.out.println("\nName :"+Name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone : "+phone);
    }
}
