/*
   5) Write a program in java for custom exception to check speed of car on highway, if speed exceeds 120Km/hr then throw
      a 'Speed Limit Exceeded' exception.(use throw)
*/

package assignment4;

import java.util.*;

class SpeedLimitException extends Exception{
    public SpeedLimitException(String message)
    {
        super(message);
    }
}


public class Example5 {

    public static void checkSpeed(int speed) throws SpeedLimitException{
        if(speed > 120)
        {
            throw new SpeedLimitException("Speed Limit Exceeded");
        }
        else
        {
            System.out.println("\nSpeed is within limit.");
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("\nEnter speed of your car : ");
            int speed = sc.nextInt();

            checkSpeed(speed);
        }
        catch(SpeedLimitException e)
        {
            System.out.println("\nException : " + e.getMessage());
        }

        sc.close();
    }

}
