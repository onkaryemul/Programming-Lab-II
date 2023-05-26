/*
   3) Develop a program to display contents of file supplied as command line argument.
*/

package assignment5;

import java.io.*;

public class Example3 {

    public static void main(String[] args){

        if( args.length != 1 )
        {
            System.out.println("\nInvalid Arguments!!");
            System.out.println("Usage : java assignment5.Example3 <fileName>");
            return;
        }

        String fileName = args[0];
        System.out.println("\nReading contents of a file " + fileName + " ..... \n");
        try
        {
            FileInputStream fis = new FileInputStream("C:\\Users\\Onkar\\Desktop\\Java Programs\\ProgrammingLabII\\src\\" + fileName);

            int c;

            while( (c = fis.read()) != -1 )
            {
                System.out.print((char)c);
            }

            fis.close();

            System.out.println("\n");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File " + fileName + " is not found");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred while reading the file : " + e.getMessage());
        }

    }
}
