/*

  Tinycar / Mission 4 / Question 2
  Laid SEREIR 
  BTS 1
  
*/

import java.util.Scanner;

public class Q2_M4_TinyCar{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);





        String[] accessoire = {"Roue", "Auto-Radio", "Fenêtre", "siège", "peinture"};
        Double[] prixHT = new Double[5];                                                      // TABLEAUX DES ACCESSOIRES ET LEUR PRIX HT
        int position = 0;





        System.out.println("Veuiller indiquer le prix HT des accessoires suivants : ");      // MESSAGE D'INDICATION DESTINER A L'UTILISATEUR 





        for( int i = 0 ; i < accessoire.length ; i++ ){            //   BOUCLE " FOR " PERMETTANT A L'UTILISATEUR D'INDIQUER LE PRIX HT DE L'ACCESSOIRE
                                                                                        
            System.out.print(accessoire[i]+ " : ");
            prixHT[i] = sc.nextDouble();             
            
        }





        for( int i = 0 ; i < accessoire.length ; i++ ){            // BOUCLE " FOR " PERMETTANT AU PROGRAMME DE PARCOURIR LES TABLEAUX ET D'AFFICHER LES ARTICLES ET LEUR PRIX HT  

            position = position + 1;
                                                                                        
            System.out.println("Article n°"+ position +" : " + accessoire[i]);              
            System.out.println("Prix HT : " + prixHT[i]);
        }
        



        System.out.println("Merci de votre visite au revoir et à bientôt !");        // MESSAGE DE FIN DE PROGRAMME 
        
    }
}
