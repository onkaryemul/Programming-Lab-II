/*
   4) Write Java program to read text from file from a specified index or skipping byte using FileInputStream.
*/

package assignment5;

import java.io.*;
import java.util.*;

public class Example4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\Onkar\\Desktop\\Java Programs\\ProgrammingLabII\\src\\input.txt");

            System.out.println("\nEnter index from which you want to read text : ");
            int index = sc.nextInt();

            fis.skip(index);

            int c;
            System.out.println("\nReading input.txt from index " + index + " ..... \n");
            while( (c = fis.read()) != -1 )
            {
                System.out.print((char)c);
            }

            fis.close();

            System.out.println();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File input.txt is not found");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred while reading the file input.txt : " + e.getMessage());
        }

    }

}
