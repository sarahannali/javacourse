import java.util.Scanner;

public class IngredientAdjuster {
    public static void main(String[] args){
        double sugar = 1.5/48;
        double butter = 1.0/48;
        double flour = 2.75/48;
        double numCookies;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many cookies would you like to make? ");
        numCookies = keyboard.nextDouble();

        System.out.println("You will need:");
        System.out.println("    " + (sugar * numCookies) + " cup(s) of sugar");
        System.out.println("    " + (butter * numCookies) + " cup(s) of butter");
        System.out.println("    " + (flour * numCookies) + " cup(s) of flour");
    }
}