import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ValidateCheckDigits {
    public static void main(String[] arg){
        ArrayList<Integer> valid = new ArrayList<Integer>(); //store valid account numbers.

        System.out.println("Welcome to my awesome account number validator!\n");

        try { //try catch to handle exceptions.
            getValidAcc(valid); //get valid account numbers from in file.
            //displayValid(valid); //display found account numbers for debugging.
            outputValid(valid); //outputs valid accounts numbers to file.
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public static void getValidAcc(ArrayList<Integer> valid) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter file name of accounts to validate: ");
        String outFile = in.nextLine();
        System.out.println();

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\depre\\Documents\\GitHubHomework\\GitHubHomework\\current assignments\\Activity 13-1\\src\\" + outFile));

        String line = reader.readLine();

        while(line != null){
            int sum = 0;
            for(int i = 0; i < 5; i++){
                sum += Integer.parseInt(Character.toString(line.charAt(i)));
            }
            if(sum % 10 == Integer.parseInt(Character.toString(line.charAt(5)))){
                valid.add(Integer.parseInt(line));
                System.out.println(line + " Is a valid account number.");
            }
            line = reader.readLine();
        }
        reader.close();
    }

    public static void displayValid(ArrayList<Integer> valid){
        for(int acc: valid){
            System.out.println(acc);
        }
    }

    public static void outputValid(ArrayList<Integer> valid) throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.print("\noutput file name: ");
        String outFile = in.nextLine();

        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\depre\\Documents\\GitHubHomework\\GitHubHomework\\current assignments\\Activity 13-1\\src\\" + outFile));

        System.out.println("Outputting valid account numbers in " + outFile);
        for(int acc: valid){
            writer.write(acc + "\n");
        }

        writer.close();
        in.close();
    }
}
/*
An account number is valid only if the last digit is equal to the remainder when the sum of the first five digits is divided by 10.

Write only valid account numbers to an output file, each on its own line
 */