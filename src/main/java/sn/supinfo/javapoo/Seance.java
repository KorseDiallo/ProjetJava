
package sn.supinfo.javapoo;


public class Seance {
    private String date;
    private String heure_Debut;
    private String heure_Fin;
    private int solde_Heure;
    
    public Seance(){
    }
    
    public Seance(String date,String heure_Debut,String heure_Fin,int solde_Heure){
        this.date=date;
        this.heure_Debut=heure_Debut;
        this.heure_Fin=heure_Fin;
        this.solde_Heure=solde_Heure;
    }

    public String getDate() {
        return date;
    }

    public String getHeure_Debut() {
        return heure_Debut;
    }

    public String getHeure_Fin() {
        return heure_Fin;
    }

    public int getSolde_Heure() {
        return solde_Heure;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHeure_Debut(String heure_Debut) {
        this.heure_Debut = heure_Debut;
    }

    public void setHeure_Fin(String heure_Fin) {
        this.heure_Fin = heure_Fin;
    }

    public void setSolde_Heure(int solde_Heure) {
        this.solde_Heure = solde_Heure;
    }

    @Override
    public String toString() {
        return "Seance{" + "date=" + date + ", heure_Debut=" + heure_Debut + ", heure_Fin=" + heure_Fin + ", solde_Heure=" + solde_Heure + '}';
    }
    
    
}
