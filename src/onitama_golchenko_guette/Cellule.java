/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama_golchenko_guette;

/**
 *
 * @author dagou
 */
public class Cellule {
    Pion PionCourant;
    boolean PresenceAdversaire;
    public Cellule(){
    PionCourant=null;
    PresenceAdversaire=false;
}
    public boolean ajoutPion(Pion LePionCourant){
        if (PionCourant==null){//Ici on renvoie true si l'ajout c'est bien passé
            PionCourant=LePionCourant;
           return true;
        }
        return false;// Renvoie false sinon
    }
}
