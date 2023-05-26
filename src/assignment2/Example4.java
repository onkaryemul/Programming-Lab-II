/*
  4) Explain with example declaration of string using string literal and new keyword.
*/

package assignment2;

import java.util.*;

public class Example4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaration of string using string literal
        String str1 = "Hello World";
        String str2 = "Hello World";

        System.out.println("\nBoth str1 and str2 are created using string literal.");
        if(str1 == str2)
        {
            System.out.println("Both str1 and str2 are referring to same string.");
        }
        else
        {
            System.out.println("Both str1 and str2 are referring to different strings.");
        }

        // Declaration of string using new keyword
        String str3 = new String("Hello World");
        String str4 = new String("Hello World");

        System.out.println("\nBoth str3 and str4 are created using new keyword.");
        if(str3 == str4)
        {
            System.out.println("Both str3 and str4 are referring to same string.");
        }
        else
        {
            System.out.println("Both str3 and str4 are referring to different strings.");
        }

        sc.close();
    }
}
