/*
  5) Create a class named 'Shape' with a method to print "This is shape". Then create two other classes named 'Rectangle',
    'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape"
     respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the
     method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
*/

package assignment2;

class Shape{
    public void display1(){
        System.out.println("This ia s shape");
    }
}

class Rectangle extends Shape{
    public void display2(){
        System.out.println("This is a rectangular shape");
    }
}

class Circle extends Shape{
    public void display3(){
        System.out.println("This is a circular shape");
    }
}

class Square extends Rectangle{
    public void display4(){
        System.out.println("Square is a rectangle");
    }
}


public class Example5 {

    public static void main(String[] args) {

        Square sq = new Square();

        sq.display1();
        sq.display2();

    }
}
