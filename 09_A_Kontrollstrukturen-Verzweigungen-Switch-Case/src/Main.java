import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.

        Scanner userInput = new Scanner(System.in);
         System.out.println("enter a day of the week as a digit");
        byte dayOfWeek = userInput.nextByte();
        switch (dayOfWeek){
            case 1:
                System.out.println("its Monday");
                break;
            case 2:
                System.out.println("its Tuesday");
                break;
            case 3:
                System.out.println("its Wednesday");
                break;
            case 4:
                System.out.println("its thursday");
                break;
            case 5:
                System.out.println("its friday");
                break;

            case 6:
                System.out.println("its saturday");
                break;
            case 7:
                System.out.println("its sunday");
                break;
            default:
                System.out.println("number is invalid");
                break;



        }
        System.out.println("-----------------------------------------------");
        switch (dayOfWeek){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("does not exist");
        }



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.
        userInput.nextLine();
        System.out.println("enter month as a word");

        String monthInString = userInput.nextLine();

        switch (monthInString) {
            case "january","February", "December":
                System.out.println("Winter");
                break;
            case "March", "April", "May":
                System.out.println("spring");
                break;


            case "June", "August", "July":
                System.out.println("Summer");
                break;


            case "September", "October","November":
                System.out.println("Autumn");
                break;






            default:

        }
        System.out.println("modern switch case");
        switch (monthInString){
            case "january","February", "December" -> System.out.println("Winter");
            case "March", "April", "May" -> System.out.println("spring");
            case "June", "August", "July" -> System.out.println("summer");
            case "September", "October","November" -> System.out.println("Autumn");
            default -> System.out.println("invalid");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.
        System.out.println("enter month as a digit");
        byte monthInNumber = userInput.nextByte();
        System.out.println("Using new switch expression:");
        switch (monthInNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 Days");
            case 4, 6, 9, 11 -> System.out.println("30 Days");
            case 2 -> System.out.println("28 Days");
            default -> System.out.println("invalid month");
        }
        System.out.println();



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"
        int strength = 0;
        int agility = 0;
        int intelligence = 0;
        String class1 = "";

        System.out.println("choose your class: \n 1. Warrior \n 2. Mage \n 3. Rogue \n 4. Cleric" );
        byte classInput = userInput.nextByte();
        switch (classInput) {
            case 1 -> {
                strength = 12;
                agility = 5;
                intelligence = 2;
                class1 = "Warrior";

            }
            case 2 ->{
                strength = 3;
                agility = 5;
                intelligence = 11;
                class1 = "Mage";
            }
            case 3 -> {
                strength = 7;
                agility = 7;
                intelligence = 2;
                class1 = "Rogue";

            }

            case 4 -> {
                strength = 5;
                agility = 5;
                intelligence = 9;
                class1 = "Cleric";

            }
            default -> System.out.println("not possible");
        }
        System.out.println(class1 + " str: " + strength + " intel: " + intelligence + " agility: " + agility);





        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi
        System.out.println("enter number, which you want to translate (0-9)");
        byte numberInput1 = userInput.nextByte();
        System.out.println("in which language do you want it translated? (1-german, 2-english, 3-japanese)");
        byte modeInput1 = userInput.nextByte();

        switch (numberInput1) {
            case 0 -> {
                if (modeInput1 == 1){
                    System.out.println("null");

                } else if (modeInput1== 2) {
                    System.out.println("zero");
                } else if (modeInput1== 3) {
                    System.out.println("zero");
                }}
            case 1 -> {
                if (modeInput1 == 1){
                    System.out.println("eins");

                } else if (modeInput1== 2) {
                    System.out.println("one");
                } else if (modeInput1== 3) {
                    System.out.println("ichi");
                }}
            case 2 ->{
                if (modeInput1 == 1){
                    System.out.println("zwei");

                } else if (modeInput1== 2) {
                    System.out.println("two");
                } else if (modeInput1== 3) {
                    System.out.println("ni");
                }}
            case 3 ->{
                if (modeInput1 == 1){
                    System.out.println("drei");

                } else if (modeInput1== 2) {
                    System.out.println("three");
                } else if (modeInput1== 3) {
                    System.out.println("san");
                }}
            case 4 ->{
                if (modeInput1 == 1){
                    System.out.println("vier");

                } else if (modeInput1== 2) {
                    System.out.println("four");
                } else if (modeInput1== 3) {
                    System.out.println("shi");
                }}
            case 5 ->{
                if (modeInput1 == 1){
                    System.out.println("fünf");

                } else if (modeInput1== 2) {
                    System.out.println("five");
                } else if (modeInput1== 3) {
                    System.out.println("go");
                }}
            case 6 ->{
                if (modeInput1 == 1){
                    System.out.println("sechs");

                } else if (modeInput1== 2) {
                    System.out.println("six");
                } else if (modeInput1== 3) {
                    System.out.println("roku");
                }}
            case 7 ->{
                if (modeInput1 == 1){
                    System.out.println("sieben");

                } else if (modeInput1== 2) {
                    System.out.println("seven");
                } else if (modeInput1== 3) {
                    System.out.println("nana");
                }}
            case 8 ->{
                if (modeInput1 == 1){
                    System.out.println("acht");

                } else if (modeInput1== 2) {
                    System.out.println("eight");
                } else if (modeInput1== 3) {
                    System.out.println("hachi");
                }}
            case 9 -> {
                if (modeInput1 == 1) {
                    System.out.println("neun");

                } else if (modeInput1 == 2) {
                    System.out.println("nine");
                } else if (modeInput1 == 3) {
                    System.out.println("kyuu");
                }}
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!
        System.out.println("..............CALCULATOR...............");
        int total = 0;

        System.out.println("enter 2 numbers\nenter first number: ");
        int calcNumber1 = userInput.nextInt();

        System.out.println("enter second number:");
        int calcNumber2 = userInput.nextInt();

        System.out.println("enter mode (add, sub, div, multi)");
        userInput.nextLine();
        String numberMode = userInput.nextLine();
        switch (numberMode){
            case "add","additon","Addition" -> {
                total = calcNumber1 + calcNumber2;
            }
            case "sub", "Sub","subtraction", "Subtraction" -> {



                total = calcNumber1 - calcNumber2;
            }
            case "div", "division", "Division", "Div" ->{
                if (calcNumber2 == 0){
                    System.out.println("cant divide by 0, \n enter other number");
                    calcNumber2 = userInput.nextInt();
                    total = calcNumber1 / calcNumber2;
                }else {
                    total = calcNumber1 / calcNumber2;
                }
            }
            case "mutli", "Mutli","multiplication", "Multiplication"-> {
                total = calcNumber1 * calcNumber2;
            }
            default -> System.out.println("not valid operation");
        }
        System.out.println("output: "+ total);
        System.out.println("_________________________________________");
        /*
        System.out.println("..............CALCULATOR(FLOAT)...............");
        float total = 0;

        System.out.println("enter 2 numbers\nenter first number: ");
        float calcNumber1 = userInput.nextFloat();

        System.out.println("enter second number:");
        float calcNumber2 = userInput.nextFloat();

        System.out.println("enter mode (add, sub, div, multi)");
        userInput.nextLine();
        String numberMode = userInput.nextLine();
        switch (numberMode){
            case "add","additon","Addition" -> {
                total = calcNumber1 + calcNumber2;
            }
            case "sub", "Sub","subtraction", "Subtraction" -> {



                total = calcNumber1 - calcNumber2;
            }
            case "div", "division", "Division", "Div" ->{
                if (calcNumber2 == 0){
                    System.out.println("cant divide by 0, \n enter other number");
                    calcNumber2 = userInput.nextFloat();
                    total = calcNumber1 / calcNumber2;
                }else {
                    total = calcNumber1 / calcNumber2;
                }
            }
            case "multi", "Multi","multiplication", "Multiplication"-> {
                total = calcNumber1 * calcNumber2;
            }
            default -> System.out.println("not valid operation");
        }
        System.out.println("output: "+ total);
        System.out.println("_________________________________________"); */

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.

    }
}