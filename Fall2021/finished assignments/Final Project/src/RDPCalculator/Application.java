package RDPCalculator;

import java.util.Scanner;

//this is going to be the main class that will instantiate the RDPCalculator itself (Controller.class) and the gui (Controller.class & GUIFormat.fxml)
public class Application {
    public static void main(String[] args){ //main function in program
        Controller gui;
        boolean startGUI = false, correctInput = false; //two boolean functions to get input from gui option and to check for correct input
        String input = ""; //string to save input
        Scanner in = new Scanner(System.in); //instantiate input scanner

        while(!correctInput) { //while loop until correct input
            System.out.print("Would you like to use our built in user friendly GUI?(Yes/No): ");
            input = in.nextLine();

            if (input.length() > 0 && input.length() < 4) {
                if (Character.toUpperCase(input.charAt(0)) == 'Y') {
                    startGUI = true;
                    correctInput = true;
                } else if (Character.toUpperCase(input.charAt(0)) == 'N') {
                    correctInput = true;
                } else {
                    System.out.println("Incorrect format please enter your answer as 'Yes', or 'No");
                }
            } else {
                System.out.println("\nPlease only answer as 'Yes', or 'No' nothing else.");
            }
        }
        if(startGUI){
            javafx.application.Application.launch(Controller.class, args);
            in.close();
        }
        startCLIProgram();



        in.close();
    }
    public static void startCLIProgram(){
        Scanner in = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Welcome to Anthony's RDPCalculator!!!!!");
        System.out.print("Enter 's' for single dive, 'd' for double dive, and 'm' for three dives: ");
        String input = in.nextLine();
        calc.setNumberOfDives(Character.toLowerCase(input.charAt(0)));


    }

    public static void diveOne(Calculator calc){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you know the depth and the time, or just the depth?\nEnter 'b' for both or 'd' for depth: ");
        String input = in.nextLine();
        switch(input.toLowerCase().charAt(0)){
            case 'b':  calc.fi
        }
    }
    public static void diveTwo(){

    }
    public static void diveThree(){

    }


}
