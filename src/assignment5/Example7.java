/*
   7) Write Java program to delete a file.
*/

package assignment5;

import java.io.*;

public class Example7 {

    public static void main(String[] args){

        File file = new File("C:\\Users\\Onkar\\Desktop\\Java Programs\\ProgrammingLabII\\src\\deleteFile.txt");

        if(file.exists())
        {
            if(file.delete())
            {
                System.out.println("\nFile deleted successfully!!");
            }
            else
            {
                System.out.println("\nFailed to delete the file.");
            }
        }
        else
        {
            System.out.println("\nFile does not exist.");
        }

    }

}
