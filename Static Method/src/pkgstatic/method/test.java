
package pkgstatic.method;

import java.awt.DisplayMode;

public class test {
    public static void main(String[] args) {
        StaticMethod stm = new StaticMethod();
        stm.display1();
        
        StaticMethod.display2();
    }
}
