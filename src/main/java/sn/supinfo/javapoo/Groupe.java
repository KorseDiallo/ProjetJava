
package sn.supinfo.javapoo;


public class Groupe {
    private String nom_Groupe;
    private String date_creation;
    
    public Groupe(String nom_Groupe,String date_creation){
        this.nom_Groupe=nom_Groupe;
        this.date_creation=date_creation;
    }

    public String getNom_Groupe() {
        return nom_Groupe;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public void setNom_Groupe(String nom_Groupe) {
        this.nom_Groupe = nom_Groupe;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    @Override
    public String toString() {
        return "Groupe{" + "nom_Groupe:" + nom_Groupe + ", date_creation:" + date_creation + '}';
    }
    
    
}
