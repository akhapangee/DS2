/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ds2;

import com.akhilesh.util.MyIntList;

/**
 *
 * @author Akhilesh
 */
public class MyIntListApp {
    
    public static void main(String[] args) {
        MyIntList obj = new MyIntList();
        obj.add(1);
        System.out.println("Size: " + obj.size());
        obj.add(12);
        System.out.println("Size: " + obj.size());
        obj.add(13);
        System.out.println("Size: " + obj.size());
        obj.add(154);
        System.out.println("Size: " + obj.size());
        obj.add(15);
        System.out.println("Size: " + obj.size());
        obj.add(16);
        System.out.println("Size: " + obj.size());
        
        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.getValue(i));
        }
        
        
    }
}
