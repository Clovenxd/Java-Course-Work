import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snek"); //title of window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes program when x button is pressed
        this.setResizable(false); //doesnt allow user to size window
        this.pack(); //snugly packs all components in frame.
        this.setVisible(true); //allows user to see window
        this.setLocationRelativeTo(null); //puts window in middle of screen
    }



}
