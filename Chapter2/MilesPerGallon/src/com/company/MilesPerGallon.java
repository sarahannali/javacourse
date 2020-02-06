import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
	    double miles;
	    double gallons;
	    double mpg;

	    Scanner keyboard = new Scanner(System.in);

	    System.out.print("Enter the number of miles driven: ");
	    miles = keyboard.nextDouble();

        System.out.print("Enter the gallons of gas used: ");
        gallons = keyboard.nextDouble();

        mpg = miles/gallons;

        System.out.println("Your fuel efficiency was " + mpg + "mpg");
    }
}