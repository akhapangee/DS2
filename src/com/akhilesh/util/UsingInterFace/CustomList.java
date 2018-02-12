/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.util.UsingInterFace;

/**
 *
 * @author Akhilesh
 */
public interface CustomList<T> {
    void add(T t);
    T get(int index);
    int size();
}
