public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Use all of your knowledge for this tasks below. You are not restricted to certain loops anymore.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Calculate and print all the leap years from 0 to today's year.
        //
        //      A year is a leap year if it is divisible by 4.
        //      However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
        //
        //      Hint1: The divisibility by a particular number can be checked using the modulo operator.
        //
        //      Hint2: Check if your implementation is correct. For example; the Year 1900 is not a leap year.
        int leapYear = 0;
            for(leapYear =0; leapYear <= 2025; leapYear++){
                if (leapYear %4 == 0  ){
                    if(leapYear %100 == 0){
                        if(leapYear %400 == 0){
                            System.out.println("year: " + leapYear + " is a leap year");
                        }else{
                            System.out.println("year: " + leapYear + " is not a leap year");
                        }
                    }else {
                        System.out.println("year: " + leapYear + " is a leap year");
                    }

                }
            }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Print out all numbers from 1-10.
        //      If a number is divisible by three, then print "Fizz".
        //      If a number is divisible by five, then print "Buzz".
        //      If a number is divisible by three and five, print "FizzBuzz".
        int rta = 0;
        int ca = 0;
        for(rta = 0; rta <= 10; rta++){
            if(rta %3 == 0){
                if(rta %5 == 0){
                    System.out.println("FizzBuzz");
                }else{
                    System.out.println("Fizz");
                }

            } else if (rta%5 == 0) {
                System.out.println("Buzz");
            }
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");  // Challenge!
        // 03.  Given a number n (n > 2 && n < 100), write a program which tells if n is a prime.
        //      Example: n = 7 -> "It's a prime number!"
        //      Example: n = 10 -> "It's not a prime number!"

        int a = 7; // change this value from prime to not prime to test

        // Your code here

        boolean isPrime = true;          // solution of Finn

        if (a <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    isPrime = false;
                }
            }
        }

        if (isPrime) {
            System.out.println("It's a prime number!");
        } else {
            System.out.println("It's not a prime number!");
        }




        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");  // Challenge+!
        // 04. Print all prime numbers from 2-100.
    }
}