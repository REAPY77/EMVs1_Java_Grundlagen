public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        String[] names = new String[10];
        names[0] = "Primis";
        names[1] = "Andrej";
        names[2] = "Crota";
        names[3] = "Oryx";
        names[4] = "Epstein";
        names[5] = "Rhulk";
        names[6] = "Rasputin";
        names[7] = "Charlie";
        names[8] = "Meriton";
        names[9] = "Noe";

        System.out.println(names[4]);
        System.out.println(names[2]);

        names[0] = "Primus";

        System.out.println(names.length);

        System.out.println(); //better visual
        System.out.println("for loop:");
        System.out.println();

        for(int iterative = 0; iterative < names.length; iterative++){
            System.out.println(names[iterative]);
        }

        System.out.println();
        System.out.println("for-each loop:");
        System.out.println();

        for(String name : names){
            System.out.println(name);
        }
        System.out.println("dynamic for loop");
        System.out.println("");

        for(int iterative = 2; iterative < names.length - 2 ; iterative++){
            System.out.println(names[iterative]);
        }


    }
}