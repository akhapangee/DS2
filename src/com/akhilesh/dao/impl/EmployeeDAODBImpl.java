/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.dao.impl;

import com.akhilesh.dao.EmployeeDAO;
import com.akhilesh.entity.Employee;
import com.akhilesh.util.UsingInterFace.CustomList;

/**
 *
 * @author Akhilesh
 */
public class EmployeeDAODBImpl implements EmployeeDAO {

    @Override
    public void insert(Employee e) {
        System.out.println("Inserted into db");
    }

    @Override
    public Employee getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomList<Employee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
