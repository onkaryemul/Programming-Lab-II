/*
  12) Write a program to implement a class Teacher contains two fields Name and Qualification. Extend the class to
      Department, it contains Dpt.No. and Dept.Name. An Interface named as College it contains one field Name of the
      College. Using the above classes and Interface get the appropriate information and display it.

*/

package assignment2;

import java.util.*;

class Teacher{

    public static Scanner sc = new Scanner(System.in);
    private String name;
    private String qualification;

    public Teacher(){}

    public Teacher(String name,String qualification)
    {
        this.name = name;
        this.qualification =qualification;
    }

    public void setData(){
        System.out.print("Enter Teacher Name : ");
        name = sc.nextLine();

        System.out.print("Enter Qualification of Teacher : ");
        qualification = sc.nextLine();
    }

    public void getData(){
        System.out.println("Teacher Name : " + name);
        System.out.println("Qualification : " + qualification);
    }
    public String getName(){
        return name;
    }

    public String getQualification(){
        return qualification;
    }
}

class DepartmentD extends Teacher{
    private int deptNo;
    private String deptName;

    public DepartmentD(){}

    public DepartmentD(String name,String qualification,int deptNo,String deptName){
        super(name,qualification);
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public void setData(){
        super.setData();

        System.out.print("Enter Department Name : ");
        deptName = sc.nextLine();

        System.out.print("Enter Department No. : ");
        deptNo = sc.nextInt();

        sc.nextLine();
    }

    public void getData(){
        super.getData();

        System.out.println("Department Name : " + deptName);
        System.out.println("Department No. : " + deptNo);
    }

    public int getDeptNo(){
        return deptNo;
    }

    public String getDeptName(){
        return deptName;
    }
}

interface College{
    String collegeName = "Walchand College of Engineering";
}

class DisplayInformation implements College{

    public void display(){
        System.out.println("College Name : " + collegeName);
    }

    public void display(DepartmentD d){
        System.out.println("Name : " + d.getName());
        System.out.println("Qualification : " + d.getQualification());
        System.out.println("Department Number : " + d.getDeptNo());
        System.out.println("Department Name : " + d.getDeptName());
        System.out.println("College Name : " + collegeName);
    }

}

public class Example12 {

    public static void main(String[] args) {

        DepartmentD d = new DepartmentD("Onkar Yemul","Ph.D",1,"CSE");

        DisplayInformation displayInformation = new DisplayInformation();
        displayInformation.display(d);

        System.out.println();

        DepartmentD d1 = new DepartmentD();
        d1.setData();
        System.out.println();
        d1.getData();
        displayInformation.display();
    }
}
