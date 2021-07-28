package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notion {
    public String nom;
    public String description;
    public ArrayList<Question> questions;

    public Notion (String n, String d)
    {
        questions = new ArrayList<Question>();
        nom=n;
        description = d;
    }

    public void ajouterQ() {
        Question questionQCM = new QCM();
        Question questionQCU = new QCU();
        Question questionQO = new QO();
        int nbRpns = 1;
        int i = 1;
        int f;
        int nbCrct;
        String chaine;
        System.out.println("choisissez le type de question: ");
        System.out.println("1.QCM  -  2.QCU  -  3.QO");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Donnez l'énonnce de la question: ");
        String ennonce = sc.nextLine();
        ennonce= sc.nextLine();
        if (x == 1) {                                                                                                       // QCM
            questionQCM.ennonce = ennonce;
            System.out.println("Donnez le nombre des propositions: ");
            nbRpns = sc.nextInt();
            System.out.println("Donnez les propositions:");
            for (i = 0; i <= nbRpns; i++) {
                if(i==0)
                {
                    chaine=sc.nextLine();
                }
                else {
                        System.out.print(i + "- ");
                        ((QCM) questionQCM).propositions.add(sc.nextLine());
                    }
            }
            System.out.print("Donnez le nombre de vraies réponses: ");
            nbCrct = sc.nextInt();
            while(nbCrct>nbRpns || nbCrct<1)
            {
                System.out.print("Donnez le nombre de vraies réponses: ");
                nbCrct = sc.nextInt();
            }
            System.out.println("Donnez les index des vraie réponses: ");
            for (i = 0; i <= nbCrct; i++) {
                if (i == 0) {
                        chaine = sc.nextLine();
                } else {
                        f=sc.nextInt();
                        System.out.println(f);
                    ((QCM) questionQCM).bonnesReponses.add(((QCM) questionQCM).propositions.get(f-1));
                }
            }
            System.out.println(ennonce+" :");
            for(i=0;i<nbRpns;i++)
            {
                if(((QCM) questionQCM).bonnesReponses.contains(((QCM) questionQCM).propositions.get(i)))
                {
                    System.out.println(i+1 + "- " + ((QCM) questionQCM).propositions.get(i) +"  -VRAIE- ");
                }
                else
                {
                    System.out.println(i+1+ "- " + ((QCM) questionQCM).propositions.get(i));
                }
            }
           // System.out.println(((QCM) questionQCM).bonnesReponses.get(1));
        } else {
            if (x == 2) {
                questionQCU.ennonce = ennonce;
                System.out.println("Donnez le nombre des propositions: ");
                nbRpns = sc.nextInt();
                System.out.println("Donnez les propositions:");
                for (i = 0; i <= nbRpns; i++) {
                    if (i == 0) {
                        chaine = sc.nextLine();
                    } else {
                        System.out.print(i + "- ");
                        ((QCU) questionQCU).propositions.add(sc.nextLine());

                    }
                }
                System.out.println("donnez l'index de la vraie réponse: ");
                Scanner ssss=new Scanner(System.in);
                int xx = ssss.nextInt();
                System.out.println(xx+"tnaket");
                ((QCU) questionQCU).reponse = ((QCU) questionQCU).propositions.get(xx-1); // je pense qu'il faut ajouter +1 mais je vais le lever

                System.out.println(((QCU) questionQCU).reponse);
            } else {
                if (x == 3) {
                    questionQO.ennonce = ennonce;
                    System.out.print("Donnez le nombre des réponses possible: ");
                    nbRpns = sc.nextInt();
                    for (i = 0; i <= nbRpns; i++) {
                        if (i == 0) {
                            chaine = sc.nextLine();
                        } else {
                            System.out.print("- ");
                            ((QO) questionQO).reponse_acceptees.add(sc.nextLine());
                            System.out.println(((QO) questionQO).reponse_acceptees.get(i-1));
                        }
                    }
                System.out.println(ennonce +": "+ ((QO) questionQO).reponse_acceptees.get(0) +" / "+ ((QO) questionQO).reponse_acceptees.get(2)  );
                }
            }
        }
    }

    public void modifierQ(Question q1, Question q2)
    {
        Question q3;
        if(questions.contains(q1))
        {
            questions.set(questions.indexOf(q1),q2);
        }
        else
        {
            System.out.println("la question n'exist pas");
        }
    }
    public void supprimerQ(Question q)
    {
        int i=0;
        boolean found=false;
        if(!questions.isEmpty())
        {

            while(i<questions.size() && !found )
            {
                if (questions.get(i).ennonce == q.ennonce) {
                    questions.remove(i);
                    found=true;
                }
                i++;
            }
        }
    }


}



