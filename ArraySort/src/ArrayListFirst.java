
import java.util.ArrayList;

public class ArrayListFirst {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();//in the diamond ,your desire give datatype
        
        System.out.println("Size = "+number.size());
        
        //adding element
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
    //    System.out.println(Number);
        for (int x : number) {
            System.out.print(" "+x);
        }
        System.out.println("\nSize = "+number.size());
    }
    
}
