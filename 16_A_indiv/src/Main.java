import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput =  new Scanner(System.in);
        System.out.println("|----------------------------------------|");
        System.out.println("| XXX  1  XXX      -         XXX  2  XXX |");
        System.out.println("|                  -                     |");
        System.out.println("|----------------------------------------|");



        AudioController disk1 = new AudioController("non-selected");
        AudioController disk2 = new AudioController("non-selected")

        System.out.println("enter ´1´ or ´2´ for changing disk");
        System.out.println("enter ´4´ for Master Volume");
        System.out.println("");
        System.out.println("'exit' to leave");
        System.out.println("'return' to discard changes");

        String options = userInput.nextLine();



            switch (options){
                case "1", "2" -> {
                    System.out.println("1) new track");
                    System.out.println("2) stop");
                    String selectionOption = userInput.nextLine();
                    if(selectionOption.equals("1")){
                        System.out.println("enter name of the track");
                        String trackname = userInput.nextLine();
                        if (options.equals("1")){
                            disk1.trackName = trackname;

                        }else{
                            disk2.trackName = trackname;
                        }
                    }else {
                        if (options.equals("1")){
                            disk1.trackName = "";

                        }else {
                            disk2.trackName = "";
                        }
                    }

                }


            }


        }
    }
}