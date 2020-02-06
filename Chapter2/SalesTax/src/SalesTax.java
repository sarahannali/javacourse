import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SalesTax {

    public static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        final double STATE_TAX = 0.04;
        final double COUNTY_TAX = 0.02;
        double price;
        double totalPrice;
        double totalTax;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What was the price of the object? ");
        price = keyboard.nextDouble();

        totalTax = STATE_TAX + COUNTY_TAX;
        totalPrice = price * (1 + totalTax);

        System.out.println("The original price was: $" + df.format(price));
        System.out.println("The state sales tax rate is " + STATE_TAX + " and the county sales tax rate is " + COUNTY_TAX);
        System.out.println("The total tax was $" + df.format((price * totalTax)));
        System.out.println("The total sale price was: $" + df.format(totalPrice));
    }
}
