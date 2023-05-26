/*

  Tinycar / Mission 2 / Question 1
  Laid SEREIR 
  BTS 1
  
*/


import java.util.Scanner;

public class Q1_M2_TinyCar {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double TVA = 1.2;





        System.out.print("Quel est la marque du véhicule ? : ");
        String marque = sc.nextLine();

        System.out.print("Quel est le modèle du véhicule ? : ");            // QUESTION POUR L'UTILISATEUR
        String modele = sc.nextLine();

        System.out.print("Quel est le prixHT du véhicule ? : ");
        double prixHT = sc.nextDouble(); 

        double prixTTC = prixHT * TVA;





        if(prixTTC >= 20000){                   // CONDITION POUR UNE LA REMISE DE 10%

            prixTTC = prixTTC * 0.90;

            System.out.println("10% de remise sont appliquée à votre achat !");

        }





        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);           // RECAPITULATIF
        System.out.println("PrixTTC : " + prixTTC);




        System.out.println("Merci de votre visite au revoir et à bientôt !");        // MESSAGE DE FIN DE PROGRAMME 

    }

}
