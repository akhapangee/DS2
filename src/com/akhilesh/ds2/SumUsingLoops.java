/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ds2;

/**
 *
 * @author Akhilesh
 */
public class SumUsingLoops {

    public static void main(String[] args) {
        int total = 0;

        for (int i = 2; i < 10; ++i) {
            total += i;
        }
        System.out.println("Sum: " + total);

        System.out.println("===============================");
        int a = 5;
        do {
            System.out.println("hello once!");
        } while (a > 5);
    }
}
