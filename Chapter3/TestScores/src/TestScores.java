import java.util.Scanner;

public class TestScores {
    public static void main(String[] args)
    {
        int testScore;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        testScore = keyboard.nextInt();

        if (testScore > 90)
        {
            System.out.println("That's a great score!");
            System.out.println("Keep up the great work!");
        }
        else if (testScore <= 59)
        {
            System.out.println("Sorry, you failed the exam :(");
        }
        else
        {
            System.out.println("You did okay on the exam.");
        }
    }
}
