/*
   2) Write a program in java to handle custom exception with single try block and multiple catch block.
*/

package assignment4;

import java.util.*;

class CustomException extends Exception{
    public CustomException(String message)
    {
        super(message);
    }
}


public class Example2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("\nEnter value of numerator : ");
            int numerator = sc.nextInt();
            System.out.print("Enter value of denominator : ");
            int denominator = sc.nextInt();

            if( denominator == 0 )
            {
                throw new CustomException("Division by zero");
            }

            int result = numerator/denominator;
            System.out.println("Numerator/Denominator : " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : " + e.getMessage());
        }
        catch(CustomException e)
        {
            System.out.println("CustomException : " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Exception : " + e.getMessage());
        }

        sc.close();
    }

}
