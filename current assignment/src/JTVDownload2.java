import javax.swing.*;
import java.awt.event.*;

public abstract class JTVDownload2{
    public static void main(String[] args){
        JFrame test = new JFrame("testing title.");
        JLabel greeting = new JLabel("Im just testing");
        JTextField test2 = new JTextField();

        test.setSize(600, 400);
        test.setResizable(true);
        test.setVisible(true);
        test.setDefaultCloseOperation(3);
        test.add(greeting);
        test.add(test2);

        greeting.setVerticalAlignment(SwingConstants.TOP);

        test2.setText("test2");

    }
}

abstract class combo implements ActionListener{
    JFrame test = new JFrame("testing title.");
    JLabel greeting = new JLabel("Im just testing");
    JTextField test2 = new JTextField();

        test.setSize(600, 400);
        test.setResizable(true);
        test.setVisible(true);
        test.setDefaultCloseOperation(3);
        test.add(greeting);
        test.add(test2);

        greeting.setVerticalAlignment(SwingConstants.TOP);

        test2.setText("test2");
}


/*
Change the JTVDownload application to include an editable combo box.
Allow the user to type the name of a television show and display an appropriate error message if the desired show is not available.
 */