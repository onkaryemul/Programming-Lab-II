/*
   4) Write a program using final variable to check speed limit exceeds or not on highway.
      If speed is greater than 100.Then generate alert message.
*/

package assignment3;

import java.util.*;

public class Example4 {

    public static final int SPEED_LIMIT = 100;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter your speed : ");
        double currentSpeed = sc.nextDouble();

        if(currentSpeed > SPEED_LIMIT)
        {
            System.out.println("\nSpeed limit exceeded! Slow down.");
        }
        else
        {
            System.out.println("\nYou are within the speed limit.Drive safe.");
        }

    }

}
