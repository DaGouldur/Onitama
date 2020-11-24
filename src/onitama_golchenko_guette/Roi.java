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
public class Roi {
    String Couleur;
    public Roi(String LaCouleur){ 
        Couleur=LaCouleur;
        
        
    }
    public String lireCouleur(){//Renvoie la couleur du jeton
      return Couleur;
    }
     @Override
    public String toString(){//On remplace la couleur par l'initial et la couleur d'affichage associé
        if("Rouge".equals(Couleur)){
            return " R";
        }
        return " B";
    }
}
