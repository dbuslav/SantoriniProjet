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
public class Cellule {
    Ouvrier OuvrierCourant;
    int NiveauCourant;
    boolean DomeCourant;
    
    Cellule(){
        OuvrierCourant = null; // pas d'ouvrier a la creation de la cellule
        NiveauCourant = 0; // pas de niveau 
        DomeCourant = false ; // pas de dome 
        
    }
    
    boolean affecterOuvrier(Ouvrier un_ouvrier){
        if(OuvrierCourant == null){
            OuvrierCourant = un_ouvrier;
            return true;
        }
        return false;
    }
    
    boolean supprimerOuvrier(Ouvrier un_ouvrier){
        if(OuvrierCourant != null){
            OuvrierCourant = null;
            return true;
        }
        return false;
    }
    
    boolean placerNiveau(){
        if(NiveauCourant<3){
            NiveauCourant = NiveauCourant + 1;
            return true;
        } 
        else{
            System.out.println("Le niveau est deja maximal sur cette case");
            return false;
        }
    }   
    
    boolean placerDome(){
        if(DomeCourant == false){
            DomeCourant = true;
            return true;
        }
        return false;
    }
    
    String lireCouleurOuvrier(){
        if(OuvrierCourant == null){
            return "vide";
        }
        return OuvrierCourant.Couleur;
    }
    
    boolean presenceOuvrier(){
        if(OuvrierCourant!=null){
            return true;
        }
        return false;
    }
    
    boolean presenceTelOuvrier(Ouvrier MonOuvrier){
        if(OuvrierCourant==MonOuvrier){
            return true;
        }
        return false;
    }
    
    
    
    boolean presenceNiveau(){
        if(NiveauCourant!=0){
            return true;
        }
        return false;
    }
    
    boolean presenceDome(){
        if(DomeCourant==true){
            return true;
        }
        return false;
    }
    
    int lireHauteur(){
        int hauteur = NiveauCourant;
        return hauteur;
    }
}
