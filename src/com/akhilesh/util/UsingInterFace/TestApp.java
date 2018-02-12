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
public class TestApp {

    public static void main(String[] args) {
        CustomList<String> list = new MyList<>();
//         CustomList<String> list = new DynamicList<>();
        list.add("Akhilesh");
        list.add("Khapangee");
        list.add("Jawalakhel");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
