

public class Factorial {

    public static long factorial(int n)
    {
        // Base condition
        if(n == 0)
        {
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {

        System.out.println("***** Using Recursion *****");
        try
        {
            int num = Integer.parseInt(args[0]);
            long result = factorial(num);
            System.out.println("The factorial of " + num + " is " + result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("***** Without Using Recursion ");
        try
        {
            int num1 = Integer.parseInt(args[0]);
            long fact = 1;

            for(int i=1;i<=num1;i++)
            {
                fact *= i;
            }

            System.out.println("The factorial of " + num1 + " is " + fact);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

}
