import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args){
        double mass;
        double velocity;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the mass of the object? ");
        mass = keyboard.nextDouble();
        System.out.print("What is the velocity of the object? ");
        velocity = keyboard.nextDouble();

        System.out.printf("The kinetic energy is %.2f",kineticEnergy(mass, velocity));
    }

    public static double kineticEnergy(double mass, double velocity){
        double kineticEnergy = ((1.0/2.0)*(mass)*(velocity*velocity));
        return kineticEnergy;
    }
}
