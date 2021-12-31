import javax.swing.*;

public class Homework3_1 {

    private static String str;
    private static float num1, num2, num3, ave;

    public static void Hw3_1(String[] args){

    getNums();
    getAve();
    displayAve();

    }
    public static void getNums(){

    str = JOptionPane.showInputDialog(null, "Enter first number: ");
    num1 = Float.parseFloat(str);

    str = JOptionPane.showInputDialog(null, "Enter second number: ");
    num2 = Float.parseFloat(str);

    str = JOptionPane.showInputDialog(null, "Enter third number: ");
    num3 = Float.parseFloat(str);

    }
    public static void getAve(){

    ave = (num1 + num2 + num3)/3;

    }
    public static void displayAve(){

    JOptionPane.showMessageDialog(null, "Your average number is: " + ave);

    }
}