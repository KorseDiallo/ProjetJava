
package sn.supinfo.javapoo;


public class Module {
    private String nom;
    private int volume_Horaire;
    private int coefficient;
    private String description;

    public Module(){
    }
    
    public Module(String nom,int volume_Horaire,int coefficient,String description){
        this.nom=nom;
        this.volume_Horaire=volume_Horaire;
        this.coefficient=coefficient;
        this.description=description;
    }
    public String getNom() {
        return nom;
    }

    public int getVolume_Horaire() {
        return volume_Horaire;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public String getDescription() {
        return description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setVolume_Horaire(int volume_Horaire) {
        this.volume_Horaire = volume_Horaire;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Module{" + "nom:" + nom + ", volume_Horaire:" + volume_Horaire + ", coefficient:" + coefficient + ", description:" + description + '}';
    }
    
    
}
