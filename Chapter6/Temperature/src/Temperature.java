public class Temperature {
    double fahrenheit_temp = 0.0;

    public Temperature(double given_temp){
        fahrenheit_temp = given_temp;
    }

    public void setFahrenheit_temp(double given_temp){
        fahrenheit_temp = given_temp;
    }

    public double getFahrenheit_temp(){
        return fahrenheit_temp;
    }

    public double getCelsius_temp(){
        double celsius_temp = ((5.0/9.0)*(fahrenheit_temp -32.0));
        return celsius_temp;
    }

    public double getKelvin_temp(){
        double kelvin_temp = (((5.0/9.0)*(fahrenheit_temp -32.0))+273.0);
        return kelvin_temp;
    }
}
