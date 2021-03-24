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
public class Test_Personne {
    public static void main(String args[]){
        Personne p1= new Personne();
        p1.setPrenom("Abdoulaye");
        p1.setNom("Diallo");
        p1.setAge(20);
        p1.setTelephone("780111016");
        p1.setEmail("abdoulayekorsediallo@gmail.com");
        p1.setAdresse("Sicap karack");
        
        Personne p2= new Personne("Boubacar","Diallo",21,"785598729","Medina");
        
        Personne p3= new Personne("Kadiatou","Diallo");
        
        System.out.println(p1);
        System.out.println("---------------------------------");
        System.out.println(p2);
        System.out.println("---------------------------------");
        System.out.println(p3);
    }
}
