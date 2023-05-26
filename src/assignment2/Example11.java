/*
  11) Implement hybrid inheritance using all access specifiers(public,private,protected).
*/

package assignment2;

import java.util.*;

class ClassA{
    private int a= 5;

    public void display(){
        System.out.println("a : " + a);
    }
}

class ClassB extends ClassA{
    public int b = 5;
    protected int b1 = 1;
}

class ClassC extends ClassA{
    public void display(){
        ClassB objB = new ClassB();
        System.out.println("b : " + objB.b);
        System.out.println("b1 : " + objB.b1);
    }
}

class ClassD extends ClassB{

    public void display(){
        ClassB objB = new ClassB();
        System.out.println("b : " + objB.b);
        System.out.println("b1 : " + objB.b1);
    }
}

class ClassE extends ClassB{

    public void display(){
        ClassB objB = new ClassB();
        System.out.println("b : " + b);
        System.out.println("b1 : " + b1);
    }
}


public class Example11 {

    public static void main(String[] args) {

        ClassA a = new ClassA();
        a.display();

        ClassA b = new ClassB();
        b.display();

        ClassA c = new ClassC();
        c.display();

        ClassA d = new ClassD();
        d.display();

        ClassA e = new ClassE();
        e.display();

    }
}

