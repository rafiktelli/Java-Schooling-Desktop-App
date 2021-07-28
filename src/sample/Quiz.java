package sample;
import javafx.scene.control.DatePicker;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
public String titre;
public String description;
public ArrayList<Notion> liste_notion;
public DatePicker date_ouverture;
public DatePicker date_expiration;
public int taux_accomplissent;
public int taux_reussite;

public Quiz(String t, String d)
{
    titre=t;
    description = d;
    liste_notion = new ArrayList<Notion>();
}

public void ajouter_notion(String nom0, String des)
{
    Question q = new QO();
    Notion E = new Notion(nom0, des);
    E.nom = nom0;
    E.description = des;
    E.questions.add(q);

    liste_notion.add(E);
}
public void modifier_notion(String nom1, String nom2)
{
    int i;
    if(!liste_notion.isEmpty())
    {
        for(i=0;i<liste_notion.size()-1;i++)
        {
            if(liste_notion.get(i).nom == nom1)
            {
                liste_notion.get(i).nom=nom2;
            }
        }
    }
}
public void supprimer_notion(String nom)
{
    int i=0;
    boolean found = false;
    if(!liste_notion.isEmpty())
    {
        while(i<liste_notion.size()-1)
        {
            if((liste_notion.get(i).nom == nom)&&(!found))
            {
                found = true;
                liste_notion.remove(i);
            }
        i++;
        }
    }

}

}
