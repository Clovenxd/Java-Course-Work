import javax.swing.*;

public class Homework2_1 {

    public static void Hw2_1(String[] args) {

        //variables
        int num1, num2, ave;
        String str;

        str = JOptionPane.showInputDialog(null, "Enter first integer!");//first num
        num1 = Integer.parseInt(str);

        str = JOptionPane.showInputDialog(null, "Enter second integer!");//second num
        num2 = Integer.parseInt(str);

        ave = (num1 + num2)/2;//calculate average

        JOptionPane.showMessageDialog(null, "your average number is: " + ave);//display average



    }
}