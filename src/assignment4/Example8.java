/*
   8) Write a program in java for handling checked exceptions using throws keyword.
*/

package assignment4;

import java.io.*;
import java.util.*;

public class Example8 {

    public static void readFile(String fileName) throws FileNotFoundException {

        File file = new File("C:\\Users\\Onkar\\Desktop\\Java Programs\\ProgrammingLabII\\src\\file.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

    public static void main(String[] args){

        try
        {
            readFile("file.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("FileNotFoundException : " + e.getMessage());
        }

    }

}
