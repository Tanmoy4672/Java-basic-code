/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Tanmoy");
        System.out.println(sb);
        
        sb.append("shome");
        sb.append(21);
        System.out.println(sb);
    }
 
}
