/*
   3) Write a program in java to show the use of finally keyword.
*/

package assignment4;

import java.util.*;

public class Example3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("\nEnter value of numerator : ");
            int numerator = sc.nextInt();

            System.out.print("Enter value of denominator : ");
            int denominator = sc.nextInt();

            int result = numerator/denominator;
            System.out.println("Numerator/Denominator : " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : " + e.getMessage());
            return;
        }
        finally
        {
            System.out.println("This finally block is always executed.");
            sc.close();
        }

        System.out.println("Program executed successfully!!");

    }

}
