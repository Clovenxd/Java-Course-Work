import java.util.ArrayList;
import java.util.Scanner;

public class BirthdayReminder {

    /*
    public static void main(String[] args){

        int entered;
        String input;
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> bdays = new ArrayList<String>();



        System.out.println("#####################");
        System.out.println("# BirthDay Reminder #");
        System.out.println("#####################\n");

        getInput(names, bdays);

        display(names, bdays);


    }

    public static void getInput(ArrayList<String> a, ArrayList<String> b){
        String input = "";
        Scanner in = new Scanner(System.in);
        int count = 0, max = 0;


        while(!(input.equals("ZZZ")) && max < 10){
            System.out.print("Enter name of friend.: ");
            if(in.hasNextLine()){
                input = in.nextLine();
            }else{
                System.out.println("System input scanner does not have next line.");
            }
            if(input.equals("ZZZ")){
                break;
            }else{
                a.add(input);
                count++;
                System.out.print("enter the birthday for " + input + ": ");
                if(in.hasNextLine()){
                    input = in.nextLine();
                }else{
                    System.out.println("System input scanner does not have next line.");
                }
                if(input.equals("ZZZ")){
                    break;
                }else{
                    b.add(input);
                }
            }
            max++;
        }
        System.out.println(count + " names entered: ");
        for(int i = 0; i < a.toArray().length; i++){
            System.out.println(a.toArray()[i]);
        }

    }

    public static void display(ArrayList<String> a, ArrayList<String> b){

        int index;
        String input = "";
        Scanner in = new Scanner(System.in);

        while(!(input.equals("ZZZ"))){
            index = 0;

            System.out.print("Enter name of friend to get birthday.: ");
            if(in.hasNextLine()){
                input = in.nextLine();
            }else{
                System.out.println("System input scanner does not have next line.");
            }

            if(input.equals("ZZZ")){
                break;
            }else{
                for(int i = 0; i < a.toArray().length; i++){
                    if(input.equals(a.toArray()[i])){
                        index = i;
                    }
                }
                if(index != 0){
                    System.out.println("The birthday for " + input + " is: " + b.toArray()[index]);
                }else{
                    System.out.println("Please enter a name that was previously entered.");
                }
            }
        }

    }

     */
}
