
package Superkeyword;


public class B extends A{
    //already x= 10
    int x = 5;
    
    void display(){
        System.out.println("Result :"+x);
        System.out.println("Result 2: "+super.x);
    }
    
    @Override
    void message(){
        super.message();
        System.out.println("This is subclass B of A superclass");
    }
    
}
