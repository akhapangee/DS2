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
public class MyList<T> implements CustomList<T> {

    private Object[] array = new Object[0];

    @Override
    public void add(T t) {
        if (array.length == 0) {
            array = new Object[1];
            array[0] = t;
        } else {
            Object[] tempArray = new Object[array.length + 1];

            System.arraycopy(array, 0, tempArray, 0, array.length);
            tempArray[tempArray.length - 1] = t;
            array = tempArray;
        }
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public int size() {
        return array.length;
    }

}
