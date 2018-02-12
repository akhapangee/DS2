/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.dao.impl;

import com.akhilesh.dao.EmployeeDAO;
import com.akhilesh.entity.Employee;
import com.akhilesh.util.UsingInterFace.CustomList;
import com.akhilesh.util.UsingInterFace.DynamicList;

/**
 *
 * @author Akhilesh
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    private CustomList<Employee> empList = new DynamicList<>();

    @Override
    public void insert(Employee e) {
        empList.add(e);
    }

    @Override
    public Employee getById(int id) {
        for (int i = 0; i < empList.size(); i++) {
            Employee e = empList.get(i);
            if ((id == e.getId())) {
                return e;
            }
        }
        return null;
    }

    @Override
    public CustomList<Employee> getAll() {
        return empList;
    }

}
