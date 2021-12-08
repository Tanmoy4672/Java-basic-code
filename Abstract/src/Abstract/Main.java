
package Abstract;


public class Main {
    public static void main(String[] args) {
        MobileUser ms;
        ms = new Karim();
        ms.call();
        ms.sendmessage();
        
        ms = new Rahim();
        ms.sendmessage();
    }
}
