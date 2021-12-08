
package Polymorphism_Problem;


public class Main {
    public static void main(String[] args) {
        
        SmartPhone s1 = new Camera();
        s1.display();
        s1.takingPhoto();
        
        SmartPhone s2 = new Gallery();
        s2.display();
    }
}
