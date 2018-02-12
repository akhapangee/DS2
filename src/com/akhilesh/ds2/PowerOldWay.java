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
public class PowerOldWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("The power: " + power(4, 1));

    }

    static int power(int base, int exp) {

        int total = 1;
        if (exp == 0) {
            return 1;
        } else {
            for (int i = 0; i < exp; i++) {
                total = total * base;
            }
        }
        return total;
    }

}
