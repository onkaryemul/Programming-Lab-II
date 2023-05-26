
import java.util.*;

class LessThanZeroException extends Exception
{
    @Override
    public String toString()
    {
        return new String("Less than 0 Error!!");
    }
}

public class UserException {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        try
        {
            int a = sc.nextInt();

            if(a<0)
            {
                throw new LessThanZeroException();
            }
        }
        catch(LessThanZeroException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
