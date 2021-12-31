import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class JTVDownload2{
    /*
    public static void main(String[] args){
        String[] shows =  {"Rick 'n Morty", "Mr. Robot", "Dexter", "Avatar the Last Airbender", "Squid Games"};
        String[] desc = {"A Mad Scientist and his nephew go on crazy interdimensional adventures.", "During the day he is a network security specialist. at night he is a vigilante hacker.",
                "A psychopath that feeds his dark passenger psychopaths, and he works for LAPD.", "Aang being the last of his kind fights to save the world from war and bring piece.",
                "Life or death games from childhood that could make you extremely rich, and pay off your debts."};
        combo list = new combo(shows, desc);



    }

     */
}

 class combo extends JComboBox<String> implements ActionListener{

    private static final int HEIGHT = 300;
    private static final int WIDTH = 500;
    String[] SHOWS;
    String[] DESC;
    private static final String TITLE = "JVTDownload2";
    JFrame gui = new JFrame();
    JComboBox<String> search = new JComboBox<String>();
    JTextField descbox = new JTextField();


    public combo(String[] shows, String[] desc){

        this.SHOWS = shows;
        this.DESC = desc;

        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gui.setSize(WIDTH, HEIGHT);
        gui.setTitle(TITLE);

        search.setEditable(true);
        search.addActionListener(this);

        descbox.setEditable(false);


        gui.add(search);
        gui.add(descbox);
        gui.setLayout(new FlowLayout());
        gui.setVisible(true);

    }
    @Override
     public void actionPerformed(ActionEvent a){
        Object source = a.getSource();
        if(source instanceof JComboBox){
            if("comboBoxEdited".equals(a.getActionCommand())){
                Object movie = search.getSelectedItem();
                switch(movie.toString()) {
                    case "Rick 'n Morty":
                        descbox.setText(DESC[0]);
                        break;
                    case "Mr. Robot":
                        descbox.setText(DESC[1]);
                        break;
                    case "Dexter":
                        descbox.setText(DESC[2]);
                        break;
                    case "Avatar the Last Airbender":
                        descbox.setText(DESC[3]);
                        break;
                    case "Squid Games":
                        descbox.setText(DESC[4]);
                        break;
                    default:
                        descbox.setText("Show not found.");
                }
            }
        }
        gui.setVisible(true);
    }
}


/*
Change the JTVDownload application to include an editable combo box.
Allow the user to type the name of a television show and display an appropriate error message if the desired show is not available.
 */