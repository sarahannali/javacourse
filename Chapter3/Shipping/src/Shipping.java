import java.util.Scanner;

public class Shipping {
    public static void main(String[] args){
        int pounds;
        double shippingCharge;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the weight of your package? ");
        pounds = keyboard.nextInt();

        if (pounds <= 2){
            shippingCharge = 1.10;
        }
        else if (pounds <= 6){
            shippingCharge = 2.20;
        }
        else if (pounds <= 10){
            shippingCharge = 3.70;
        }
        else{
            shippingCharge = 3.80;
        }

        System.out.printf("You will be charged $%,.2f", shippingCharge);
        System.out.print(" per 500 miles.");
    }
}
