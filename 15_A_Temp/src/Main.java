import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Temperature firstVal = new Temperature(16.2);
        System.out.println(firstVal.tempInCelsius);

        Temperature temp2 = new Temperature(18.312);
        System.out.println(temp2.tempInCelsius);

        firstVal.printCelsius();
        temp2.printCelsius();
        System.out.println("enter temperature");
        double tempForTemp3 = userInput.nextDouble();
        Temperature temp3 = new Temperature(tempForTemp3);
        temp3.printCelsius();
        temp3.printHotOrColdCelsius();
        temp3.calculateCelsiusToFahrenheit();

    }


}