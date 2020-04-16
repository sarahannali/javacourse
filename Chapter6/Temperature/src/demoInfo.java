import java.util.Scanner;

public class demoInfo {
    public static void main(String[] args){
        double given_temp;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is the temperature in fahrenheit? ");
        given_temp = keyboard.nextDouble();

        Temperature temp = new Temperature(given_temp);
        System.out.println("Celsius: " + temp.getCelsius_temp());
        System.out.println("Kelvin: " + temp.getKelvin_temp());
    }
}
