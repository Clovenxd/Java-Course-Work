import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatergorizeStrings2 {
/*
    public static void main(String[] args){

        //array lists to hold strings
        List<String> noSpace = new ArrayList<String>(); //string <= 10 characters
        List<String> oneSpace = new ArrayList<String>(); //strings > 10 characters
        List<String> moreThanTwo = new ArrayList<String>();

        //hold user input to choose what list to display
        String input = "";
        int inf = 1;

        //for user input
        Scanner in = new Scanner(System.in);

        //program title
        System.out.println("######################");
        System.out.println("# String Categorizer #");
        System.out.println("######################\n");

        //make lists with input
        makeLists(noSpace, oneSpace, moreThanTwo);

        //ask user which string list to display
        while(inf == 1){
        System.out.print("Which string list would you like to display?\n" +
                "'0 spaces', '1 space', '>1 spaces': ");
        if(in.hasNextLine()){
            input = in.nextLine();
        }else{
            System.out.println("System input scanner does not have next line.");
        }


           if (input.toLowerCase().equals("0 spaces")) {
               display(noSpace);
           } else if (input.toLowerCase().equals("1 space")) {
               display(oneSpace);
           } else if (input.toLowerCase().equals(">1 spaces")) {
               display(moreThanTwo);
           } else {
               display(noSpace);
               display(oneSpace);
               display(moreThanTwo);

           }
       }
        in.close();
    }

    public static void makeLists(List<String> noSpace, List<String> oneSpace, List<String> moreThanTwo) {
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

            if(!(input.toLowerCase().equals("s"))) {
                if (countSpaces(input) == 0) {
                    noSpace.add(input);
                } else if (countSpaces(input) == 1) {
                    oneSpace.add(input);
                } else if (countSpaces(input) >= 2) {
                    moreThanTwo.add(input);
                }
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

    public static int countSpaces(String a){
        int count = 0;

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == ' '){
                count++;
            }
        }

        return count;
    }


 */
}