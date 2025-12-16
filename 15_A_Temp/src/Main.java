import com.berufsfachschule.oop.Temperature;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Temperature temp1 = new Temperature(5.37);
        temp1.printCelsius();

        //System.out.println(temp1.tempInCelsius); Main.java lost access rights to the variable.
        System.out.println(temp1.getCelsiusToFahrenheit());

        Temperature temp2 = new Temperature(4125.223);
    }



}