
package SuperKeyword;

public class University {
    final String UNIVERSITY_NAME = "DIU"; //variable name should be capital letter 
    //final int fees; //blank final variable
    static final int department; //static final variable
    
//    University(){
//        fees = 34578; 
//    }
    
    static{   //it's called static block
        department = 4;
    }
    
    void display(){
        System.out.println("UNi name: "+UNIVERSITY_NAME);
      //  System.out.println("Fees: "+fees);
    }
    
}
