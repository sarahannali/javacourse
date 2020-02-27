import java.util.Scanner;

public class TimeCalc {
    public static void main(String[] args)
    {
        double seconds;

        final double SECONDS_PER_MINUTE = 60.0;
        final double SECONDS_PER_HOUR = 3600.0;
        final double SECONDS_PER_DAY = 86400.0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number of seconds: ");
        seconds = keyboard.nextDouble();

        if (seconds >= SECONDS_PER_DAY)
        {
            System.out.println("That is about " + seconds/SECONDS_PER_DAY + " day(s).");
        }
        else if (seconds >= SECONDS_PER_HOUR)
        {
            System.out.println("That is about " + seconds/SECONDS_PER_HOUR + " hour(s).");
        }
        else if (seconds >= SECONDS_PER_MINUTE)
        {
            System.out.println("That is about " + seconds/SECONDS_PER_MINUTE + " minute(s).");
        }
    }
}
