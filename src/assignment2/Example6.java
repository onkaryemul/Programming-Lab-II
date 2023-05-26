/*
  6) Create game characters using the concept of inheritance. Suppose, in your game, you want three characters - a maths
     teacher, a footballer and a businessman. Since, all of the characters are persons, they can walk and talk. However,
     they also have some special skills. A maths teacher can teach maths, a footballer can play football and a businessman
     can run a business. You can individually create three classes who can walk, talk and perform their special skill as
     shown in the figure below.

     In each of the classes, you would be copying the same code for walk and talk for each character. If you want to
     add a new feature - eat, you need to implement the same code for each character. This can easily become error prone
     (when copying) and duplicate codes. It'd be a lot easier if we had a Person class with basic features like talk, walk,
     eat, sleep, and add special skills to those features as per our characters. This is done using inheritance.

     Using inheritance, now you don't implement the same code for walk and talk for each class. You just need to inherit them.
     So, for Maths teacher(derived class), you inherit all features of a Person(base class) and add a new feature TeachMaths.
     Likewise, for a footballer, you inherit all the features of a Person and add a new feature PlayFootball and so on.
*/

package assignment2;

import java.util.*;

class Person{

    public String name;
    public String profession;

    public Person(){} // Default constructor
    public Person(String name, String profession){
        this.name = name;
        this.profession = profession;
    }
    public void walk(){
        System.out.println("Feature : Walk");
    }

    public void talk(){
        System.out.println("Feature : Talk");
    }

    public void eat(){
        System.out.println("Feature : Eat");
    }

    public void sleep(){
        System.out.println("Feature : Sleep");
    }

    public void display(){
        System.out.println("\nName : " + name);
        System.out.println("Profession : " + profession);
        walk();
        talk();
        eat();
        sleep();
    }
}

class MathsTeacher extends Person{

    public MathsTeacher() {} // Default constructor
    public MathsTeacher(String name){
        super(name,"Maths Teacher");
    }
    public void teachMaths(){
        System.out.println("Feature : Teach Maths");
    }
}

class Footballer extends Person{

    public Footballer(){} // Default constructor
    public Footballer(String name){
           super(name,"Footballer");
    }

    public void playFootball(){
        System.out.println("Feature : Play Football");
    }
}

class Businessman extends Person{

    public Businessman(String name){
        super(name,"Businessman");
    }
    public void runBusiness(){
        System.out.println("Feature : Run Business");
    }
}

public class Example6 {

    public static void main(String[] args) {

         MathsTeacher mt = new MathsTeacher("Onkar Yemul");
         mt.display();
         mt.teachMaths();

         Footballer fb = new Footballer("Pranav Kadam");
         fb.display();
         fb.playFootball();

         Businessman bs = new Businessman("Kishan Gyamlani");
         bs.display();
         bs.runBusiness();

    }
}
