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
import javafx.scene.control.Label;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller4 implements Initializable {


    @FXML
    public int found=0;
    @FXML
    Label label11;
    @FXML
    public ComboBox<String> combo;
    @FXML
    public ComboBox<String> combo1;
    @FXML
    ObservableList<String> obz = FXCollections.observableArrayList();
    @FXML
    ObservableList<String> obz1 =FXCollections.observableArrayList();
    @FXML
    Button aj;
    @FXML
    public void done(ActionEvent event) throws IOException
    {
      // System.out.println(Wassit.formation.liste_quiz.get(0).liste_notion.get(0).nom);
       //System.out.println(Wassit.formation.liste_quiz.get(0).liste_notion.get(1).nom);
        //System.out.println(Wassit.formation.liste_quiz.get(0).liste_notion.get(2).nom);
        /*********************************************************************/
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene tbvScene = new Scene(tableViewParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(tbvScene);
        window.show();
    }
    @FXML
   public void ok(ActionEvent event)
    {
        //int found=0;
        int k=0;
        String name;
        if(combo.getValue()!=null) {
            label11.setVisible(true);
            combo1.setVisible(true);
            aj.setVisible(true);
            name=combo.getValue();
         for(k=0;k<Wassit.formation.liste_quiz.size();k++)
         {
             if (Wassit.formation.liste_quiz.get(k).titre.equals(name)) {found=k;}

         }
        }

        /*
        int j=0;
        ListView<String> list = new ListView<String>();
        for(j=0;j<Wassit.not.size();j++)
        {
            list.getItems().add(Wassit.not.get(j).nom);
        }
        list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        System.out.println(combo.getValue());*/
    }
    @FXML
    public void ajoutN(ActionEvent event)
    {
        int c=0;
        int j;
        combo1.getValue();
        for(j=0;j<Wassit.not.size();j++)
        {
            if(Wassit.not.get(j).nom.equals(combo1.getValue())) c=j;
        }
        for(j=0;j<Wassit.formation.liste_quiz.get(found).liste_notion.size();j++)
        Wassit.formation.liste_quiz.get(found).liste_notion.add(Wassit.not.get(c));
       System.out.println(c);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        combo1.setVisible(false);
        label11.setVisible(false);
        aj.setVisible(false);
        int j=0;
        for(j=0;j<Wassit.recentQuizName.size();j++)
        {
            obz.add(Wassit.recentQuizName.get(j));
        }
        combo.setItems(obz);
        j=0;
        for(j=0;j<Wassit.not.size();j++)
        {
            obz1.add(Wassit.not.get(j).nom);
        }
        combo1.setItems(obz1);




    }


    }
