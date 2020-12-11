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
public class Joueur {
    String nom;
    String couleur;
    Ouvrier[] ListeOuvriers= new Ouvrier [2];
    
    public Joueur(String unNom){
        nom =unNom;
    }
    
    public void affecterCouleur(String CouleurOuvrier){
        couleur=CouleurOuvrier;
    }
    
    public boolean ajouterOuvrier(Ouvrier MonOuvrier){
        for (int i = 0; i<2; i++ ) {
            ListeOuvriers[i] = MonOuvrier;
            return true;
        }  
        return false;
    } 
}
