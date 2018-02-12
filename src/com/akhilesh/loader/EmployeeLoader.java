/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.loader;

import com.akhilesh.entity.Employee;
import com.akhilesh.util.UsingInterFace.CustomList;

/**
 *
 * @author Akhilesh
 */
public class EmployeeLoader {

    private CustomList<Employee> empList;

    public EmployeeLoader(CustomList<Employee> empList) {
        this.empList = empList;
    }

    public void load() {
        empList.add(new Employee(1, "Akhilesh1", "Khapangee1", true));
        empList.add(new Employee(2, "Akhilesh2", "Khapangee2", true));
        empList.add(new Employee(3, "Akhilesh3", "Khapangee3", true));
    }

}
