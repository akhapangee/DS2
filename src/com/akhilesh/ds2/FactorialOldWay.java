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
public class FactorialOldWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find factorial of: ");

        int num = input.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + num + " is : " + factorial);

    }

}
