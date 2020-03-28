public class CelciusTable {
    public static void main (String[] args){
        System.out.println("F\tC");
        for (double i = 0; i < 21; i++){
            System.out.print(i);
            System.out.print("\t");
            System.out.printf("%.2f\n",celciusConverter(i));
        }
    }

    public static double celciusConverter(double farenheit){
        double celcius = ((farenheit - 32)*(5.0/9.0));
        return celcius;
    }
}
