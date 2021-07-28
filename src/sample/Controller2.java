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
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class Controller2 implements Initializable  {
@FXML
public void end(ActionEvent event) throws IOException
{
    Parent tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
    Scene tbvScene = new Scene(tableViewParent);
    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    window.setScene(tbvScene);
    window.show();
}
@FXML
Spinner spinner;
@FXML
 Label label51;
@FXML
Label label52;
@FXML
Label label53;
@FXML
Label label54;
@FXML
Label label55;
@FXML
    ComboBox<String> combo2;
@FXML
TextArea area;
    @FXML
    ObservableList<String> obz2 = FXCollections.observableArrayList();

@FXML
public void showmequiz(ActionEvent event) throws IOException
{
    String name=combo2.getValue();
    int i=0;
    int c=0;
    for(i=0;i<Wassit.formation.liste_quiz.size();i++)
    {
        if(Wassit.formation.liste_quiz.get(i).titre.equals(name)) c=i;
    }
    if(combo2.getValue()!=null)
    {
        //label51.setVisible(true);
        //label52.setVisible(true);
        label53.setVisible(true);
        label54.setVisible(true);
        label55.setVisible(true);
        ///******************************/ System.out.println(Wassit.formation.liste_quiz.get(c).date_ouverture.getValue());
        //label51.setText(Wassit.formation.liste_quiz.get(c).date_ouverture.getValue().format(DateTimeFormatter.ofPattern("mm/dd/yyyy", Locale.US)) );
        //label52.setText(Wassit.formation.liste_quiz.get(c).date_expiration.getValue().format(DateTimeFormatter.ofPattern("yyyy-mm-dd")) );
        label53.setText(Wassit.formation.liste_quiz.get(c).titre);
        label54.setText(Wassit.formation.liste_quiz.get(c).description);
        label55.setText("");
        for(i=0;i<Wassit.formation.liste_quiz.get(c).liste_notion.size();i++)
        {

            label55.setText(label55.getText()+"\n -Notion"+ (i+1) +": "+Wassit.formation.liste_quiz.get(c).liste_notion.get(i).nom);
        }
    }
}





    public void initialize(URL location, ResourceBundle resources) {

        int j=0;
        for(j=0;j<Wassit.formation.liste_quiz.size();j++)
        {
            obz2.add(Wassit.formation.liste_quiz.get(j).titre);
        }
        combo2.setItems(obz2);
//        label51.setVisible(false);
 //       label52.setVisible(false);
        label53.setVisible(false);
        label54.setVisible(false);
        label55.setVisible(false);
    }
}