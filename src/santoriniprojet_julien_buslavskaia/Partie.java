/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santoriniprojet_julien_buslavskaia;

import java.util.Random;
import java.util.Scanner;

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
    void initialiserPartie() {
        //Vider le plateau
        plateauDeJeu.viderPlateau();

        //Création des joueurs
        Scanner sc = new Scanner(System.in);
        System.out.println("Choix du pseudo du J1 :");
        Joueur J1 = new Joueur(sc.nextLine());
        System.out.println("Choix du pseudo du J2 :");
        Joueur J2 = new Joueur(sc.nextLine());
        Listejoueurs[0] = J1;
        Listejoueurs[1] = J2;

        attribuerCouleursAuxJoueurs();

        System.out.println(J1.nom + " est de couleur " + J1.couleur);
        System.out.println(J2.nom + " est de couleur " + J2.couleur);

        // Determine qui est le premier joueur
        Random r = new Random();
        boolean le_premier = r.nextBoolean();
        if (le_premier) {
            JoueurCourant = Listejoueurs[0];
        } else {
            JoueurCourant = Listejoueurs[1];
        }

        //plateauDeJeu.afficherPlateau(); on le fait ?

    }

}
