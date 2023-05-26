/*
   6) An abstract class has a constructor which prints "This is constructor of abstract class", an abstract
      method named 'a_method' and a non-abstract method which prints "This is a normal method of abstract class".
      A class 'SubClass' inherits the abstract class and has a method named 'a_method' which prints "This is abstract
      method". Now create an object of 'SubClass' and call the abstract method and the non-abstract method.
*/

package assignment3;

abstract class AbstractClass{

    public AbstractClass(){
        System.out.println("\nThis is constructor of abstract class");
    }

    abstract void a_method();

    public void normalMethod(){
        System.out.println("\nThis is a normal method of abstract class");
    }
}

class SubClass extends AbstractClass{
    @Override
    public void a_method(){
        System.out.println("\nThis is abstract method");
    }
}


public class Example6 {

    public static void main(String[] args){

        SubClass obj = new SubClass();
        obj.a_method();
        obj.normalMethod();
    }

}
