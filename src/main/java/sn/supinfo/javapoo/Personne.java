/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo;

import static java.time.Clock.system;

/**
 *
 * @author DIALLO
 */
public class Personne {
   private String prenom;
   private String nom;
   private String adresse;
   private int age;
   private String telephone;
   private String email;
   
   public Personne(){
       
   }
   
   public Personne(String prenom,String nom,int age,String telephone,String adresse){
       this.prenom=prenom;
       this.nom=nom;
       this.age=age;
       this.telephone=telephone;
       this.adresse=adresse;
       
   }
   
   public Personne(String prenom,String nom){
       this.prenom=prenom;
       this.nom=nom;
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

    public int getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
   @Override
    public String toString() {
        return "Personne{" + "prenom=" + prenom + "\n nom=" + nom + "\n adresse=" + adresse + "\n age=" + age + "\n telephone=" + telephone + "\n email=" + email + '}';
    }
    
    
   
    
   
}
