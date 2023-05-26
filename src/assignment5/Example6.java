/*
   6) Write Java program to read a file line by line.
*/

package assignment5;

import java.io.*;

public class Example6 {

    public static void main(String[] args){

        try
        {
            File file = new File("C:\\Users\\Onkar\\Desktop\\Java Programs\\ProgrammingLabII\\src\\file.txt");

            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            System.out.println("\nReading file.txt line by line .....\n");
            String line;
            while( (line = br.readLine()) != null )
            {
                System.out.println(line);
            }

            br.close();
            fr.close();

            System.out.println("\nFile is successfully read line by line!!");
        }
        catch(IOException e)
        {
            System.out.println("An error occurred while reading the file file.txt : " + e.getMessage());
        }

    }

}
