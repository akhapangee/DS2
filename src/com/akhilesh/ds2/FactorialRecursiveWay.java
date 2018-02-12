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
public class FactorialRecursiveWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find factorial of: ");

        int num = input.nextInt();

        System.out.println(factorial(num));
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int total = n * factorial(n - 1);
        return total;
    }

}
