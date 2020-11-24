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
public class Joueur {
    String Nom;
    String Couleur;
    Piece [] ListePieces= new Piece [5];
    CartesDeplacement [] Cartes= new  CartesDeplacement [2];
    public Joueur(String Lenom){//On initialise le nom du joueur
        Nom = Lenom;
    }
     public void affecterCouleur(String Lacouleur){//Affecte une couleur à chaque joueurs
        Couleur = Lacouleur;
    }
     
}
