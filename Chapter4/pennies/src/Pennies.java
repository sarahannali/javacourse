import java.util.Scanner;

public class Pennies {
    public static void main(String[] args){
        int daysWorked;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many days did you work?");
        daysWorked = keyboard.nextInt();

        if (daysWorked < 1){
            System.out.println("Please enter a number greater than 0!");
            daysWorked = keyboard.nextInt();
        }

        System.out.println("DAY || PENNIES");

        float totalPay = 0;
        float pennies = 1;

        for (int i = 1; i <= daysWorked; i++){
            System.out.println(i + " || $" + String.format("%.2f", pennies/100));
            totalPay += pennies;
            pennies *= 2;
        }

        System.out.println("Total Pay: $" + String.format("%.2f", totalPay/100));
    }
}
