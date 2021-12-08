/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangamentSystem.model;


public class Registration_Model {
    
        private final String student_name ;
        private final String email ;
        private final String pass ;
        private final String phn ;
        private final String address ;
        private final String parent_number ;
        private final String join_date ;
        private final int age ;
        private final String id ;
        
        

    public Registration_Model(String student_name, String email, String pass, String phn, String address, String parent_number, String join_date, int age, String id) {
        this.student_name = student_name;
        this.email = email;
        this.pass = pass;
        this.phn = phn;
        this.address = address;
        this.parent_number = parent_number;
        this.join_date = join_date;
        this.age = age;
        this.id = id;
    }
        
        
        


    public String getStudent_name() {
        return student_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getPhn() {
        return phn;
    }

    public String getAddress() {
        return address;
    }

    public String getParent_number() {
        return parent_number;
    }

    public String getJoin_date() {
        return join_date;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }
        
}
