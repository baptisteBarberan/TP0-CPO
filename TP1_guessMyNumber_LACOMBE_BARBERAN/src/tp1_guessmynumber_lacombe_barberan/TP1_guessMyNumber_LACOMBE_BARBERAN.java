/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_lacombe_barberan;

import java.util.Random;
import java.util.Scanner;

/**
 *EXERCICE 3
 * @author Hugo LACOMBE/Baptiste BArberan 
 */
public class TP1_guessMyNumber_LACOMBE_BARBERAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
    int n = generateurAleat.nextInt(100);
    System.out.println(n);
    n = generateurAleat.nextInt(100);
    System.out.println(n);
    n = generateurAleat.nextInt(100);
    System.out.println(n);
    n = generateurAleat.nextInt(100);
    System.out.println(n);
    n = generateurAleat.nextInt(100);
    System.out.println(n);
    //Affichage des 5 nombres aléatoires générées grace au module Random generator
    // Premiere étape générer un nombre aléatoire entre 0 et 100 => nbadev
    int nbadev = generateurAleat.nextInt(); 
    //On demande à l'utilisateur de saissir un nombre entre 0 et 100 
    Scanner sc = new Scanner(System.in); 
    
    
    }
   