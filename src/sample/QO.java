package sample;
import java.util.ArrayList;

public class QO extends Question {
    public String choixApprenant;
    public ArrayList<String> reponse_acceptees;

    public QO()
    {
        reponse_acceptees = new ArrayList<String>();
    }

    public double evaluation()
    {
        int i=0;
        boolean found=false;
        double correct=0;
        while((i<reponse_acceptees.size())&&(!found))
        {
            if (reponse_acceptees.get(i) == choixApprenant)
            {
                found=true;
            }
        i++;
        }

        if(found) correct=1;

        return correct;
    }
    public void modifierReponse(String r2)
    {
        choixApprenant=r2;
    }
    public void afficherBonneReponse()
    {
        int i;
        for(i=0;i<reponse_acceptees.size()-1;i++)
        System.out.println(reponse_acceptees.get(i));
    }
}
