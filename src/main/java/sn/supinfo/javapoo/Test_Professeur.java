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
public class Test_Professeur {
    public static void main(String args []){
        Professeur p1=new Professeur();
        p1.setAdresse("Sicap karack");
        p1.setNom("Barry");
        p1.setPrenom("Ibrahima");
        
        Professeur p2=new Professeur("Mamadou","Balde","Medina");
        
        System.out.println(p1);
        System.out.println("------------------------------------------------------");
        System.out.println(p2);
        
    }
}
