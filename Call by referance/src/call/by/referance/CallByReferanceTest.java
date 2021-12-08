
package call.by.referance;


public class CallByReferanceTest {
    public static void main(String[] args) {
        CallByReferance r1 = new CallByReferance();
        r1.name = "Tamol shome";
        
        System.out.println("R1 name : "+r1.name);
        
        r1.change(r1);
        System.out.println("R2 name: "+r1.name);
    }
 
}
