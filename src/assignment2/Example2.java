/*
  2) Implement all String functions in java.
*/

package assignment2;

import java.util.*;

public class Example2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = "  Hello World  ";
        String str2 = "  HELLo world  ";

        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);

        // charAt method
        System.out.println("\nCharacter at index 3 of string 1 : " + str1.charAt(3));

        // compareTo method
        System.out.println("Comparing string 1 with string 2 : " + str1.compareTo(str2));

        // compareToIgnoreCase method
        System.out.println("Comparing string 1 with string 2 by ignoring cases : " + str1.compareToIgnoreCase(str2));

        // concat method
        System.out.println("Concatenating string 1 with string 2  : " + str1.concat(str2));

        // contains method
        System.out.println("Do string 1 contains 'World' ? : " + str1.contains("World"));

        // startsWith method
        System.out.println("Do string 1 starts with '  He' ? : " + str1.startsWith("  He"));

        // endsWith method
        System.out.println("Do string 1 ends with 'World  ' ? : " + str1.endsWith("World  "));

        // equals method
        System.out.println("Do string 1 equals string 2 ? : " + str1.equals(str2));

        // equalsIgnoreCase method
        System.out.println("Do string 1 equals string 2 by ignoring cases ? : "  + str1.equalsIgnoreCase(str2));

        // length method
        System.out.println("Length of the string 1 : " + str1.length());

        // toUpperCase method
        System.out.println("Uppercase string of string 1 : " + str1.toUpperCase());

        // toLowerCase method
        System.out.println("Lowercase string of string 1 : " + str1.toLowerCase());

        // substring method
        System.out.println("Substring of string 1 from index 2 to index 7 : " + str1.substring(2,7));

        // indexOf method
        System.out.println("Index of the first occurrence of 'o' in string 1 : " + str1.indexOf('o'));

        // lastIndexOf method
        System.out.println("Index of the last occurrence of 'o' in string 1 : " + str1.lastIndexOf('o'));

        // replace method
        System.out.println("Replaced string after replacing character 'o' in string 1 with character 'a' : "
                           + str1.replace('o','a'));

        // trim method
        System.out.println("Trimmed string of string 1 : " + str1.trim());

        // split method
        String[] words = str1.split(" ");
        System.out.println("Words in the string 1 : " + Arrays.toString(words));

        sc.close();

    }
}
