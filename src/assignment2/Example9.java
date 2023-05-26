/*
  9) Write a Java Program to demonstrate Method overriding.(create class Result with method result(). Override method
     result() in UGResult and PGResult class)
*/

package assignment2;

import java.util.*;

class Result{
    public void result(){
        System.out.println("Result declared by Result class");
    }
}

class UGResult extends Result{
    @Override
    public void result(){
        System.out.println("Result declared by UGResult class");
    }
}
class PGResult extends Result{
    @Override
    public void result(){
        System.out.println("Result declared by PGResult class");
    }
}

public class Example9 {

    public static void main(String[] args) {

        Result res = new Result();
        res.result();

        UGResult ug = new UGResult();
        ug.result();

        PGResult pg = new PGResult();
        pg.result();

    }

}
