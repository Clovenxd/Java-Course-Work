import java.util.Scanner;

public class JTVDownload {

    public static void main(String[] args){
        String[][] shows = { //2D String array to hold TV shows and description
                            {"Rick 'n Morty", "Mr. Robot", "Dexter", "Avatar The Last Airbender", "Squid Games"},
                            {"A Mad Scientist and his nephew go on crazy interdimensional adventures.", "During the day he is a network security specialist. at night he is a vigilante hacker.",
                             "A psychopath that feeds his dark passenger psychopaths, and he works for LAPD.", "Aang being the last of his kind fights to save the world from war and bring piece.",
                             "Life or death games from childhood that could make you extremely rich, and pay off your debts."}
                            };

        chooseShow(shows); //get user choice in show.
    }


    public static void chooseShow(String[][] a){
        Scanner in = new Scanner(System.in); //get input for choice
        int choice = 0; //choice of show

        System.out.println("\nWhich show would you like to watch?");

        for(int i = 0; i < 5; i++){
            System.out.println((i + 1) + ". " + a[0][i]);
        }

        System.out.println();

        try{
            choice = in.nextInt();
        }catch(Exception e){
            System.out.println("\nInput scanner could not get choice of show, make sure you are entering the number corresponding to the show of choice.");
            System.out.println("Printing stacktrace...\n");
            e.printStackTrace();
        }

        System.out.println("You picked: " + a[0][choice - 1] + "\nDescription: " + a[1][choice - 1]);

    }




}

/*
Write an application that allows a user to select one of at least five television shows to watch on-demand.
When the user selects a show, display a brief synopsis.
 */