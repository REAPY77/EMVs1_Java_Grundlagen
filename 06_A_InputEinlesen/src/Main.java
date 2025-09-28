import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        //
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!

          Scanner userInput = new Scanner(System.in);

          System.out.println("what is your age?");
          int age = userInput.nextInt();
          userInput.nextLine();
          System.out.println("what is your name?");
          String firstName = userInput.nextLine();
          System.out.println("what is your second name");
          String secName = userInput.nextLine();




          System.out.println("birthdate(DD.MM.YYYY)");
          String birthDate = userInput.nextLine();
          System.out.println("what is your profession?");
          String profession = userInput.nextLine();

          System.out.println("we know this about you: Your Name is "+ firstName +" "+ secName+"." );
        System.out.println("your Profession is " + profession);
        System.out.println("you lived approx. "+ age * 365 + " days");

        //-------------------------sd---------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplication
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("enter 2 Numbers for a Substraction, Div, Additon");
        int firstOperator = userInput2.nextInt();
        int secOperator = userInput2.nextInt();
        int additon = firstOperator + secOperator;
        int substraction = firstOperator - secOperator;
        float divsion = (firstOperator / secOperator);
        int multi = firstOperator * secOperator;

        System.out.println("Additon: " + additon);
        System.out.println("Substraction: "+ substraction);
        System.out.println("Divison: "+ divsion);
        System.out.println("multiplicaton "+ multi);

        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2
        System.out.println("enter your weight in kg");
        int weight = userInput2.nextInt();
        System.out.println("enter you height in meter");
        float height = userInput2.nextFloat();
        System.out.println("your BMI is: " + weight / (height * height));




        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min
        System.out.println("enter minutes");
        int minutes = userInput.nextInt();
        int minutes2 = minutes % 60;
        int hours = minutes / 60;
        System.out.println(hours+"h "+ "and "+ minutes2 + "min"  );
        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).
        userInput.nextLine();
        System.out.println("enter radius: ");
        float r = userInput.nextFloat();

        double area = (2 * Math.PI * r * r);
        System.out.println("area: " + area );
        double circumference = (2 * Math.PI * r);
        System.out.println("circumference: " + circumference);
        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-
        System.out.println("How much is the bill?");
        int bill = userInput.nextInt();
        System.out.println("How much will you give as a tip in a percentage without the %");
        int  tipPercentage = userInput.nextInt();
        int totalBill = bill * tipPercentage /100 +bill;

        System.out.println("Total bill:  " + totalBill);

        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month
        System.out.println("what is your hourly wage?");
        int hourlyWage = userInput.nextInt();

        System.out.println("how many hours do you work a week?");
        int daysPerWeek = userInput.nextInt();
        int monthlyWage = hourlyWage * daysPerWeek;
        System.out.println("your monthly wage is: "+ monthlyWage);
        int yearlySalary = 12 * monthlyWage;
        System.out.println("your yearly salary(12m) is: " + yearlySalary);

        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input):
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!

        System.out.println("a Quiz about Destiny 2 answer with 1 or 0");
        System.out.println("Destiny 2 is a game similar to minecraft");
        String answer1 = userInput.nextLine();

        userInput.close();
        // Make sure you didn't forget to close the scanner :)
    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);