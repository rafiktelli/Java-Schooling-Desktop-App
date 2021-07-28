package sample;
import java.util.ArrayList;

public class QCM extends Question {

    public ArrayList<String> choixApprenant;
    public  ArrayList<String> bonnesReponses;
    public  ArrayList<String> propositions;

    public QCM() {
        propositions = new ArrayList<String>();
        bonnesReponses = new ArrayList<String>();
        propositions = new ArrayList<String>();
    }

    public void afficherBonnesReponses()
    {
        int i=0;
        System.out.println(ennonce);
        for(i=0;i<bonnesReponses.size();i++)
        {
            System.out.println(bonnesReponses.get(i));
        }
    }
    public void modifierReponses(ArrayList<String> nouveauR)
    {
        choixApprenant = nouveauR;
    }
    public double evaluation()
    {
        float result=0;
        int p = propositions.size();
        int i;
        for(i=0;i<p;i++)
        {

            if(bonnesReponses.contains(propositions.get(i)) && choixApprenant.contains(propositions.get(i))) result=result+1/p;
            if(!bonnesReponses.contains(propositions.get(i)) && choixApprenant.contains(propositions.get(i))) result=result-1/p;
            if(bonnesReponses.contains(propositions.get(i)) && !choixApprenant.contains(propositions.get(i))) result=result-1/p;
            if(!bonnesReponses.contains(propositions.get(i)) && !choixApprenant.contains(propositions.get(i))) result=result+1/p;
        }
        if(result < 0) result=0;
        return result;
    }

}
