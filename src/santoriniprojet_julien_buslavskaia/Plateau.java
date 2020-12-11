/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santoriniprojet_julien_buslavskaia;

/**
 *
 * @author daria
 */
public class Plateau {
    Cellule Cellules[][] = new Cellule[5][5];
    // point important : la cellule d'indice [0][0] est située en bas à gauche 
    // sur le plateau réel - par convention
    
    // initialisation du plateau : on crée 25 cellules vides
    Plateau() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Cellules[i][j] = new Cellule();
            }
        }
    }
    
    String lireCouleurDOuvrier(int line, int column) {
        return Cellules[line][column].lireCouleurOuvrier();
    }
    
    int lireHauteur(int line, int column) {
        return Cellules[line][column].lireHauteur();
    }
    
    boolean presenceOuvrier(int line, int column){
        if(Cellules[line][column].presenceOuvrier()==true){
            return true;
        }
        else return false;   
    }
    
    boolean presenceOuvrierJoueurCourant(int line, int column, Joueur un_joueur){
        if(Cellules[line][column].presenceOuvrier()==true){
            if(Cellules[line][column].lireCouleurOuvrier()==un_joueur.couleur){
                return true;
            }
            else return false;
        }
        else return false;    
    }
    
    boolean presenceDome(int line, int column){
        if(Cellules[line][column].presenceDome()==true){
            return true;
        }
        return false;
    }
    
    boolean cellulesVoisines(int line1, int column1, int line2, int column2){
        int distance1 = line1 - line2;
        int distance2 = column1 - column2;
        
        if( distance1*distance1 + distance2*distance2 <= 2){
            return true;
        }
        else return false;
    }
    
    boolean niveauxCompatibles(int line1, int column1, int line2, int column2){
        int hauteur1 = Cellules[line1][column1].lireHauteur();
        int hauteur2 = Cellules[line2][column2].lireHauteur();
        
        int difference = hauteur1 - hauteur2;
        
        if(Math.abs(difference) == 1){
            return true;
        }
        else return false;
    }
    
    boolean construireNiveau(int line, int column){
        if(Cellules[line][column].presenceOuvrier()==false && Cellules[line][column].presenceDome()==false && Cellules[line][column].lireHauteur()<3){
            Cellules[line][column].placerNiveau();
            return true;
        }
        else {
            System.out.println("erreur : on ne peut pas construire de niveau sur cette case");
            return false;
        }
    }
    
    boolean deplacementOuvrierPossible(int line1, int column1, int line2, int column2){
        if(Cellules[line1][column1].presenceOuvrier()==true){
            if(Cellules[line2][column2].presenceOuvrier()==false && Cellules[line2][column2].presenceDome()==false && Cellules[line2][column2].lireHauteur()<3){
                if(Cellules[line1][column1].cellulesVoisines(Cellules[line2][column2])==true &&){
                
            }
            }
        }
    }
}
