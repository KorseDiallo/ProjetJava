/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.supinfo.javapoo;

/**
 *
 * @author DIALLO
 */
public class Test_Seance {
    public static void main(String args []){
        Seance s1=new Seance();
        s1.setDate("10/11/2020");
        s1.setHeure_Debut("12h");
        s1.setHeure_Fin("14h");
        s1.setSolde_Heure(20);
        
        Seance s2=new Seance("12/01/2020","09h","12h",20);
        
        System.out.println(s1);
        System.out.println("-------------------------------------------");
        System.out.println(s2);
    }
}
