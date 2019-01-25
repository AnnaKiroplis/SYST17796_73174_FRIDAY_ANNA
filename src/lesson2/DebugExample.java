/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;

/**
 *
 * @author annak
 */

public class DebugExample {

    public static void main(String[] args) {
        Scanner keysIn = new Scanner(System.in);
        System.out.println("Factorial Calculator");
        System.out.println("Calculates factorials for values less than 25.");

        System.out.print("Enter number: ");
        long num = keysIn.nextLong();

        while (num > 0 && num < 25) {
            long fact = factorial(num);
            System.out.println(num + "! = " + fact);
            System.out.print("Another number: ");
            num = keysIn.nextLong();
        }

        System.out.println("Thanks!");
    }

    /**
    * This method calculates factorial value
    * @param n number
    * @return factorial value
    */
    public static long factorial(long n) {
        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        
        return fact;
    }
}