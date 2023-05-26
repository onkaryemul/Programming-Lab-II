/*
  10) Write a java program to create a class called STUDENT with data members PRN, Name and age. Using inheritance, create
      a classes called UGSTUDENT and PGSTUDENT having fields as semester, fees and stipend. Enter the data for at least
      5 students. Find the semester wise average age for all UG and PG students separately.
*/

package assignment2;

import java.util.*;

class STUDENT{

    public Scanner sc = new Scanner(System.in);

    public String PRN;
    public String Name;
    public int age;

    public STUDENT(){}

    public STUDENT(String PRN,String Name,int age){
        this.PRN = PRN;
        this.Name = Name;
        this.age = age;
    }

    public void setData(){
        System.out.print("Enter Name of Student : ");
        Name = sc.nextLine();

        System.out.print("Enter PRN : ");
        PRN = sc.nextLine();

        System.out.print("Enter Age : ");
        age = sc.nextInt();
    }

    public void getData(){
        System.out.println("Name : " + Name);
        System.out.println("PRN : " + PRN);
        System.out.println("Age : " + age);
    }
}

class UGSTUDENT extends STUDENT{
    public Scanner sc = new Scanner(System.in);

    static int ugsum = 0;

    public int semester;
    public int fees;
    public int stipend;

    public UGSTUDENT(){}

    public UGSTUDENT(String PRN,String Name,int age,int semester,int fees,int stipend){
        super(PRN,Name,age);

        this.semester = semester;
        this.fees = fees;
        this.stipend = stipend;

        ugsum += age;
    }

    public void setData(){
        super.setData();

        System.out.print("Enter Semester : ");
        semester = sc.nextInt();

        System.out.print("Enter Fees : ");
        fees = sc.nextInt();

        System.out.print("Enter Stipend : ");
        stipend = sc.nextInt();

        ugsum += age;
    }

    public void getData(){
        super.getData();

        System.out.println("Semester : " + semester);
        System.out.println("Fees : " + fees);
        System.out.println("Stipend : " + stipend);
    }
}

class PGSTUDENT extends STUDENT{
    public Scanner sc = new Scanner(System.in);

    static int pgsum = 0;

    public int semester;
    public int fees;
    public int stipend;

    public PGSTUDENT(){}

    public PGSTUDENT(String PRN,String Name,int age,int semester,int fees,int stipend){
        super(PRN,Name,age);

        this.semester = semester;
        this.fees = fees;
        this.stipend =stipend;

        pgsum += age;
    }

    public void setData(){
        super.setData();

        System.out.print("Enter Semester : ");
        semester = sc.nextInt();

        System.out.print("Enter fees : ");
        fees = sc.nextInt();

        System.out.print("Enter stipend : ");
        stipend = sc.nextInt();

        pgsum += age;
    }

    public void getData(){
        super.getData();

        System.out.println("Semester : " + semester);
        System.out.println("Fees : " + fees);
        System.out.println("Stipend : " + stipend);
    }

}


public class Example10{

    public static void main(String[] args){

        ArrayList<UGSTUDENT> ug = new ArrayList<>();
        ArrayList<PGSTUDENT> pg = new ArrayList<>();

        System.out.println("\n***** Enter data of UG Students *****");
        for(int i=0;i<5;i++)
        {
            UGSTUDENT ugstu = new UGSTUDENT();
            ugstu.setData();

            ug.add(ugstu);

            System.out.println();
        }

        System.out.println("\n***** Enter data of PG Students *****");
        for(int i=0;i<5;i++)
        {
            PGSTUDENT pgstu = new PGSTUDENT();
            pgstu.setData();

            pg.add(pgstu);

            System.out.println();
        }

        System.out.println("\n***** UG Students Data ***** ");
        for(int i=0;i<5;i++)
        {
            ug.get(i).getData();
            System.out.println();
        }

        System.out.println("\n***** PG Students Data *****");
        for(int i=0;i<5;i++)
        {
            pg.get(i).getData();
            System.out.println();
        }

        System.out.println("\nAverage age of UG Students : " + UGSTUDENT.ugsum/5.0);
        System.out.println("\nAverage age of PG Students : " + PGSTUDENT.pgsum/5.0);

    }

}




