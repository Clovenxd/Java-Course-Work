import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXVacationalRental extends Application {

    public static void main(String[] args){
        launch(args);
    }

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
    void addMealFee(ActionEvent event) {

    }

    @FXML
    void exitProgram(ActionEvent event) {

    }

    @FXML
    void extraRoomFee(ActionEvent event) {

    }

    @FXML
    void lakeSideClicked(ActionEvent event) {

    }

    @FXML
    void parkSideClicked(ActionEvent event) {

    }

    @FXML
    void poolSideClicked(ActionEvent event) {

    }

    @FXML
    void twoExtraRoomFee(ActionEvent event) {

    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("format.fxml"));
        stage.setTitle("Lambert's Vacation Rentals");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
