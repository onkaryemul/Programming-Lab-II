/*
   2) Display all your information(prn,name,age,address,class) on console without creating
      any object and writing any code in main method.
*/

package assignment3;

import java.util.*;

public class Example2 {

    public static Scanner sc = new Scanner(System.in);

    public static class Student{
          public static String prn;
          public static String name;
          public static int age;
          public static String address;
          public static String cls;

          public static void setData(){
              System.out.print("Enter name of student : ");
              name = sc.nextLine();

              System.out.print("Enter PRN of student : ");
              prn = sc.nextLine();

              System.out.print("Enter age of student : ");
              age = sc.nextInt();

              sc.nextLine();

              System.out.print("Enter address of student : ");
              address = sc.nextLine();

              System.out.print("Enter class of student : ");
              cls = sc.nextLine();
          }
    }

    public static void main(String[] args){

    }

    static{
        Student.setData();

        System.out.println("\n***** Student Details *****");
        System.out.println("Name : " + Student.name);
        System.out.println("PRN : " + Student.prn);
        System.out.println("Age : " + Student.age);
        System.out.println("Address : " + Student.address);
        System.out.println("Class : " + Student.cls);
    }

}
