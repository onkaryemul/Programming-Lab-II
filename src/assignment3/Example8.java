/*
   8) Define a package named 'useful' with a class name 'Useme' having following methods :
      1. area() -> To calculate area of given shape.
      2. percentage() -> To calculate percentage given total marks and marks obtained.
      Develop a program to import above package and use both methods.
*/

package assignment3;

import assignment3.useful.Useme;

public class Example8 {

    public static void main(String[] args){

        Useme obj = new Useme();

        obj.area("rectangle",10,20);
        obj.area("square",15);
        obj.area("circle",5);

        obj.percentage(80,100);
    }

}
