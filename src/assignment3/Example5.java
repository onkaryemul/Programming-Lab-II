/*
   5) Create an abstract class 'Bank' with an abstract method 'getBalance'. $100,$150 and $200 are deposited in
      banks A,B and C respectively.'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a
      method named 'getBalance'. Call this method by creating an object of each of the three classes.
*/

package assignment3;

abstract class Bank{
    abstract int getBalance();
}

class BankA extends Bank{
    @Override
    public int getBalance(){
        return 100;
    }
}

class BankB extends Bank{
    @Override
    public int getBalance(){
        return 150;
    }
}

class BankC extends Bank{
    @Override
    public int getBalance(){
        return 200;
    }
}


public class Example5 {

    public static void main(String[] args){

        BankA A = new BankA();
        System.out.println("\nBalance in Bank A :  $" + A.getBalance());

        BankB B = new BankB();
        System.out.println("\nBalance in Bank B :  $" + B.getBalance());

        BankC C = new BankC();
        System.out.println("\nBalance in Bank C :  $" + C.getBalance());

    }

}
