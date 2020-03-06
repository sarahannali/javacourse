import java.util.Scanner;

public class Distance {
    public static void main(String[] args){

        double speed = -1;
        int hours = 0;

        Scanner keyboard = new Scanner(System.in);

        while (hours < 1){
            System.out.println("How many hours did you drive?");
            hours = keyboard.nextInt();

            if (hours >= 1){
                break;
            }

            else {
                System.out.println("Hours traveled cannot be less than 1.");
            }
        }

        while (speed < 0) {
            System.out.println("What was your speed (in mph)?");
            speed = keyboard.nextDouble();

            if (speed > 0) {
                break;
            } else {
                System.out.println("Speed cannot be negative.");
            }
        }

        System.out.println("HOUR\t\tDISTANCE");

        double traveled = speed;

        for(int i = 1; i <= hours; i++){
            System.out.println(i + "\t\t" + traveled);
            traveled += speed;
        }
    }
}
