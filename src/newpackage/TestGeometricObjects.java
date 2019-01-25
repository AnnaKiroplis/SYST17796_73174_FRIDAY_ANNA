
package newpackage;

import java.util.*;


public class TestGeometricObjects {


    public static void main(String[] args) {
        double radius1 = getInput("Enter radius: ");
        Circle circle1 = new Circle();
        
        System.out.println(circle1);
    }
    
    public static double getInput(String prompt)
    {
        Scanner console = new Scanner(System.in);
        System.out.print(prompt);
        double size;
        try{
            size = console.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Error, must be a number");
            size = getInput(prompt);
        }
        
        
        return size;
    }
}
