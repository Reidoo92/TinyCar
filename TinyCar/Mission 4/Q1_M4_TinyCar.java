/*

  Tinycar / Mission 4 / Question 1
  Laid SEREIR 
  BTS 1
  
*/

public class Q1_M4_TinyCar{

    public static void main(String[] args){





        String[] accessoire = {"Roue", "Auto-Radio", "Fenêtre", "siège", "peinture"};
        double[] prixHT = {120.00, 80.00, 230.00, 500.00, 439.99};                              // TABLEAUX DES ACCESSOIRES ET LEUR PRIX HT
        int position = 0;





        for( int i = 0 ; i < accessoire.length ; i++ ){                  // BOUCLE " FOR " PERMETTANT AU PROGRAMME DE PARCOURIR LE TABLEAU ET D'AFFICHER LES ARTICLES ET LEUR PRIX HT  

            position = position + 1;
                                                                                        
            System.out.println("Article n°"+ position +" : " + accessoire[i]);              
            System.out.println("Prix HT : " + prixHT[i]);

        }




        System.out.println("Merci de votre visite au revoir et à bientôt !");        // MESSAGE DE FIN DE PROGRAMME 
    }
}