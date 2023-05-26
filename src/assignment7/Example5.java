/*
   5) Write a program for thread communication and synchronization.
*/

package assignment7;

class Message {

    private int i=0;
    private boolean canReceive = false;

    synchronized public void send()
    {
        while(canReceive)
        {
            try
            {
                wait();
            }
            catch(Exception e){}

        }

        System.out.println(Thread.currentThread().getName() + " Sent : Message " + i);
        canReceive = true;
        notify();
    }

    synchronized public void receive()
    {
        while(!canReceive)
        {
            try
            {
                wait();
            }
            catch(Exception e){}
        }

        System.out.println(Thread.currentThread().getName() + " Received : Message " + i++);
        canReceive = false;
        notify();
    }

}

class Sender implements Runnable {

    private Message msg;

    public Sender(Message msg)
    {
        this.msg = msg;
    }

    @Override
    public void run()
    {
        while(true)
        {
            msg.send();
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e){}

        }

    }

}


class Receiver implements Runnable {

    private Message msg;

    public Receiver(Message msg)
    {
        this.msg = msg;
    }

    @Override
    public void run()
    {
        while(true)
        {
            msg.receive();
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e){}

        }

    }

}


public class Example5 {

    public static void main(String[] args){

        Message msg = new Message();

        Sender sender = new Sender(msg);
        Thread t1 = new Thread(sender,"Sender");

        Receiver receiver = new Receiver(msg);
        Thread t2 = new Thread(receiver,"Receiver");

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch(Exception e){}

    }

}
