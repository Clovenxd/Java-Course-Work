import javax.swing.*;

public class PlaceAnOrder {
    public static void main(String[] args){
        String[] order = {null, null};
        getOrder(order);

        if(check(order)){
            JOptionPane.showMessageDialog(null, "Order:" +
                                                                      "\nItem number:   " + order[0] +
                                                                      "\nQuantity   :   " + order[1] +
                                                                      "\nTotal      :   " + getPrice(order) + "\n");
        }

    }




    public static String[] getOrder(String[] a){ //get item number and quantity

        a[0] = JOptionPane.showInputDialog("Enter the item number you would like to order.");
        a[1] = JOptionPane.showInputDialog("Enter the amount of the item you would like to order.");

        return a;
    }

    public static boolean check(String[] a){ //check for errors
        boolean noErrors = true; //flag to decide whether to calculate price or not.
        boolean isNumeric = true;

        for(int i = 0; i < a[0].length(); i++){ //check item number for letters.
            if(Character.isAlphabetic(a[0].charAt(i))){
                isNumeric = false;
            }
        }
        if(!isNumeric){ //if the item number is not numeric display error message.
            System.out.println( OrderMessages.errors[0]);
            noErrors = false;
        }else{
            if(Integer.parseInt(a[0]) < 0){ //check if item number is too low
                System.out.println( OrderMessages.errors[1]);
                noErrors = false;
            }
            if(Integer.parseInt(a[0]) > 9999){ //checks if item number is too high
                System.out.println( OrderMessages.errors[2]);
                noErrors = false;
            }
            if(!(Integer.parseInt(a[0]) == 111 || Integer.parseInt(a[0]) == 222 || Integer.parseInt(a[0]) == 333 || Integer.parseInt(a[0]) == 444)){ //checks if item number is valid
                System.out.println(OrderMessages.errors[3]);
                noErrors = false;
            }
        }

        isNumeric = true;

        for(int i = 0; i < a[1].length(); i++){ //check item quantity for letters.
            if(Character.isAlphabetic(a[1].charAt(i))){
                isNumeric = false;
            }
        }
        if(!isNumeric){ //if the item quantity is not numeric display error message.
            System.out.println( OrderMessages.errors[4]);
            noErrors = false;
        }else{
            if(Integer.parseInt(a[1]) < 1){
                System.out.println(OrderMessages.errors[5]);
                noErrors = false;
            }
            if(Integer.parseInt(a[1]) > 12){
                System.out.println(OrderMessages.errors[6]);
                noErrors =  false;
            }
        }

        return noErrors;
    }

    public static double getPrice(String[] a){
        double total = 0.0;
        double[] prices = {.89, 1.47, 2.43, 5.99};

        switch(Integer.parseInt(a[0])){
            case 111:   total = Integer.parseInt(a[1]) * prices[0];
                        break;
            case 222:   total = Integer.parseInt(a[1]) * prices[1];
                        break;
            case 333:   total = Integer.parseInt(a[1]) * prices[2];
                        break;
            case 444:   total = Integer.parseInt(a[1]) * prices[3];
                        break;
            default:
                        break;
        }
        return total;
    }
}

/*
Create a class that stores an array of usable error messages; save the file as OrderMessages.java.
 */



/*
A company accepts user orders for its products interactively. Users might make the following errors as they enter data:

1=The item number ordered is not numeric,
2=too low (less than 0), or
3=too high (more than 9999).
4=The item number is not a currently valid item.
5=The quantity is not numeric,
6=too low (less than 1), or
7=too high (more than 12).


Create an application that contains prompts for an item number and quantity.
Allow for the possibility of non-numeric entries as well as out-of-range entries and entries that do not match any of the currently available item numbers.

The program should display an appropriate message if an error has occurred.
If no errors exist in the entered data, compute the user’s total amount due (quantity times price each) and display it.

 */