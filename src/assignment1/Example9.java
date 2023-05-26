/*
  9) Write a Java Program to find transpose of Matrix.
*/

package assignment1;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix : ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns in the matrix : ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        int[][] transpose = new int[columns][rows];

        System.out.println("\nEnter the elements of the matrix : ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe original matrix is : ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(matrix[i][j] +  "  ");
                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("\nThe transpose of the matrix is : ");
        for(int i=0;i<columns;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }

        sc.close();

    }

}
