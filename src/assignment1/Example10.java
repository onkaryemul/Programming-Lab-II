/*
  10) Write a Program to implement different types of constructors.
*/

package assignment1;

class Constructors{
    int x;

    // Default constructor or Non-parameterized constructor
    public Constructors(){
        System.out.println("\nDefault constructor or non-parameterized constructor called");
    }

    // Parameterized constructor
    public Constructors(int x){
        this.x = x;
        System.out.println("\nParameterized constructor called with value of x : " + x);
    }

    // Copy Constructor
    public Constructors(Constructors c){
        this.x = c.x;
        System.out.println("\nCopy constructor called with value of x : " + x);
    }

}

public class Example10 {

    public static void main(String[] args) {

        // Calling non-parameterized constructor or default constructor
        Constructors c1 = new Constructors();

        // Calling parameterized constructor
        Constructors c2 = new Constructors(10);

        // Calling copy constructor
        Constructors c3 = new Constructors(c2);

    }

}
