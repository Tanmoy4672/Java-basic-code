package com.tanmoy.binding;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@XmlRootElement(name="Employee")
public class Employee implements Serializable{
   private int emNo;
   private String name;
   private double salary;

    public int getEmNo() {
        return emNo;
    }

    public void setEmNo(int emNo) {
        this.emNo = emNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   
}
