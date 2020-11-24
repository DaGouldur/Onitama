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
public class Piece {
    String Couleur;//On crée une variable couleur
    boolean Roi;
    public Piece(String uneCouleur){ //On initialise la couleur du jeton avec le paramètre
        Couleur=uneCouleur;
        Roi=false;
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

