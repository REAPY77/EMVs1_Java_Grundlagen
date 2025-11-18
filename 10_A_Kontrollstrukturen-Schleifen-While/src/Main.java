import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Do this exercises __only__ with while-loops
        // Separate exercises for 'do-while' and 'for' will follow.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      int iteratorEx1 = 0;
        //      while (iteratorEx1 < 10) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is? A: Code would run until process is closed
        //      2. Why does this behavior occur? A: theres no break or counting upwards
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9
        //        int iteratorEx1 = 0;
        //        //      while (iteratorEx1 < 10) {
        //        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //                    i++;
        //        //      }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-06. -10 to 20
        int k = -10;
        while(k <= 20){
            System.out.println(k);
            k++;
        }
        System.out.println("stop k");
        //      02-07. 35 to 0 (descending)
        int f = 35;
        while(f >= 0){
            System.out.println(f);
            f--;
        }
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)

        //      02-10. Odd numbers from 10 to -10 (descending)


        int counter = 15; // 0, 42, 42,
        while(counter <= 100){
            System.out.println(counter);
            counter++;

        }
         int exerc2 = 10;
        while(exerc2 > -10){
            System.out.println(exerc2);
            exerc2 = exerc2 -2;


        }
        int j = 9;
        while (j >-10) {
            System.out.println(j);
            j = j - 2;
        }



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_03 = 0;
        int counter1 = 0;
        while(counter1 <=100){
            whileSum_03 = whileSum_03 + counter1;
            counter1++;

            System.out.println(whileSum_03);
        }
        System.out.println(whileSum_03);
        // Your code here

        System.out.println(whileSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_04 = 0;
        int counter2 = 0;
        while (counter2 <= 100){
            whileSum_04 = whileSum_04 + counter2;
            counter2++;
            counter2++;
            System.out.println(counter2);

        }
        // Your code here

        System.out.println(whileSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.
            int whilesum_06 = 0;
            int x = 1;
            while(x < 100){
                whilesum_06 = whilesum_06 + x;
                x = x + 2;
            }

        // Your code here
        System.out.println(whilesum_06);


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
        while (!(randomNumber == 22)) {
            randomNumber = randomGenerator.nextInt(101);
            System.out.println("not 22"+ " Attemps: "+iterationSteps );
            iterationSteps++;
        }
        System.out.println(iterationSteps);
        // Implement a while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here

        System.out.println("The program ran " + iterationSteps + " times until the number was found!");
    }
}