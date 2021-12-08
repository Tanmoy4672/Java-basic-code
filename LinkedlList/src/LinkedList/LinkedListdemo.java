/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.LinkedList;

/**
 *
 * @author User
 */
public class LinkedListdemo {

    public static void main(String[] args) {

        LinkedList<String> countryName = new LinkedList<String>();
        countryName.add("Bangladesh");
        countryName.add("Pakistan");
        countryName.add("India");
        countryName.addFirst("Canada");
        countryName.addLast("Germany");
        countryName.remove("India");

        for (String country : countryName) {
            System.out.println(country);
        }

        System.out.println("First name:" + countryName.getFirst());
        System.out.println("Last Name: " + countryName.getLast());
        System.out.println("Size number of linkedlist: " + countryName.size());
    }
}
