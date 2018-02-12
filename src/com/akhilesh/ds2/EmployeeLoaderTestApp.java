/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ds2;

import com.akhilesh.entity.Employee;
import com.akhilesh.loader.EmployeeLoader;
import com.akhilesh.util.UsingInterFace.CustomList;
import com.akhilesh.util.UsingInterFace.DynamicList;

/**
 *
 * @author Akhilesh
 */
public class EmployeeLoaderTestApp {

    /**
     * Mediator design pattern
     *
     * @param args
     */
    
    public static void main(String[] args) {
        CustomList<Employee> empList = new DynamicList<>();
        EmployeeLoader loader = new EmployeeLoader(empList);
        loader.load();

        for (int i = 0; i < empList.size(); i++) {
            Employee e = empList.get(i);
            System.out.println(e.getFirstName());
        }
       
    }
}
