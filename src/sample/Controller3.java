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

public class Controller3 implements Initializable {



    @FXML
    public TextField desNotion;
    @FXML
    public TextField nomNotion;

    @FXML
    public void addTheNotion(ActionEvent event) throws IOException
    {    Wassit.i++;

        String x;
        String y;
        Notion n = new Notion(nomNotion.getText(),desNotion.getText());
        x=nomNotion.getText();
        y=desNotion.getText();
        Wassit.lesNoms.add(nomNotion.getText());
//        Wassit.quiz.ajouter_notion(x,y);
        Wassit.not.add(n);
        /*************************************************************************************************/
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene tbvScene = new Scene(tableViewParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(tbvScene);
        window.show();
    }




    public void initialize(URL location, ResourceBundle resources) {

    }
}
