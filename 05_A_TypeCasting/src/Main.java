public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.
             // Byte Casting//
        byte byte1 = 32;
        int intCasting = byte1;
        short shortCasting = byte1;
        long longCasting = byte1;
        float floatCasting = byte1;
        double doubleCasting = byte1;
        // Byte ---> Char not possible

            // Int Casting//
        int int1 = 551;
        long longCasting1 = int1;
        float floatCasting1 = int1;
        double doubleCasting1 = int1;
        // int ---> byte, short, char not possible

            // short Casting//
        int short1 = 551;
        long longCasting2 = short1;
        float floatCasting2 = short1;
        double doubleCasting2 = short1;
        // short ---> byte, char not possible

            //Char Casting//
        char char1 = 51;
        int intCasting3 = char1;
        long longCasting3 = char1;
        float floatCasting3 = char1;
        double doubleCasting3 = char1;
        // Char ---> byte and short not possible

            // long Casting//
        long long1 = 10L;
        float floatCasting4 = long1;
        double doubleCasting4 = long1;
        // long ----> byte, short, char and int are not possible

            //float Casting//
        float float1= 14.5123f;
        double doubleCasting5 = float1;
        // float ----> all except double dont work.

            // double////// --------------------------------------------------------------------------------------------------------------// 2. Now create a long with the value = 1234567890.
        //  Manually cast the long to an int and print it out
        long myLong2 = 1234567890;
        int myInt2 = (int) myLong2 ;
        System.out.println(myInt2);


        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        // Try to guess first what happens, then test it.
        // an Str and an Int are getting combined and should result in a str with "3310"
        System.out.println(myNumber);

        // Java is adding it as strings together


        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        int houseNumber = Integer.parseInt(houseNumberInString);
        System.out.println(houseNumber);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        // Nothing should go wrong in this case here

    }
}