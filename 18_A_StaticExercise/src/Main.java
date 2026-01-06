
public class Main {
    public static void main(String[] args) {

        // theres no class defined with this so it doesnt even really exist
        System.out.println(Math.PI);
        //Math.abs(); total absolut
        // Math.sin(); sinnus formula
        //Math.pow() power of ..

        String testStr = "Hello World!";
        Utils.printStringOut(testStr); // its easier/less annoying using this instead of creating each time a new class
        int[][] array2d = {
                {1, 2, 3, 4},
                {5},
                {6, 7},

        };
        System.out.println(array2d[2][1]);
    }
}