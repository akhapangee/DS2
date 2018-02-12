/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ds2;

import com.akhilesh.dao.EmployeeDAO;
import com.akhilesh.dao.impl.EmployeeDAODBImpl;
import com.akhilesh.dao.impl.EmployeeDAOImpl;
import com.akhilesh.entity.Employee;

/**
 *
 * @author Akhilesh
 */
public class EmployeeDAOTestApp {

    public static void main(String[] args) {
        //now list is invisible from main app
        EmployeeDAO empDao = new EmployeeDAOImpl();
        empDao.insert(new Employee(1, "Akhilesh1", "Khapangee1", true));
        empDao.insert(new Employee(2, "Akhilesh2", "Khapangee2", true));
        empDao.insert(new Employee(3, "Akhilesh3", "Khapangee3", true));

        Employee emp = empDao.getById(3);
        System.out.println(emp.getFirstName());

        System.out.println("====================================");
        EmployeeDAO empDao1 = new EmployeeDAODBImpl();
        empDao1.insert(new Employee(1, "Akhilesh1", "Khapangee1", true));

    }
}
