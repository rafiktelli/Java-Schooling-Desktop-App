package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class  Controller implements Initializable {
@FXML
    public Compte compte = new Compte();
    @FXML
    TextField useN;
    @FXML
    TextField passW;
    @FXML
    public void login(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene tbvScene = new Scene(tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tbvScene);
        window.show();


    }
    @FXML
    public TextArea kwd;
    @FXML
    public void addNotion(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("ajouterNotion.fxml"));
        Scene tbvScene = new Scene(tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tbvScene);
        window.show();
    }


    @FXML
    public void addQuiz(ActionEvent event) throws IOException {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("ajouterQuiz.fxml"));
        Scene tbvScene = new Scene(tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tbvScene);
        window.show();
    }
    @FXML
    public void gererQuiz(ActionEvent event) throws IOException
    {

        Parent tableViewParent = FXMLLoader.load(getClass().getResource("gererQuiz.fxml"));
        Scene tbvScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tbvScene);
        window.show();
        /***************************/

    }

    @FXML
    public void affQ(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("afficherQuiz.fxml"));
        Scene tbvScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tbvScene);
        window.show();
    }
    @FXML
    public void logout(ActionEvent event) throws IOException
    {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
        Scene tbvScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tbvScene);
        window.show();
    }



  @Override
    public void initialize(URL location, ResourceBundle resources) {


  }
    }
