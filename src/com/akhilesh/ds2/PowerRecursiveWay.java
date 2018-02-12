/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.ds2;

import java.util.Scanner;

/**
 *
 * @author Akhilesh
 */
public class PowerRecursiveWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("The power: " + power(2, 0));

    }

    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return base;
        }
        return base * power(base, exp - 1);
    }

}
