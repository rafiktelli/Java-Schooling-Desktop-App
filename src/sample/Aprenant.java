package sample;
import java.util.ArrayList;
import java.util.List;

public class Aprenant extends Compte {
    private String Nom;
    private String Prenom;
    private String DateNais;
    private Formation formation;
    private String email;
    private List<Quiz> LisTReponse_Quiz = new ArrayList();
    private List<Quiz> ListQuiz_sauv = new ArrayList();

    public Aprenant(String nom, String prenom, String dateNais, String email) {
        Nom = nom;
        Prenom = prenom;
        DateNais = dateNais;
        this.email = email;
    }

    public void ajouter_quiz(Quiz q) {
        this.ListQuiz_sauv.add(q);
    }

    public void repondre_quiz(Quiz q) {
        this.LisTReponse_Quiz.add(q);
    }

    public void repondre_qst(Quiz q, Notion not, Question qst, String r) {
        //int i = q.getList_notion().indexOf(not);
        //int j = q.getList_notion().get(i).getList_qst().indexOf(qst);
      /*  if (j>-1) {
            q.getList_notion().get(i).getList_qst().get(j).repondre(r);
        }
    }
    public double taux_reuss (Quiz q) { return q.taux_reussite;}
    public void affich_quiz_deja_fait()
    {
        for (int i=0,this.LisTReponse_Quiz.size(),i++)
        {
            Systel.out.println("--------------++++++++++"+ i +"+++-------------------");
            this.LisTReponse_Quiz.get(i).afficher_quiz();
        }
    }
*/
    }
}