
package call.by.referance;

public class CallByReferance {

    String name;
    void change(CallByReferance r2){
        
        r2.name = "Tanmoy shome";
    }
}
