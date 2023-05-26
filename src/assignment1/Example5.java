/*
  5) Write java program for reading input of various data types from user using scanner class.
*/

package assignment1;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.print("Byte : ");
          byte d = sc.nextByte();
          System.out.println(d);

          System.out.print("Short : ");
          short shrt = sc.nextShort();
          System.out.println(shrt);

          System.out.print("Int : ");
          int a = sc.nextInt();
          System.out.println(a);

          System.out.print("Long : ");
          long l = sc.nextLong();
          System.out.println(l);

          System.out.print("Float : ");
          float b = sc.nextFloat();
          System.out.println(b);

          System.out.print("Double : ");
          double c = sc.nextDouble();
          System.out.println(c);

          System.out.print("String : ");
          String s = sc.next();
          System.out.println(s);

          sc.nextLine();

          System.out.print("String Line : ");
          String strLine = sc.nextLine();
          System.out.println(strLine);

          System.out.print("Character : ");
          char ch = sc.next().charAt(0);
          System.out.println(ch);


          sc.close();

    }
}
