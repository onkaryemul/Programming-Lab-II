/*
   2) Write a program to write bytes to a file.
*/

package assignment5;

import java.io.*;

public class Example2 {

    public static void main(String[] args){

        try
        {
            String file = "C:\\Users\\Onkar\\Desktop\\Java Programs\\ProgrammingLabII\\src\\outputBytes.txt";
            FileOutputStream fos = new FileOutputStream(file);

            String message = "Hello, World!";

            byte[] bytes = message.getBytes();

            fos.write(bytes);
            fos.close();

            System.out.println("Bytes written to file successfully!!");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred while writing to the file : " + e.getMessage());
        }

    }

}
