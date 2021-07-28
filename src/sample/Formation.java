package sample;

import javafx.scene.control.DatePicker;

import java.util.ArrayList;

public class Formation {
    private String nom;
    private String type;
    private String description;
    private String date_debut;
    private String date_fin;
    private Formateur formateur;
    public ArrayList<Quiz> liste_quiz= new ArrayList<Quiz>();
    public Classe classe;



    public Formation(String nom, String type, String description, String date_debut, String date_fin) {
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        classe = new Classe();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public void Consulter(Aprenant App, Quiz quiz)
    {

    }
    public void ajouter_quiz(String n, String d, DatePicker d1, DatePicker d2)
    {
        Quiz q = new Quiz(n,d);
        q.titre = n;
        q.description = d;
        q.date_expiration = d1;
        q.date_expiration = d2;
        liste_quiz.add(q);
    }
}
