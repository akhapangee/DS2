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
public class SumUsingRecursion {

    public static void main(String[] args) {
        System.out.println(sum(1, 5));
    }

    static int sum(int start, int end) {
        if (start == end) {
            return start;
        }
        int s = start + sum(++start, end);
        return s;
    }
}
