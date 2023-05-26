/*
  7) Write a program to manage the employee allowance from a specific department by creating class structure as follow,
     InheritanceEx2
     |
     |
     InheritanceEx2Main.java
     |
     |-dept | Department.java
     |
     |
     |
     |-emp | Employee.java extends Department
     |
     |
     |
     |-allowance | Allowance.java extends Employee
     |
     |[Multilevel Inheritance]
*/

package assignment2;

import java.util.*;

class Department{
    public static Scanner sc = new Scanner(System.in);
    public int deptId;
    public String deptName;

    public Department(){} // Default constructor
    public Department(int id,String name){
        this.deptId = id;
        this.deptName = name;
    }

    public void setData(){
        System.out.println("\n\nEnter Department ID : ");
        deptId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Department Name : ");
        deptName = sc.nextLine();
    }

    public void getData(){
        System.out.println("\nDepartment ID : " + deptId);
        System.out.println("Department Name : " + deptName);
    }
}

class Employee extends Department{
    public int empId;
    public String empName;
    public double salary;

    public Employee(){} // Default constructor
    public Employee(int id,String name,int deptId,String deptName,double salary){
        super(deptId,deptName);
        this.empId = id;
        this.empName = name;
        this.salary = salary;
    }

    public void setData(){
        super.setData();

        System.out.println("Enter Employee ID : ");
        empId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Employee Name : ");
        empName = sc.nextLine();

        System.out.println("Enter Employee Salary : ");
        salary = sc.nextDouble();
    }

    public void getData(){
        super.getData();

        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee Salary : " + salary);
    }
}

class Allowance extends Employee{
    public double allowance;

    public Allowance(){} // Default constructor
    public Allowance(int id,String name,int deptId,String deptName,double salary,double allowance){
        super(id,name,deptId,deptName,salary);
        this.allowance = allowance;
    }

    public void setData(){
        super.setData();

        sc.nextLine();

        System.out.println("Enter Allowance : ");
        allowance = sc.nextDouble();
    }

    public void getData(){
        super.getData();

        System.out.println("Allowance : " + allowance);
        System.out.println("Employee total salary : " + getTotalSalary());
    }
    public double getTotalSalary(){
        return salary + allowance;
    }
}


public class Example7 {

    public static void main(String[] args) {

        Allowance alw = new Allowance(17,"Onkar Yemul",1,"CSE",10000,5000);

        System.out.println("Department ID : " + alw.deptId);
        System.out.println("Department Name : " + alw.deptName);
        System.out.println("\nEmployee ID : " + alw.empId);
        System.out.println("Employee Name : " + alw.empName);
        System.out.println("Salary : " + alw.salary);
        System.out.println("Allowance : " + alw.allowance);
        System.out.println("Total Salary : " + alw.getTotalSalary());

        Allowance alw1 = new Allowance();

        alw1.setData();
        alw1.getData();

    }
}
