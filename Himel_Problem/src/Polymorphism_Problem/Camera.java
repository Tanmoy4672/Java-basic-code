
package Polymorphism_Problem;

public class Camera extends SmartPhone{

    
    @Override
    void display(){
        System.out.println("Camera is opening.");
    }
    
    public void takingPhoto(){
        System.out.println("Photo is taking....");
    }
}
