package sample;
import java.util.ArrayList;
import java.util.List;

public class Formateur extends Compte {
    private String Nom;
    private String Prenom;
    private Formation formation;
    private List<Aprenant> List_apprenant = new ArrayList();

    public Formateur(String nom, String prenom) {
        Nom = nom;
        Prenom = prenom;
    }
    public void nouvelleFormation(String nom_form,String description)
    {
        this.formation.setNom(nom_form);
        this.formation.setDescription(description);
        //this.formation.classe.setGroupe();

    }
    public void modifierFormation (String nom,String descrtiption)

    {
        this.formation.setNom(nom);

    }
}
