package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller5 implements Initializable {

    @FXML
    public DatePicker d1;
    @FXML
    public DatePicker d2;
    @FXML
    public TextField nameQuiz;
    @FXML
    public TextField desQuiz;

    @FXML
    public void addedQ(ActionEvent event) throws IOException {
        Wassit.formation.ajouter_quiz(nameQuiz.getText(), desQuiz.getText(), d1, d2);
        Wassit.recentQuizName.add(nameQuiz.getText());
   /******************************************************************/
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene tbvScene = new Scene(tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tbvScene);
        window.show();


    }




















    public void initialize(URL location, ResourceBundle resources) {

    }
}
