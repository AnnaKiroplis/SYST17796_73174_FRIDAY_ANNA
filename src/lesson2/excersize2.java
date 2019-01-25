/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;

public class excersize2 {

    public static void main(String[] args) {
        excersize2 amount = new excersize2();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numOfCoins = input.nextInt();
        
        int numberQuarter = amount.remainderQuarters(numOfCoins);
        int numberDime = amount.remainderDimes(numberQuarter);
        int numberNickle = amount.remainderNickles(numberDime);
        
        if(numberNickle != 0)
        {
            System.out.println("Pennies: " + numberNickle);
        }
    }
    
    public int remainderQuarters (int numOfCoins){
        int numOfQuarters = numOfCoins/25;
        int remainder = numOfCoins % 25;
        if(numOfQuarters != 0)
        {
            System.out.println("Quarters: " + numOfQuarters);
        }
        return remainder;
    }
    
    public int remainderDimes (int numOfCoins){
        int numOfDimes = numOfCoins/10;
        int remainder = numOfCoins % 10;
        if(numOfDimes != 0)
        {
            System.out.println("Dimes: " + numOfDimes);
        }
        return remainder;
    }
    
    public int remainderNickles (int numOfCoins){
        int numOfNickles = numOfCoins/5;
        int remainder = numOfCoins % 5;
        if(numOfNickles != 0)
        {
            System.out.println("Nickles: " + numOfNickles);
        }
        return remainder;
    }
}
