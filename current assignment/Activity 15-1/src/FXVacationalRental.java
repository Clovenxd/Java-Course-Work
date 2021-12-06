import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;

public class FXVacationalRental extends Application {

    public static void main(String[] args){
        launch(args);
    }

    private int propChoice = 0;
    private int numExtraRooms = 0;
    private boolean addMeals = false;
    private int price = 0;

    @FXML
    private MenuItem exit;

    @FXML
    private Button lakeSide;

    @FXML
    private CheckBox meals;

    @FXML
    private Button oneRoom;

    @FXML
    private Button parkSIde;

    @FXML
    private Button poolSIde;

    @FXML
    private TextField priceField;

    @FXML
    private Text programTitle;

    @FXML
    private Button threeRooms;

    @FXML
    private Button twoRooms;

    @FXML
    private Button calcPrice;

    @FXML
    void updatePrice(ActionEvent event) {
        switch (propChoice){
            case 1: price += 600;
                    break;
            case 2: price += 750;
                    break;
            case 3: price += 825;
                    break;
            default: price = 0;
        }


        priceField.setText("Your current price is: " + price + "$");
    }

    @FXML
    void addMealFee(ActionEvent event){
        if(meals.isSelected()){
            addMeals = true;
        }
    }

    @FXML
    void exitProgram(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void extraRoomFee(ActionEvent event) {
        numExtraRooms = 1;
    }

    @FXML
    void lakeSideClicked(ActionEvent event) {
        propChoice = 3;
    }

    @FXML
    void parkSideClicked(ActionEvent event) {
        propChoice = 1;
    }

    @FXML
    void poolSideClicked(ActionEvent event) {
        propChoice = 2;
    }

    @FXML
    void twoExtraRoomFee(ActionEvent event) {
        numExtraRooms = 2;
    }

    @Override
    public void init(){

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("format.fxml"));
        stage.setTitle("Lambert's Vacation Rentals");
        stage.setScene(new Scene(root));
        stage.show();




    }


}
