/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class mainOverloadding {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Tanmoy","male");
        teacher2.displayInfo();
        Teacher teacher3 = new Teacher("Tanmoy Shome","Male",8769345);
        teacher3.displayInfo();
        
        
        
    }
}
