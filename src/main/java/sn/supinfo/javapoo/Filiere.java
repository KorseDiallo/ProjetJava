
package sn.supinfo.javapoo;


public class Filiere {
    private String nom_filiere;
    private String description;
    
    public Filiere(String nom_filiere,String description){
        this.nom_filiere=nom_filiere;
        this.description=description;
    }

    public String getNom_filiere() {
        return nom_filiere;
    }

    public String getDescription() {
        return description;
    }

    public void setNom_filiere(String nom_filiere) {
        this.nom_filiere = nom_filiere;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Filiere{" + "nom_filiere:" + nom_filiere + ", description:" + description + '}';
    }
    
    
}
