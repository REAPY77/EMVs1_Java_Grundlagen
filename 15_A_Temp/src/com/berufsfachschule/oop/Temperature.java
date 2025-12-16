package com.berufsfachschule.oop;

public class Temperature {
    private double tempInCelsius;



    public Temperature(double tempInCelsius){
        this.tempInCelsius = tempInCelsius;
        System.out.println("added new temperature");
    }

    public Temperature()
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
    public double getCelsiusToFahrenheit(){
            return((tempInCelsius* 1.8) + 32);


    }
    public double getCelsiusToKelvin(){
        return(tempInCelsius + 273.15);

    }
    public double getTempInCelsius(){
        return(tempInCelsius);
    }
    public double setTempInCelsius(){

    }


}
