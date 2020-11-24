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
public class Pion {
    String Couleur;//On crée une variable couleur
    public Pion(String uneCouleur){ //On initialise la couleur du jeton avec le paramètre
        Couleur=uneCouleur;
        
        
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

