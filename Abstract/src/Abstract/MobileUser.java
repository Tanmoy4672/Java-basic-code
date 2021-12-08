
package Abstract;

//you also can replace abstract keyword before public
 public abstract class MobileUser {
    
     void call(){  //non-abstract method
         System.out.println("I'm call method.");
     }
     
     
   abstract void sendmessage(); 
   //implementataion in hide
   //fully abstract class/100% functionality if only has abstract method in class
}
