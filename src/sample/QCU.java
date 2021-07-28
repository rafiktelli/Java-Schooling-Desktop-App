package sample;
import java.util.ArrayList;

public class QCU extends Question {
    private String choixApprenant;
    public String reponse;
    public ArrayList<String> propositions;

    public QCU()
    {
            propositions = new ArrayList<String>();
    }

    public double evaluation()
    {
        int i=0;
        double correct=0;
        if(reponse == choixApprenant) correct = 1;
        return correct;
    }
    public void modifierReponse(String r2)
    {
            choixApprenant = r2;
    }
    public void afficherBonneReponse()
    {

        System.out.println(ennonce + " : " +reponse);
    }
    public void setChoixApprenant(String x)
    {
        choixApprenant=x;
    }
}
