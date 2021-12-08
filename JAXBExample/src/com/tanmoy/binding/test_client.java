package com.tanmoy.binding;


import com.tanmoy.binding.Employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

public class test_client {
    public static void main(String[] args) {
        //marshallling : converting of java obj itno Xml
        Employee employee = new Employee();
        employee.setEmNo(301);
        employee.setName("Tanmoy");
        employee.setSalary(20000.00);
        
        //create JAXBContent object,to create JAXBContext object we can use neewINstance() from JAXBContext
        //the newInstacne() is a static factory method.
        
        JAXBContext context=JAXBContext.
        
        //create Marshaller object from JAXBContext 
        
        //call marshall(-) form marshaller object
        
    }
}
