/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ds2;

import com.akhilesh.entity.Employee;
import com.akhilesh.util.MyGenericList;

/**
 *
 * @author Akhilesh
 */
public class MyGenericListApp {

    public static void main(String[] args) {
        MyGenericList<String> list = new MyGenericList<>();

        //now it will allow only String type values to be added to the list
        list.add("Akhilesh");
        list.add("Khapangee");
        list.add("Hello! Hi, how are you?");

        System.out.println("=========================");
        // now it will store only objects of Employee
        MyGenericList<Employee> empList = new MyGenericList<>();
        empList.add(new Employee());
        empList.add(new Employee(1, "Akhilesh1", "Khapangee1", true));
        empList.add(new Employee(2, "Akhilesh2", "Khapangee2", true));
        empList.add(new Employee(3, "Akhilesh3", "Khapangee3", true));
        
        for (int i = 0; i < empList.size(); i++) {
            Employee e = empList.get(i);
            System.out.println(e.getFirstName());
        }

    }
}
