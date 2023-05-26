/*
   8) Write Java Program to display text file information.
*/

package assignment5;

import java.io.*;

public class Example8 {

    public static void main(String[] args){

        File file = new File("C:\\Users\\Onkar\\Desktop\\Java Programs\\ProgrammingLabII\\src\\file.txt");

        if(file.exists())
        {
            System.out.println("\nFile Name : " + file.getName());
            System.out.println("Absolute Path : " + file.getAbsolutePath());
            System.out.println("Size : " + file.length() + " bytes");
            System.out.println("Readable : " + file.canRead());
            System.out.println("Writable : " + file.canWrite());
        }
        else
        {
            System.out.println("\nFile does not exist.");
        }

    }

}
