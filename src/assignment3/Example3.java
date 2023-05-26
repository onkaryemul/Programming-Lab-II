/*
   3) Demonstrate how to use static inner class and non-static inner class to access static and non-static
      members of outer class.
*/

package assignment3;

class OuterClass{
    public static int staticOuterVar = 10;
    public int nonStaticOuterVar = 20;

    public static class StaticInnerClass{

        public void accessStaticMembers(){
            System.out.println("\nAccessing static member from static inner class : " + staticOuterVar);
        }

    }

    public class NonStaticInnerClass{

        public void accessNonStaticMembers(){
            System.out.println("\nAccessing non-static member from non-static inner class : " + nonStaticOuterVar);
        }

    }

}


public class Example3 {

    public static void main(String[] args){

        OuterClass.StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
        staticInner.accessStaticMembers();

        OuterClass outer = new OuterClass();
        OuterClass.NonStaticInnerClass inner = outer.new NonStaticInnerClass();
        inner.accessNonStaticMembers();

    }

}
