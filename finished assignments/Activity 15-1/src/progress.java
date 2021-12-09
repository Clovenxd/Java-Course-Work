import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class progress extends Application {

    private final static int MEALSFEE = 200; //add meals fee to base price
    private final static int EXTRAROOMFEE = 75; //add 75 for each extra room
    private int[] properties = {600, 750, 825}; //0 = parkSide, 1 = poolSide, 2 = lakeSide
    private int choice;


    @Override
    public void init(){

    }

    @Override
    public void start(Stage primary){
        primary.setTitle("FX Vacation Rentals");

        Button parkSide = new Button("Park side.");
        Button poolSide = new Button("Pool side.");
        Button lakeSide = new Button("Lake side.");


        
        poolSide.setAlignment(Pos.TOP_CENTER);
        lakeSide.setAlignment(Pos.TOP_RIGHT);

        Group choices = new Group();
        choices.getChildren().addAll(parkSide, poolSide, lakeSide);

        Scene scene = new Scene(choices, 400, 200);

        primary.setScene(scene);
        primary.show();

    }

    @Override
    public void stop(){

    }

}
/*

application is entry point for JavaFX application.
Stage represents entire window or container in application.
Scene is the content inside the stage or window.

stackPane controls design layout of scenes.
type of container for layouts.
layouts in a back to front order
Root node, or root is the topmost layout(passed to scene constructor).

Write a JavaFX application for Lambert’s Vacation Rentals. Use separate ButtonGroups to allow a client to select one of three locations and the number of bedrooms.
Use a check whether Use a Checkbox to determine meals are included in the rental. Assume that the locations are

Parkside for $600 per week,
Poolside for $750 per week,
or Lakeside for $825 per week.

Assume that the rentals have one, two, or three bedrooms and that each bedroom more than one adds $75 to the base price. Assume that if meals are added, the price is $200 more per rental.

*/