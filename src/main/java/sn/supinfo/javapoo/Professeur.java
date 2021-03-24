
package sn.supinfo.javapoo;


public class Professeur {
    private String prenom;
    private String nom;
    private String adresse;

    public Professeur(){
    
    }
    
    public Professeur(String prenom,String nom,String adresse){
        this.prenom=prenom;
        this.nom=nom;
        this.adresse=adresse;
    }
    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Professeur{" + "prenom:" + prenom + ", nom:" + nom + ", adresse:" + adresse + '}';
    }
    
    
}
