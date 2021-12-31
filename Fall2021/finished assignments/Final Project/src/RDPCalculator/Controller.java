package RDPCalculator;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.Platform;

import java.util.Arrays;

public class Controller extends Application {
    Calculator calc = new Calculator();

    @FXML
    private ChoiceBox<String> chooseNumOfDives;
    @FXML
    private CheckBox imperialCheckBox;

    @FXML
    private TextField diveOneDepth;

    @FXML
    private Pane diveOnePane;

    @FXML
    private Text diveOneText;

    @FXML
    private Text diveOneText1;

    @FXML
    private TextField diveOneTime;

    @FXML
    private TextField diveTwoDepth;

    @FXML
    private Pane diveTwoPane;

    @FXML
    private TextField diveTwoTime;

    @FXML
    void calculateResults(ActionEvent event) {

    }

    @FXML
    void updateDiveOneDepth(ActionEvent event) {

    }

    @FXML
    void updateDiveOneTime(ActionEvent event) {

    }

    @FXML
    void updateDiveTwoDepth(ActionEvent event) {

    }

    @FXML
    void updateDiveTwoTime(ActionEvent event) {

    }

    @FXML
    void enableImperial(ActionEvent event) {
        if(imperialCheckBox.isSelected()){
            calc.imperial = true;
        }else{
            calc.imperial = false;
        }
    }

    @FXML
    void listNumOfDives(MouseEvent event) {
        chooseNumOfDives.setItems(FXCollections.observableArrayList("1 Dive", "2 Dives", "3 Dives"));

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUIFormat.fxml"));
        stage.setTitle("Anthony's RDPCalculator");
        stage.setScene(new Scene(root));
        stage.show();




    }
    @Override
    public void stop(){

    }

    @Override
    public void init(){

    }

}
