import java.util.Scanner;

public class RetailCalc {
    public static void main (String[] args){
        double wholesale;
        double markup;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the wholesale price? ");
        wholesale = keyboard.nextDouble();
        System.out.print("What is the markup percentage? ");
        markup = keyboard.nextDouble();

        double retailPrice = retailCalc(wholesale, markup);
        System.out.printf("The retail price is $%,.2f", retailPrice);
    }

    public static double retailCalc (double wholesale, double markup){
        double retailPrice = wholesale + (wholesale * markup/100);
        return retailPrice;
    }
}
