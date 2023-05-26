
/*

// JDBC Program 1 --> command line execution

import java.sql.*;

public class Database
{
    public static void main(String[] args) throws Exception {

        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm=con.createStatement();

        ResultSet res=stm.executeQuery("select * from dept");

        int deptno;
        String dname;

        while(res.next())
        {
            deptno = res.getInt("deptno");
            dname = res.getString("dname");

            System.out.println(deptno + " " + dname);
        }

        stm.close();
        con.close();
    }

}

*/


/*

// JDBC Program 2 --> IDE Library Setup

import java.sql.*;

public class Database {

    public static void main(String[] args) throws Exception {

        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm=con.createStatement();

        ResultSet rs=stm.executeQuery("select * from students");

        while(rs.next())
        {
            System.out.println(rs.getInt("roll") + " " +
                               rs.getString("name") + " " +
                               rs.getString("city") + " " +
                               rs.getInt(4));
        }

        stm.close();
        con.close();

    }

}

*/


/*

// JDBC Program 3 --> PreparedStatement

import java.sql.*;
import java.util.*;

public class Database {

    public static void main(String[] args) throws Exception {

        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        PreparedStatement stm=con.prepareStatement("select * from students where deptno=?");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dept Number : ");
        int deptno=sc.nextInt();

        stm.setInt(1,deptno);

        ResultSet rs=stm.executeQuery();

        while(rs.next())
        {
            System.out.println(rs.getInt("roll") + " " +
                    rs.getString("name") + " " +
                    rs.getString("city") + " " +
                    rs.getInt(4));
        }

        stm.close();
        con.close();

    }

}

 */



// JDBC Program 4 & 5  --> DML using JDBC & DDL using JDBC

import java.sql.*;
import java.util.*;

public class Database {

    public static void main(String[] args) throws Exception {

       // DML using JDBC

       // Insert
       /*

        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm=con.createStatement();

        stm.executeUpdate("insert into dept values(70,'CHEM')");

        stm.close();
        con.close();

        */


        // Delete
        /*

        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm=con.createStatement();

        stm.executeUpdate("delete from dept where deptno>=60");

        stm.close();
        con.close();

        */


        // Update
        /*

        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm=con.createStatement();

        stm.executeUpdate("update dept set dname='CHEM' where deptno=50");

        stm.close();
        con.close();

       */


        // Insert using PreparedStatement
        /*

        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        PreparedStatement stm=con.prepareStatement("insert into students values(?,?,?,?)");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student data");
        int roll=sc.nextInt();
        String name=sc.next();
        String city=sc.next();
        int deptno=sc.nextInt();

        stm.setInt(1,roll);
        stm.setString(2,name);
        stm.setString(3,city);
        stm.setInt(4,deptno);

        stm.executeUpdate();

        stm.close();
        con.close();

       */




        // DDL using JDBC

        // Create
        /*

        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm=con.createStatement();

        stm.executeUpdate("create table Temp(a integer,b float)");

        stm.close();
        con.close();

        */


        // Drop
        /*

        Class.forName("org.sqlite.JDBC");

        Connection con=DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm=con.createStatement();

        stm.executeUpdate("drop table Temp");

        stm.close();
        con.close();

       */

    }

}

