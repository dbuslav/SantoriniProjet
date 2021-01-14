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
            Listejoueurs[0].couleur = "Gris";
            Listejoueurs[1].couleur = "Bleu";
        }
        else {
            Listejoueurs[0].couleur = "Bleu";
            Listejoueurs[1].couleur = "Gris";
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
        
        // On attribue les ouvriers
        for (int i = 0; i < 2; i++) {

            Ouvrier O = new Ouvrier(Listejoueurs[0].couleur);

            J1.ajouterOuvrier(O);

            J2.ajouterOuvrier(new Ouvrier(J2.couleur));
            
            
        }

        // Determine qui est le premier joueur
        Random r = new Random();
        boolean le_premier = r.nextBoolean();
        if (le_premier) {
            JoueurCourant = Listejoueurs[0];
        } else {
            JoueurCourant = Listejoueurs[1];
        }
        
        //On place les ouvriers
        placer_ouvriers();

        plateauDeJeu.afficherPlateau();
    }
    
    
    void placer_ouvriers() {
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i<2; i++){//on place 2 ouvriers
            //definition ouvrierCourant
            Ouvrier ouvrierCourant=JoueurCourant.ListeOuvriers[i];
            //choix de la colonne
            System.out.println("Ou voulez-vous placer votre ouvrier ? Merci de saisir un numéro de colonne compris entre 1 et 5");
            int colonne = sc.nextInt();
            while (colonne > 5 || colonne < 1) {
            System.out.println("Erreur : Entrer un choix qui existe :");
            colonne = sc.nextInt();
            }
            //choix de la ligne
            System.out.println("Ou voulez-vous placer votre ouvrier ? Merci de saisir un numéro de ligne compris entre 1 et 5");
            int ligne = sc.nextInt();
            while (ligne > 5 || ligne < 1) {
                System.out.println("Erreur : Entrer un choix qui existe :");
                ligne = sc.nextInt();
            }
            plateauDeJeu.placer_ouvrier(colonne,ligne,ouvrierCourant);
           
        }
        
    }
    boolean tour_de_jeu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("C'est a " + JoueurCourant.nom + " de jouer (" + JoueurCourant.couleur + ")");
        
        // action mouvement
        //choix de l'ouvrier
        System.out.println("Quel ouvrier souhaitez vous déplacer");
        int numero_ouvrier = sc.nextInt();
        //problème : comment peut on choisir quel ouvrier deplacer : je vois pas comment decrire chaque ouvrier
        //choix de la case où le deplacer
        System.out.println("Ou voulez-vous placer votre ouvrier ? Merci de saisir un numéro de colonne compris entre 1 et 5");
        int colonne_o = sc.nextInt();
        while (colonne_o > 5 || colonne_o < 1) {
        System.out.println("Erreur : Entrer un choix qui existe :");
        colonne_o = sc.nextInt();
        }
        //choix de la ligne
        System.out.println("Ou voulez-vous placer votre ouvrier ? Merci de saisir un numéro de ligne compris entre 1 et 5");
        int ligne_o = sc.nextInt();
        while (ligne_o > 5 || ligne_o < 1) {
            System.out.println("Erreur : Entrer un choix qui existe :");
            ligne_o = sc.nextInt();
        }
        
        //problème: comment savoir quelle est la position de l'ouvrier choisi
        //ce que je veux faire : deplacementOuvrierPossible(cellule avec ouvrier, cellules choisie)
        //si == true deplacer_ouvrier
        //sinon print merci de choisir une cellule voisine ,dont le niveau est égal, inférieur de 1, ou supérieur de 1 à celui de la cellule ou est votre ouvrier, et ou il n'y a pas de dome
        
        // action construction
        //choix de la case où on contruit
        System.out.println("Ou voulez-vous construire ? Merci de saisir un numéro de colonne compris entre 1 et 5");
        int colonne_c = sc.nextInt();
        while (colonne_c > 5 || colonne_c < 1) {
        System.out.println("Erreur : Entrer un choix qui existe :");
        colonne_c = sc.nextInt();
        }
        //choix de la ligne
        System.out.println("Ou voulez-vous construire ? Merci de saisir un numéro de ligne compris entre 1 et 5");
        int ligne_c = sc.nextInt();
        while (ligne_c > 5 || ligne_c < 1) {
        System.out.println("Erreur : Entrer un choix qui existe :");
      }
    return true;
    }
}

     

