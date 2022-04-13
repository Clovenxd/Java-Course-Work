import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategorizeStrings {

    /*
    public static void main(String[] args){

        //array lists to hold strings
        List<String> small = new ArrayList<String>(); //string <= 10 characters
        List<String> large = new ArrayList<String>(); //strings > 10 characters

        //hold user input to choose what list to display
        String input = "";

        //for user input
        Scanner in = new Scanner(System.in);

        //program title
        System.out.println("######################");
        System.out.println("# String Categorizer #");
        System.out.println("######################\n");

        //make lists with input
        makeLists(small, large);

        //ask user which string list to display
        System.out.print("Which string list would you like to display?\n" +
                            "Short(<= 10 characters), long( >10 characters): ");
        if(in.hasNextLine()){
            input = in.nextLine();
        }else{
            System.out.println("System input scanner does not have next line.");
        }

        if(input.toLowerCase().equals("short")){
            display(small);
        }else{
            display(large);
        }
        in.close();
    }

    public static void makeLists(List<String> small, List<String> large) {
        Scanner in = new Scanner(System.in);
        String input = "";
        int i = 0;

        while (i <= 20 && !(input.toLowerCase().equals("s"))) {

            System.out.print("Please enter the string you wish to store, or enter 's' to stop: ");
            if (in.hasNextLine()) {
                input = in.nextLine();
            }else{
                System.out.println("System input scanner does not have next line.");
            }

            if (!(input.toLowerCase().equals("s"))) {
                if (input.length() <= 10) {
                    small.add(input);
                } else {
                    large.add(input);
                }
            }else if(input.toLowerCase().equals("s")){
                System.out.println("Sentinel value entered. Stopped getting input....");
                break;
            }
            i++;
        }
    }

    public static void display(List<String> a){

        if(a.toArray().length == 0){
            System.out.println("The selected list is empty.");
        }else{
            for(int i = 0; i < a.toArray().length; i ++) {
                System.out.println(a.toArray()[i]);
            }
        }
    }

     */
}
