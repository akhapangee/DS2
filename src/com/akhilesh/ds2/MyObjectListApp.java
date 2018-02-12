/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ds2;

import com.akhilesh.util.MyIntList;
import com.akhilesh.util.MyObjectList;

/**
 *
 * @author Akhilesh
 */
public class MyObjectListApp {

    public static void main(String[] args) {
        MyObjectList obj = new MyObjectList();
        obj.add(1);
        obj.add(4.5);
        obj.add("Akhilesh");
        obj.add("Khapangee");
        obj.add(15.55);
        obj.add(16);

        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.getValue(i));
        }
        System.out.println("==================================");
        for (Object o : obj.getAll()) {
            System.out.println(o);
        }

    }
}
