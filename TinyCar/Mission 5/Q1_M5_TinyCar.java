/*

  Tinycar / Mission 5 / Question 1
  Laid SEREIR 
  BTS 1
  
*/

public class Q1_M5_TinyCar{

    public static void main(String[] args){





        String[] accessoire = {"Roue", "Auto-Radio", "Fenêtre", "siège", "peinture"};           // TABLEAUX DES ACCESSOIRES ET LEUR PRIX HT
        double[] prixHT = {120.00, 80.00, 230.00, 500.00, 439.99};           
        
        



        afficheRecap(accessoire, prixHT);       // PERMET D'APPELLER LA FONCTION 




        System.out.println("Merci de votre visite au revoir et à bientôt !");        // MESSAGE DE FIN DE PROGRAMME 

    }




    static void afficheRecap(String[] accessoire, double[] prixHT){         // FONCTION QUI PERMET D'AFFICHER UN DESCRIPTIF DES TABLEAUX 

        int position = 0;

        for( int i = 0 ; i < accessoire.length ; i++ ){                   

            position = position + 1;
                                                                                    
            System.out.println("Article n°"+ position +" : " + accessoire[i]);              
            System.out.println("Prix HT : " + prixHT[i]);
            
        }
        
    }
}