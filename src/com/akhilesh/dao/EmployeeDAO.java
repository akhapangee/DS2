/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.dao;

import com.akhilesh.entity.Employee;
import com.akhilesh.util.UsingInterFace.CustomList;

/**
 *
 * @author Akhilesh
 */
public interface EmployeeDAO {
    void insert(Employee e);
    Employee getById(int id);
    CustomList<Employee> getAll();
}
