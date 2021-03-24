
package sn.supinfo.javapoo;


public class Etudiant {
    private int numero_Etudiant;
    private String nom;
    private String prenom;
    
    public Etudiant(int numero_Etudiant,String nom,String prenom){
        this.numero_Etudiant=numero_Etudiant;
        this.nom=nom;
        this.prenom=prenom;
    }

    public int getNumero_Etudiant() {
        return numero_Etudiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNumero_Etudiant(int numere_Etudiant) {
        this.numero_Etudiant = numere_Etudiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "numere_Etudiant:" + numero_Etudiant + ", nom:" + nom + ", prenom:" + prenom + '}';
    }
    
    
}
