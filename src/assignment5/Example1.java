/*
   1) Write a program to copy contents of one file to another file.
*/

package assignment5;

import java.io.*;

public class Example1 {

    public static void main(String[] args){

        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\Onkar\\Desktop\\Java Programs\\ProgrammingLabII\\src\\input.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Onkar\\Desktop\\Java Programs\\ProgrammingLabII\\src\\output.txt");

            int c;

            while( (c=fis.read()) != -1)
            {
                fos.write(c);
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully!!");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred while copying the file : " + e.getMessage());
        }

    }

}
