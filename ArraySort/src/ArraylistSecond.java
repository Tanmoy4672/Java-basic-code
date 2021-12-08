
import java.util.ArrayList;

public class ArraylistSecond {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();//in the diamond ,your desire give datatype

        System.out.println("Size = " + number.size());

        //adding element
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);

        System.out.println("Arraylist contains :" + number);
        System.out.println();
        System.out.println("Size =" + number.size());

//        number.clear();
//        System.out.println("After clearing Arraylist :" + number);
        
        boolean check = number.isEmpty();
        System.out.println("Arraylist ="+check);
        
       boolean check2 = number.contains(30);
        System.out.println("30 is in the list: "+check2);
        
       int position = number.indexOf(40);
        System.out.println("The index position "+position);
        
        
        
    }

}
