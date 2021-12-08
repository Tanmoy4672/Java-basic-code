
import java.util.ArrayList;

import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SortArray {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(30);
        number.add(20);
        number.add(40);
        number.add(50);
        number.add(60);
        System.out.println("Number ="+number);
        
        Collections.sort(number);
        System.out.println("After sorting : "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After sorting desending :"+number);
    }
}
