
package sn.supinfo.javapoo;


public class Evaluation {
    private String nom;
    private int debut;
    private int fin;

    public Evaluation(String nom,int debut,int fin){
        this.nom=nom;
        this.debut=debut;
        this.fin=fin;
    }
    public String getNom() {
        return nom;
    }

    public int getDebut() {
        return debut;
    }

    public int getFin() {
        return fin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "nom:" + nom + ", debut:" + debut + ", fin:" + fin + '}';
    }
    
    
     
}
