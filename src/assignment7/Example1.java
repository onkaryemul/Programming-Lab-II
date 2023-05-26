/*
   1) Can we call the run() method instead of start()?
*/

package assignment7;

public class Example1 {

    public static void main(String[] args){

        /*
            It is not recommended to call the run() method instead of start() method for creating a new thread, because:

            When we call the start() method on a Thread object, the JVM creates a new thread and calls the run() method on that new
            thread. This allows the run() method to run concurrently with our program, which is the main benefit of multithreading.
            The run() method is the entry point for the new thread, and we can override it to define the code that you want to run
            in the new thread.

            If we call the run() method directly, it will be executed in the context of the current thread and not
            in a new thread. This means that the run() method will not run concurrently with other code in our
            program, which defeats the purpose of multithreading.

            So, in summary, we should always call the start() method to create a new thread and start the execution
            of that thread. Never call the run() method directly if you want to achieve multithreading.
        */
    }

}
