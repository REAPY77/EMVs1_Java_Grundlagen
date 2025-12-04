import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);
        System.out.println("|----------------------------------------|");
        System.out.println("| XXX  1  XXX      -         XXX  2  XXX |");
        System.out.println("|                  -                     |");
        System.out.println("|----------------------------------------|");



        AudioController disk1 = new AudioController("non-selected");

        System.out.println("enter ´1´ or ´2´ for changing disk");
        System.out.println("enter ´3´ for EQ Adjustments");
        System.out.println("enter ´4´ for Master Volume");
        System.out.println("");
        byte options = userInput.nextByte();
        if (options == 1){
            System.out.println("enter track name");
            String track = userInput.nextLine();
            disk1.trackName = track;


        }
    }
}