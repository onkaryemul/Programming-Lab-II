/*
   3) Write a program to display thread information.
*/

package assignment7;

class MyThread extends Thread {

    public MyThread(String name){
        super(name);
    }
}


public class Example3 {

    public static void displayInfo(Thread thread){
        System.out.println("\nThread ID : " + thread.threadId());
        System.out.println("Thread Name : " + thread.getName());
        System.out.println("Thread Priority : " + thread.getPriority());
        System.out.println("Thread State : " + thread.getState());
        System.out.println("Is Thread Alive? : " + thread.isAlive());
        System.out.println();
    }


    public static void main(String[] args){

        MyThread mythread = new MyThread("MyThread1");
        displayInfo(mythread);

        Thread mainThread = Thread.currentThread();
        displayInfo(mainThread);
    }

}
