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
public class Test_Module {
    public static void main(String args []){
        Module m1=new Module();
        m1.setCoefficient(4);
        m1.setDescription("Java est un langage de programmation et une plate-forme informatique qui ont été créés par Sun Microsystems en 1995.");
        m1.setNom("Java");
        m1.setVolume_Horaire(20);
        
        Module m2=new Module("PHP",20,4," php est un langage de scripts généraliste et Open Source, spécialement conçu pour le développement d'applications web.");
        
        System.out.println(m1);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println(m2);
    }
}
