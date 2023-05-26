/*
   4) Create a thread using Thread class and Runnable interface.
*/

package assignment7;

// By extending Thread class
class MyThread1 extends Thread {

    @Override
    public void run(){
        for(int i=1;i<=20;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Thread is created by extending Thread class");
        }
    }

}

// By implementing Runnable interface
class MyRunnable implements Runnable {

    @Override
    public void run(){
        for(int i=1;i<=20;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

            System.out.println("Thread is created by implementing Runnable interface");
        }
    }

}

public class Example4 {

    public static void main(String[] args){

        MyThread1 t1 = new MyThread1();
        t1.start();

        MyRunnable runnable = new MyRunnable();
        Thread t2 =  new Thread(runnable);
        t2.start();

    }

}
