/*
   2) Explain the use of word Synchronized.
*/

package assignment7;

public class Example2 {

    public static void main(String[] args){

        /*
            In Java, the synchronized keyword is used to provide mutually exclusive access to a shared resource or critical section of code,
            which ensures that only one thread can access that resource or code at a time. When a method or block of code is marked as
            synchronized, it means that the code can only be executed by one thread at a time, and all other threads that try to
            execute the same code will be blocked until the block is released.

            The synchronized keyword can be used in two ways :
            1. Synchronized Methods :
               When a method is marked as synchronized, only one thread can execute that method at a time. This is
               because the object on which method is invoked is locked by the executing thread, and other threads that try to invoke
               the same method on the same object will be blocked until the lock is released.

            2. Synchronized Blocks :
               When a block of code is marked as synchronized, only one thread can execute that block of code at a time. This is
               because that the lock is applied to a specific object that is passed as an argument to the synchronized keyword, and other
               threads that try to execute the same block of code with the same lock object will be blocked until the block is released.


            Synchronization is used to prevent race conditions and other types of concurrency issues that can occur when multiple threads
            try to access a shared resource simultaneously. By ensuring that only one thread can access the resource at a time,
            synchronization helps to prevent data corruption and other types of errors that can occur in a multithreaded environment.
            However, excessive use of synchronization can lead to performance issues, so it should be used judiciously.

        */
    }

}
