/*
  6) Write a Java program to convert seconds to hour, minute and seconds.
*/

package assignment1;

import java.util.Scanner;

public class Example6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds : ");
        int seconds = sc.nextInt();

        int hours = seconds/3600;
        int minutes = (seconds % 3600) / 60;
        int sec = (seconds % 3600) % 60;

        System.out.println(hours + " hr : " + minutes + " min : " + sec + " sec");

        sc.close();
    }

}
