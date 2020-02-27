import java.util.Scanner;

public class BookClub {
    public static void main(String[] args){

        int books;
        int points;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many books did you purchase this month? ");
        books = keyboard.nextInt();

        switch(books){
            case 0:
                points = 0;
                break;
            case 1:
                points = 5;
                break;
            case 2:
                points = 15;
                break;
            case 3:
                points = 30;
                break;
            default:
                points = 60;
                break;
        }

        System.out.printf("You purchased " + books + " books so you earned " + points + " points.");
    }
}
