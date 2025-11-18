import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with do-while-loops.
        // Separate exercises 'for' will follow.
        // Exercise 01-06 are similar to the while-exercises, just with a do-while instead of a while-loop.
        // Exercise 07 and 08 are new exercises.
        //--------------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      int iteratorEx1 = 0;
        //
        //      do {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //      while (iteratorEx1 < 10);
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      2. Why does this behavior occur?
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9 A: setting the variable to a specific value
        //      4. Extra: What happens, if the initial value of "iteratorEx1" would be set to 100 instead of 0?A:
        //          it would print out 100 and the while loop wouldnt trigger


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using do-while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        int abc = 0;
        do {
            System.out.println(abc);
            abc++;
        }while (abc <= 100);


        //      02-02. 42 to 100
        int abr = 42;
        do{
            System.out.println(abr);
            abr++;
        }while(abr <= 100);
        //      02-03. 42 to 123
        int ab1 = 42;
        do{
            System.out.println(ab1);
            ab1++;
        }while(ab1 <= 123);
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        int ac1 = 0;
        do{
            System.out.println(ac1);
            ac1= ac1 + 2;
        }while(ac1 <= 10);
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        int ar1 = 1;
        do{
            System.out.println(ar1);
            ar1 = ar1 + 2;
        }while(ar1 <= 10);
        //      02-06. -10 to 20
        int rt1 = -10;
        do{
            System.out.println(rt1);
            rt1++;
        }while (rt1 <= 20);

        //      02-07. 35 to 0 (descending)
        int af1 = 35;
        do {
            System.out.println(af1);
            af1--;
        }while (af1 >= 0);

        //      02-08. 15 to -20 (descending)
        int ax1 = 15;
        do {
            System.out.println(ax1);
            ax1--;
        }while(ax1 >= -20);
        //      02-09. Even numbers from 10 to -10 (descending)
        int av1 = 10;
        do {
            System.out.println(av1);
            av1--;
            av1--;
        }while (av1 >= -10);
        //      02-10. Odd numbers from 10 to -10 (descending)
        int an1 = 9;
        do {
            System.out.println(an1);
            an1--;
            an1--;
        } while (an1 > -10 );


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_03 = 0;
        int counter1 = 0;
        do {
            System.out.println(whileSum_03);
            whileSum_03 = whileSum_03 + counter1;
            counter1++;

        }while (counter1 <= 100);

        // Your code here

        System.out.println(whileSum_03); // Should be 5050


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_04 = 0;

        int counter2 = 0;
        do{
            System.out.println(whileSum_04);
            if((counter2 %2) == 0 ){
                whileSum_04 = whileSum_04 + counter2;
                counter2++;
            }else {
                counter2++;
            }
        }while (counter2 <= 100);

        System.out.println(whileSum_04); // Should be 2550


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_05 = 0;

        int counter3 = 0;
        do{
            if(counter3 %2 != 0){
                System.out.println(whileSum_05);
                whileSum_05 = whileSum_05 + counter3;
                counter3++;
            }else {
                counter3++;
            }
        }while (counter3 <= 100);

        System.out.println(whileSum_05); // Should be 2500


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Generate random numbers between 0 and 100 (inclusive) until you get 22.
        //      Count and report how many attempts it took to generate 22.

        // Creating an object of type Random, calling it randomGenerator.
        // Check the import at the very beginning of this file. This import is needed to make this work
        Random randomGenerator = new Random();

        // Declaring an integer
        int randomNumber;

        // Setting the value of the integer to a random number between 0 (inclusive) and 101 (exclusive)
        randomNumber = randomGenerator.nextInt(101);
        long iterationSteps = 0;
        do {
            System.out.println(randomNumber);
            randomNumber = randomGenerator.nextInt(101);
            iterationSteps++;

            }while(randomNumber != 22);


        // Implement a do-while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here

        System.out.println("The program ran " + iterationSteps + " times until the number was found!");


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 07");
        // 07.  Generate random numbers between 0 and 100 (inclusive) until you get a match with the firstRandomNumber.
        //      Use a do-while loop, initializing the second random number inside the loop.
        //      Count and report how many attempts it took to generate a matching number.

        // We can use the random generator from exercise 06. So the following line is not needed:
        // Random randomGenerator = new Random();

        // Declaring and initializing the first random number
        int firstRandomNumber = randomGenerator.nextInt(101);

        // Declaring the second random number (will be initialized in the loop)
        int secondRandomNumber;

        // Reinitializing the iteration counter (Using the variable from exercise 06, resetting here)
        iterationSteps = 0;

        // Implement a do-while loop that:
        // 1. Generates a new random number for secondRandomNumber every single time
        // 2. Increments the iteration count
        // 3. Continues until firstRandomNumber equals secondRandomNumber

        // Your code here

        System.out.println("The program ran " + iterationSteps + " times until both random numbers matched.");
        System.out.println("The matching number was: " + firstRandomNumber);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 08");
        // 08.  Generate a random number between 0 and 10 (inclusive).
        //      Use a do-while loop to repeatedly ask the user to guess the number.
        //      Continue asking until the user correctly guesses the random number.
        //      Once guessed correctly, congratulate the user and reveal the number.

        // We can use the random generator from exercise 06/07. So the following line is not needed:
        // Random randomGenerator = new Random();

        // Creating a scanner object to handle user input
        Scanner input = new Scanner(System.in);

        // Generating a random number between 0 (inclusive) and 11 (exclusive)
        int rndNumberToGuess = randomGenerator.nextInt(11);

        // Declaring the variable for the user's guess
        int guessedNumber;

        int guess = input.nextInt();
        do{
            System.out.println("wrong, enter new guess");
            guess = input.nextInt();
        }while(rndNumberToGuess != guess);
        System.out.println("right");

        // Implement a do-while loop that:
        // 1. Asks the user to guess the number
        // 2. Reads the user's input
        // 3. Continues until the guessed number matches the random number

        // Your code here

        System.out.println("Congratulations! You've guessed the correct number: " + rndNumberToGuess);

    }
}