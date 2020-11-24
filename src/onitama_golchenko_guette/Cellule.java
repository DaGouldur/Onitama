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
    Roi RoiCourant;
    boolean PresenceAdversaire;
    boolean trone;
    public Cellule(){
    PionCourant=null;
    PresenceAdversaire=false;
    RoiCourant=null;
    trone=false;
    }
    public boolean ajoutPion(Pion LePionCourant){
        if (PionCourant==null){//Ici on renvoie true si l'ajout c'est bien passé
            PionCourant=LePionCourant;
           return true;
        }
        return false;// Renvoie false sinon
    }
    public boolean supprimerFigure(){
        if (PionCourant!=null){
            PionCourant=null;
            return true;
        }
        else if (RoiCourant!=null){
        return true;
        }
        else{
            return false;
        }
    }
     public String lireCouleurDeFigure(){//Renvoie la couleur de la figure de la cellule
        if (PionCourant==null && RoiCourant==null){//Ici on traîte le cas si il n'y a pas de figure
            return "pas de figure";
        }
        else if (PionCourant!=null){
        return PionCourant.Couleur;//Renvoie la couleur du pion
        }
        else{
            return RoiCourant.Couleur; //Renvoi la couleur du roi
        }
    }
        
     public boolean placerTrone(){//Ajoute un trou trone 
        if (trone==true){//S'il y a déjà un trone renvoie false
            return false;
        }
        else{//Ici on place le trone et on renvoie true
            trone=true;
            return true;
        }
    }
     public boolean presenceTrone(){
         return trone;
     }
}
