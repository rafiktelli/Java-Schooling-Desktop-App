package sample;

import java.util.ArrayList;

public class Classe {
    private int nbrAprenant;
    private ArrayList <Aprenant> groupe = new ArrayList();

    public int getNbrAprenant() {
        return nbrAprenant;
    }

    public void setNbrAprenant(int nbrAprenant) {
        this.nbrAprenant = nbrAprenant;
    }

    public ArrayList<Aprenant> getGroupe() {
        return groupe;
    }

    public void setGroupe(ArrayList<Aprenant> groupe) {
        this.groupe = groupe;
    }

    public Aprenant ajouter_aprenant (String nom, String Prenom, String DateNai, String mail)
    {
        Aprenant a = new Aprenant(nom,Prenom,DateNai,mail);
        groupe.add(a);
        return a;
    }
    public  void Sup_Aprenant(Aprenant a)
    {
        if (this.groupe.contains(a))
        {
            this.groupe.remove(this.groupe.indexOf(a));

        }
    }
}
