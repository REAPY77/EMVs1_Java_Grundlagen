public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // Andrej Liechty

        // Which are valid variable names and which are not?
        // Try to determine what is valid and what is not without uncommenting the code.
        // If something is not valid, write a comment explaining why it is not valid.

        // Example:
        // int myVariable; // Valid
        // int %myVariable; // Not Valid, starts with a special character.


        // int 1stNumber; // not valid, starts with number

        // int firstNumber; //valid

        // int tryThisNumber; //valid

        // int _myNumber; // not valid, starts with "_"

        // int int; // not valid, named after datatype

        // int _number_; // not valid, starts with "_"

        // int i; // not valid, single character

        // int number1; // valid

        // int .product; //not valid, starts with special character

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Naming convention

        // Which are recommended variable names and which are not?

        // Example:
        // int myVariable; // recommended
        // int _myVariable; // not recommended, starts with a special character
        // int g; // not recommended, depending on the context, it can make sense. E.g. in the context of gravitational acceleration

        int number1; //recommended
        int speed; // recommended
        int JustANUmber; // not recommended,
        int justAnotherNumber; // recommended
        int _weather; // not recommend
        int _Id; // Not recommend
        int $Money; // not recommended, special character
        int moneyinthebankaccount; // not recommended, to long
        int aLotOfmoneyonbankAccount; // not recommended, to long + lowerCamelCase rule
        int circumstanceEarthInKM; // recommended
        int circumstanceEarth_KM; // not recommended

        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Declaration and initialization of variables

        // Add the appropriate data type before the variable name, so, that it becomes a valid declaration and initialization.
        // (Variable names are in german to not reveal the result)

        float meineGleitkommaZahl = 23.5f;

        byte meineSehrKleineGanzzahl = 50;

        char meinUnicodeZeichen = '\u003D';

        int meineKleineGanzzahl = 200;

        char meinBuchstabe = 'B'; // str fits better

        float meineNegativeGleitkommaZahl = -14.612f;

        double meineGrosseGleitkommaZahl = 50.1234567890123d;

        boolean meinWahrheitswert1 = false;

        int meineNormaleGanzzahl = 50_000;

        long meineGrosseGanzzahl = 123_456_789_012_345L;

        boolean meinWahrheitswert2 = true;


        //--------------------------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------------------------------------------
        // Keyword final

        // Based on the variable name/value, decide if the keyword "final" is suitable or not.
        // If it is suitable, apply the recommended naming convention for variables with the "final" keyword.
        // Write -why- you decided to either mark it as final or not.


        int monyInBankAccount = 100_000; //final not recommended

        final short myBirthyear = 2001; // once set value

        final byte amountOfMonths = 12; // amount of months stay the same

        final float gravityForce = 9.81f; // wont change

        final byte amountOfMinutesPerHour = 60; // wont change

        final short amountOfSecondsPerHour = 3600; // wont change

        final float pi = 3.14159f; // stays the same everywhere

        short amountOfStudents = 167; //final not recommended

        //--------------------------------------------------------------------------------------------------------------
    }
}