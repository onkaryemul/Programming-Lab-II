/*
    Create below table in database:
    Student(Roll_No int, Name String, City varchar, Grade Char, Marks number).
       Write a java program to perform below operations also use exception handling to handle different
    exceptions(like database connection error, query error,etc. as per your choice)

    a) Insert below data in above table:
        1,Atul,Sangli,A,90.50
        2,Sangaram,Sangli,B,70.25
        3,Satya,Mumbai,B,61.36
        4,Jaydeep,Pune,B,60.95
        5,Prashant,Sangli,C,55.26
        6,Abhi,Pune,C,55.84
*/

package assignment8;

import java.sql.*;

public class ExampleA {

    // JDBC driver name and database URL
    public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

    // Database credentials
    public static final String USER = "system";
    public static final String PASSWORD = "admin";

    public static void main(String[] args){

        Connection conn = null;
        Statement stmt = null;

        try
        {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("\nConnecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);

            // Create table
            System.out.println("\nCreating table in given database...");
            stmt = conn.createStatement();

            // Student(Roll_No int, Name String, City varchar, Grade Char, Marks number).
            String query = "CREATE TABLE Student " +
                           "(Roll_No INTEGER PRIMARY KEY, " +
                           " Name VARCHAR2(25), " +
                           " City VARCHAR2(25), " +
                           " Grade CHAR(1), " +
                           " Marks NUMBER(4,2) )";

            stmt.executeUpdate(query);
            System.out.println("\nTable created successfully...");

            // Insert data
            /*
                a) Insert below data in above table:
                    1,Atul,Sangli,A,90.50
                    2,Sangram,Sangli,B,70.25
                    3,Satya,Mumbai,B,61.36
                    4,Jaydeep,Pune,B,60.95
                    5,Prashant,Sangli,C,55.26
                    6,Abhi,Pune,C,55.84
            */
            System.out.println("\nInserting records into the table...");
            query = "INSERT INTO Student VALUES (1,'Atul','Sangli','A',90.50)";
            stmt.executeUpdate(query);

            System.out.println("Inserted first record successfully.");

            query = "INSERT INTO Student VALUES (2,'Sangram','Sangli','B',70.25)";
            stmt.executeUpdate(query);

            System.out.println("Inserted second record successfully.");

            query = "INSERT INTO Student VALUES (3,'Satya','Mumbai','B',61.36)";
            stmt.executeUpdate(query);

            System.out.println("Inserted third record successfully.");

            query = "INSERT INTO Student VALUES (4,'Jaydeep,','Pune','B',60.95)";
            stmt.executeUpdate(query);

            System.out.println("Inserted fourth record successfully.");

            query = "INSERT INTO Student VALUES (5,'Prashant','Sangli','C',55.26)";
            stmt.executeUpdate(query);

            System.out.println("Inserted fifth record successfully.");

            query = "INSERT INTO Student VALUES (6,'Abhi','Pune','C',55.84)";
            stmt.executeUpdate(query);

            System.out.println("Inserted sixth record successfully.");

            System.out.println("\nRecords inserted successfully...");

            // Retrieving data
            System.out.println("\nFetching data from the table...");
            query = "SELECT Roll_No,Name,City,Grade,Marks FROM Student";
            ResultSet rs = stmt.executeQuery(query);

            // Display retrieving data
            while(rs.next())
            {
                int rollNo = rs.getInt("Roll_No");
                String name = rs.getString("Name");
                String city = rs.getString("City");
                String grade = rs.getString("Grade");
                double marks = rs.getDouble("Marks");

                System.out.println("Roll No: " + rollNo +
                                   ", Name: " + name +
                                   ", City: " + city +
                                   ", Grade : " + grade +
                                   ", Marks: " + marks);
            }

            // close resources
            rs.close();
            stmt.close();
            conn.close();
        }
        catch(SQLException se)
        {
            // Handle errors for JDBC
            se.printStackTrace();
        }
        catch(Exception e)
        {
            // Handle errors for Class.forName
            e.printStackTrace();
        }
        finally
        {
            // close resources
            try
            {
                if(stmt!=null)
                {
                    stmt.close();
                }
            }
            catch(SQLException se2)
            {
                se2.printStackTrace();
            }

            try
            {
                if(conn!=null) {
                    conn.close();
                }
            }
            catch(SQLException se3)
            {
                se3.printStackTrace();
            }
        }

    }
}


