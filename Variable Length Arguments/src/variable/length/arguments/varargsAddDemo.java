package variable.length.arguments;

public class varargsAddDemo {

    // ... it' s mean any length of variable
    void add(int ...num) {
       // System.out.println(num1 + num2);
       int sum = 0;
        for (int x : num) {
            sum +=x;
        }
        System.out.println(sum);
    }
}
