/*
   1) Write a program to calculate area and volume of sphere using static variable and method create two
      static methods for area and volume calculation.(insert data from user).
*/

package assignment3;

import java.util.Scanner;

public class Example1 {

    public static double radius;

    public static double area(){
        return 4 * Math.PI * radius * radius;
    }

    public static double volume(){
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the radius of the sphere : ");
        radius = sc.nextDouble();

        System.out.println("\nThe area of the sphere is : " + area());
        System.out.println("\nThe volume of the sphere is : " + volume());

    }

}
