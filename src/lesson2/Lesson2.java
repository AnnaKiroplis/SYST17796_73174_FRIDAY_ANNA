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
public class Lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
/**
 * 
 * @return 
 */
    private int enterInput(){
        int bottles;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of bottles");
        try{
            bottles = input.nextInt();
        }
        catch (Exception e) {
            System.out.println("this is not an integer");
            return enterInput();
        }
        return bottles;
    }
    /**
     * 
     * @param bot
     * @param num 
     */
    private void printFirstLine(String bot, int num){
        System.out.println(num + " " + bot + "of beer on the wall, " + num + " " + bot + " of beer ");
    }
    
    private void printSecondLine(String bot, int num)
    {
        if(num>0)
        {
            System.out.println("Take it down and pass it around, " + num + " " + bot + "of beer on the wall\n");
        }
        else{
            System.out.println("Take it down and pass it around, " + "no more bottles of beer on the wall\n");
        }
    }
    
    private void printLastLyric(int num){
        System.out.println("no more bottles of beer on the wall, " + "no more bottles of beer");
        if(num !=1){
            System.out.println("Go to store and buy some more, " + num + "bottles of beer on the wall");
        }
        else{
            System.out.println("Go to store and buy some more, " + num + "bottles of beer on the wall");
        }
    }
    
    private void printSong(int initialNum){
        String plural = "bottles";
        String single = "bottle";
        int num = initialNum;
        while(num>0){
            if(num > 1){
                printFirstLine(plural, num);
                num--;
                if(num>1){
                    printSecondLine(plural, num);
                }
                else{
                    printSecondLine(single, num);
                }    
            }
            else{
                printFirstLine(single, num);
                num--;
            }
        }
    }
}
