import java.util.Scanner;

public class Homework1 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in); //scanner for input
    int input = 0, zeroes = 0, total = 0, subtotal = 0;  //variables for storing data

    while(zeroes != 2){ //while loop to keep adding values until two zeroes have been entered.

      input = in.nextInt();

      if(input != 0){
        total += input;
        subtotal += input;
        if(zeroes != 0){
          zeroes--;
        }
      }else{
        zeroes++;
        if(zeroes == 1){
          System.out.println("subtotal: " + subtotal);
          subtotal = 0;
        }
      }
    }
    System.out.println("total: " + total);
  }
}

/*
Write and submit a program that simulates an adding machine. Input to the program will be integers, submitted one per line.  Input should be handled as follows:

a nonzero value should be added into a subtotal;
a zero value should cause the subtotal to be printed and reset to zero;
two consecutive zeroes should cause the total (not subtotal) of all the values input to be printed and the program to be terminated.
 */