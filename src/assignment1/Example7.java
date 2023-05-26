/*
  7) Write a Java program to check if there is a 10 in a given array of integers with a 20 somewhere
     later in the array.
*/

package assignment1;

import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 numbers : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean flag = false;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==10)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]==20)
                    {
                        flag = true;
                        break;
                    }
                }

            }

        }

        if(flag)
        {
            System.out.println("The array contains 10 followed by 20  i.e. 20 is present after 10 in array");
        }
        else
        {
            System.out.println("The array does not contain 10 followed by 20 i.e. 20 is not present after 10 in the array");
        }

        sc.close();
    }

}

