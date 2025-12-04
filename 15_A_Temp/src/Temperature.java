import javax.smartcardio.TerminalFactory;

public class Temperature {
    public double tempInCelsius = 16;
    public double tempInFahrenheit;
    public double tempInKelvin;


    public Temperature(double tempInCelsius){
        this.tempInCelsius = tempInCelsius;
        System.out.println("added new temperature");
    }
    public void printCelsius(){
        System.out.println(tempInCelsius+ "° Celsius");

    }
    public void printHotOrColdCelsius(){
        if(tempInCelsius > 24){
            System.out.println("its hot: "+ tempInCelsius +"° celsius");
        }else{
            System.out.println("its freezing: "+ tempInCelsius + "° celsius");
        }
    }
    public void calculateCelsiusToFahrenheit(){
            tempInFahrenheit = (tempInCelsius* 1.8) + 32;
            System.out.println("them in Fahrenheit is: " +tempInFahrenheit);

    }
    public void calculateKelvin(){
        tempInKelvin = tempInCelsius + 273.15;
        System.out.println("Temp in Kelvin:" + tempInKelvin);
    }

}
