 
package statickeyword;

public class Student {
   static int count = 0;  //non-static variable
    
    Student(){
      count ++;
    }
    
    void totalstudnet(){
        System.out.println("Total student :"+count);
        
    }
}
