/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.util;

/**
 *
 * @author Akhilesh
 */
public class MyGenericList<T> {

    Object[] array = new Object[0];

    public void add(T n) {
        if (array.length == 0) {
            array = new Object[1];
            array[0] = n;
        } else {
            Object[] tempArray = new Object[array.length + 1];

            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            tempArray[tempArray.length - 1] = n;
            array = tempArray;
        }
    }

    public int size() {
        return array.length;
    }

    public T get(int index) {
        return (T) array[index];
    }

}
