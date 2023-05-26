/*
   1) Write a program in java to handle below exceptions :
      a. Divide by Zero
      b. Array Index Out of Bound
      c. Number Format
      d. Null Pointer
*/

package assignment4;

import java.util.Scanner;

public class Example1 {

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
            System.out.println("Division by zero is not allowed.");
        }

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
            System.out.println("Array Index Out of Bound");
        }

        try
        {
            System.out.print("\nEnter a number : ");
            int str = Integer.parseInt(sc.next());

            int a = 2;

            System.out.println(str + "/" + a + " = " + str/a);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Incorrect Number format\n");
        }

        try
        {
            String a = null;

            if(a.length() == 0)
            {
                System.out.println("\nLength of string is 0");
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("\nNull Pointer Exception");
        }

        sc.close();


    }

}
