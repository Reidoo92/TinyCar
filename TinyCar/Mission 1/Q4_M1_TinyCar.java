/*

  Tinycar / Mission 1 / Question 4
  Laid SEREIR 
  BTS 1
  
*/


import java.util.Scanner;

public class Q4_M1_TinyCar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double TVA = 1.2;






        System.out.print("Quel est la marque du véhicule ? : ");
        String marque = sc.nextLine();

        System.out.print("Quel est le modèle du véhicule ? : ");        // QUESTION POUR L'UTILISATEUR
        String modele = sc.nextLine();

        System.out.print("Quel est le prixHT du véhicule ? : ");
        double prixHT = sc.nextDouble(); 






        double prixTTC = prixHT*TVA;

        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);       // RECAPITULATIF
        System.out.println("PrixTTC : " + prixTTC);

    }
  
  }