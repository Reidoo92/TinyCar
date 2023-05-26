/*

  Tinycar / Mission 3 / Question 2
  Laïd SEREIR 
  BTS 1
  
*/


import java.util.Scanner;

public class Q2_M3_TinyCar {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double TVA = 1.2, prixHT, prixTTC;
        int vehicule = 0, t = 0, n;




        System.out.print("Nombres de véhicules à calculer ? : ");           // NOMBRE DE VEHICULE A CALCULER
        n = sc.nextInt();





        while( n > t ){

            n = n - 1;
            vehicule = vehicule + 1; 


            System.out.println("Véhicule n° " + vehicule);

            System.out.print("Quel est la marque du véhicule ? : ");
            String marque = sc.next();
    
            System.out.print("Quel est le modèle du véhicule ? : ");            // QUESTION POUR L'UTILISATEUR 
            String modele = sc.next();
    
            System.out.print("Quel est le prixHT du véhicule ? : ");
            prixHT = sc.nextDouble(); 
    
            prixTTC = prixHT*TVA;





            if(prixTTC >= 20000){                   // CONDITION POUR UNE LA REMISE DE 10%
    
                prixTTC = prixTTC * 0.90;
    
                System.out.println("10% de remise sont appliquée à votre achat !");
    
            }





            System.out.println("Marque : " + marque);
            System.out.println("Modèle : " + modele);           // RECAPITULATIF 
            System.out.println("PrixTTC : " + prixTTC);



            

            if(n == t){

                System.out.println("Merci de votre visite au revoir et à bientôt ! ");          // MESSAGE DE FIN DE PROGRAMME 

            }
        }
    }
}