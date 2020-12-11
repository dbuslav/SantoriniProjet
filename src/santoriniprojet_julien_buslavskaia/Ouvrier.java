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
public class Ouvrier {
    String Couleur;
    
    Ouvrier(String coul){
        Couleur = coul;
    }
    
    String lireCouleur(){
        return Couleur;
    }
}
