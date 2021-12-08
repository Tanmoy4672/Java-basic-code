
package DecimalNumberMax2Digit;

import java.text.DecimalFormat;

public class DecimalNumberFormatDemo {
    public static void main(String[] args) {
        
        double x = 34.324354;
       DecimalFormat ob = new DecimalFormat("0.00");
        System.out.println("Result x : "+ob.format(x));
    }
}
