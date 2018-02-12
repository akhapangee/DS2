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
public class MyIntList {

    int[] array = new int[0];

    public void add(int n) {
        if (array.length == 0) {
            array = new int[1];
            array[0] = n;
        } else {
            int[] tempArray = new int[array.length + 1];

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

    public int getValue(int index) {
        return array[index];
    }
}
