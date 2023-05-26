

class ClassA{
    protected int a;
    public int b;
    private int c;

    public ClassA(){}

    public ClassA(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class ClassB extends ClassA {
    private int d;

    public ClassB(){}

    public ClassB(int a,int b,int c,int d)
    {
        super(a,b,c);
        this.d = d;
    }

    public void printValues(){
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("d : " + d);
    }

}

class ClassC extends ClassB {
    protected int e;
    private int f;

    public ClassC(){}

    public ClassC(int a,int b,int c,int d,int e,int f){
        super(a,b,c,d);
        this.e = e;
        this.f = f;
    }

    public void printValues(){
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("e : " + e);
        System.out.println("f : " + f);
    }
}


public class Example11 {

    public static void main(String[] args) {

        ClassC obj = new ClassC(1,2,3,4,5,6);
        obj.printValues();
    }
}

/*
   In this example, ClassB inherits from ClassA using public and protected access specifiers, and ClassC inherits from ClassB using protected and private
   access specifiers.
*/