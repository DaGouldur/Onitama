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
    Piece PieceCourante;
    boolean PresenceAdversaire;
    boolean trone;
  
    public Cellule(){
    PresenceAdversaire=false;
    PieceCourante=null;
    trone=false;
    }
    public boolean ajoutPion(Piece LaPieceCourante){
        if (PieceCourante==null){//Ici on renvoie true si l'ajout c'est bien passé
            PieceCourante=LaPieceCourante;
           return true;
        }
        return false;// Renvoie false sinon
    }
    public boolean supprimerFigure(){
        if (PieceCourante!=null){
            PieceCourante=null;
            return true;
        }
        return false;
    }
     public String lireCouleurDeFigure(){//Renvoie la couleur de la figure de la cellule
        if (PieceCourante==null ){//Ici on traîte le cas si il n'y a pas de figure
            return "pas de figure";
        }
        return PieceCourante.Couleur;//Renvoie la couleur de la piece
        
      
    }
        
     public boolean placerTrone(){//Ajoute un trone 
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
