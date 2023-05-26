/*
   5) Write Java program to append text/string in a file.
*/

package assignment5;

import java.io.*;
import java.util.*;

public class Example5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter text to be appended to file : ");
        String textToAppend = sc.nextLine();

        try
        {
            File file = new File("C:\\Users\\Onkar\\Desktop\\Java Programs\\ProgrammingLabII\\src\\appendFile.txt");

            FileWriter fileWriter = new FileWriter(file,true);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(textToAppend);

            bufferedWriter.close();
            fileWriter.close();

            System.out.println("\nAppended text/string successfully to the file!!");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred while appending to the file : " + e.getMessage());
        }

        sc.close();
    }

}

