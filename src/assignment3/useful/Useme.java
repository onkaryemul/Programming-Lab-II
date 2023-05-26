/*
   8) Define a package named 'useful' with a class name 'Useme' having following methods :
      1. area() -> To calculate area of given shape.
      2. percentage() -> To calculate percentage given total marks and marks obtained.
      Develop a program to import above package and use both methods.
*/

package assignment3.useful;

public class Useme {

    public void area(String shape,double ...params){

        if(shape.equalsIgnoreCase("rectangle"))
        {
            System.out.println("\nArea of Rectangle : " + (params[0] * params[1]));
        }
        else if(shape.equalsIgnoreCase("square"))
        {
            System.out.println("\nArea of Square : " + (params[0] * params[0]));
        }
        else if(shape.equalsIgnoreCase("circle"))
        {
            System.out.println("\nArea of Circle : " + (Math.PI * params[0] * params[0]));
        }
        else
        {
            System.out.println("Invalid Shape!!");
        }

    }

    public void percentage(double marksObtained,double totalMarks){
        System.out.println("\nPercentage : " + ( (marksObtained / totalMarks) * 100) );
    }

}
