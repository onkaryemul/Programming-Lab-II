/*
   7) We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape'
      with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea'
      taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of
     'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area'
      containing all the three methods 'RectangleArea','SquareArea' and 'CircleArea' for printing the area of
      rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.
*/

package assignment3;

abstract class Shape{
    abstract void RectangleArea(int length,int breadth);
    abstract void SquareArea(int side);
    abstract void CircleArea(int radius);
}

class Area extends Shape{
    @Override
    public void RectangleArea(int length,int breadth){
        System.out.println("\nArea of Rectangle : " + (length * breadth));
    }

    @Override
    public void SquareArea(int side){
        System.out.println("\nArea of Square : " + (side * side));
    }

    @Override
    public void CircleArea(int radius){
        System.out.println("\nArea of Circle : " + (Math.PI * radius * radius));
    }
}


public class Example7 {

    public static void main(String[] args){

        Area obj = new Area();

        obj.RectangleArea(10,20);

        obj.SquareArea(15);

        obj.CircleArea(5);

    }

}
