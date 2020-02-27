import java.util.Scanner;

public class RomanNum {
    public static void main(String[] args){
        int num;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        num = keyboard.nextInt();

        if (num >= 1 && num <= 10){
            if (num == 1){
                System.out.print("I");
            }
            else if (num == 2){
                System.out.print("II");
            }
            else if (num == 3){
                System.out.print("III");
            }
            else if (num == 4){
                System.out.print("IV");
            }
            else if (num == 5){
                System.out.print("V");
            }
            else if (num == 6){
                System.out.print("VI");
            }
            else if (num == 7){
                System.out.print("VII");
            }
            else if (num == 8){
                System.out.print("VIII");
            }
            else if (num == 9){
                System.out.print("IX");
            }
            else{
                System.out.print("X");
            }
        }
        else{
            System.out.println("Please run the program again with a proper input.");
        }

    }
}
