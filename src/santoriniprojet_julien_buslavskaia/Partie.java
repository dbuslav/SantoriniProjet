/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santoriniprojet_julien_buslavskaia;

import java.util.Random;

/**
 *
 * @author daria
 */
public class Partie {
    Joueur Listejoueurs[] = new Joueur[2];
    Joueur JoueurCourant;
    Plateau plateauDeJeu = new Plateau();
    
    void attribuerCouleursAuxJoueurs() {
        Random r = new Random();
        boolean couleur;
        couleur = r.nextBoolean();
        if (couleur) {
            Listejoueurs[0].couleur = "Violet";
            Listejoueurs[1].couleur = "Bleu";
        }
        else {
            Listejoueurs[0].couleur = "Bleu";
            Listejoueurs[1].couleur = "Violet";
        }
    }

    Joueur ProchainJoueur(Joueur un_joueur) {
        if (Listejoueurs[0] == JoueurCourant) {
            return Listejoueurs[1];
        }
        return Listejoueurs[0];
    }
}
