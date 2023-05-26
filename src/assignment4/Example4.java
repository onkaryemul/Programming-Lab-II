/*
   4) Write a program in java for handling exceptions with nested try block.
*/

package assignment4;

import java.util.*;

public class Example4 {

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

            try
            {
                int[] arr = {1,2,3,4,5};

                System.out.println("\nArray arr ,which is of size 5 ,contains 5 numbers ");

                System.out.print("Enter index to know number : ");
                int index = sc.nextInt();

                System.out.println("Value at index " + index + " is " + arr[index]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : " + e.getMessage());
        }

        sc.close();
    }

}
