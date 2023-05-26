/*

  Tinycar / Mission 3 / Question 1
  Laïd SEREIR 
  BTS 1
  
*/


import java.util.Scanner;

public class Q1_M3_TinyCar {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double TVA = 1.2;
        int restart = 1;





        while(restart == 1){

            System.out.print("Quel est la marque du véhicule ? : ");
            String marque = sc.next();
    
            System.out.print("Quel est le modèle du véhicule ? : ");            // QUESTION POUR L'UTILISATEUR 
            String modele = sc.next();
    
            System.out.print("Quel est le prixHT du véhicule ? : ");
            double prixHT = sc.nextDouble(); 
    
            double prixTTC = prixHT*TVA;





            if(prixTTC >= 20000){                   // CONDITION POUR UNE LA REMISE DE 10%
    
                prixTTC = prixTTC * 0.90;
    
                System.out.println("10% de remise sont appliquée à votre achat !");
    
            }





            System.out.println("Marque : " + marque);
            System.out.println("Modèle : " + modele);           // RECAPITULATIF
            System.out.println("PrixTTC : " + prixTTC);





            System.out.print("Taper 1 pour relancer le programme, 0 pour le quitter : ");           // DEMANDE DE RELANCE DU PROGRAMME 
            restart = sc.nextInt();





            while(restart != 1 && restart != 0){

                System.out.println("Une erreur c'est produite ! ");
                System.out.print("Taper 1 pour relancer le programme, 0 pour le quitter : ");           // EN CAS DE MAUVAISE SAISI RELANCE DE LA DEMANDE 
                restart = sc.nextInt();
            }





            if(restart == 0){

                System.out.println("Merci de votre visite au revoir et à bientôt ! ");          // MESSAGE DE FIN DE PROGRAMME 

            }
        }
    }
}