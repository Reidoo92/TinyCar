/*

  Tinycar / Mission 5 / Question 3
  Laid SEREIR 
  BTS 1
  
*/

public class Q3_M5_TinyCar{

    public static void main(String[] args){





        String[] accessoire = {"Roue", "Auto-Radio", "Fenêtre", "siège", "peinture"};         // TABLEAUX DES ACCESSOIRES ET LEUR PRIX HT
        double[] prixHT = {120.00, 80.00, 230.00, 500.00, 439.99};   
        double[] prixTTC = new double[prixHT.length];        
        
        


        
        afficheRecap(accessoire, prixHT, prixTTC);       // PERMET D'APPELLER LA FONCTION 




        System.out.println("Merci de votre visite au revoir et à bientôt !");        // MESSAGE DE FIN DE PROGRAMME 

    }





    static void affichePrixHT(String[] accessoire, double[] prixHT){         // FONCTION QUI PERMET D'AFFICHER LE PRIX HT D'UN ARTICLE 

        int position = 0;


        System.out.println("//////////");             
        System.out.println("PRIX HT ");          // TITRE DU RECAPITULATIF
        System.out.println("//////////"); 
        System.out.println("--------");           
            

        for( int i = 0 ; i < accessoire.length ; i++ ){                   

            position = position + 1;
                                                                                    
            System.out.println("Article n°"+ position +" : " + accessoire[i]);              
            System.out.println("Prix HT : " + prixHT[i]);                               // RECAPITULATIF POUR L'UTILISATEUR
            System.out.println("--------"); 
            
        }

    }





    static void affichePrixTTC(String[] accessoire ,double[] prixHT ,double[] prixTTC){         // FONCTION QUI PERMET D'AFFICHER LE PRIX TTC D'UN ARTICLE 

        double tva = 1.2;
        int position = 0;

        System.out.println("//////////");              
        System.out.println("PRIX TTC");            // TITRE DU RECAPITULATIF
        System.out.println("//////////");     
        System.out.println("--------");          
            

        for( int i = 0 ; i < accessoire.length ; i++ ){  
            
            position = position + 1;
            
            prixTTC[i] = prixHT[i] * tva; 

            System.out.println("ARTICLE N°"+ position +" : " + accessoire[i]); 
            System.out.println("Prix TTC : " + prixTTC[i]);                             // RECAPITULATIF POUR L'UTILISATEUR
            System.out.println("-----------");

        }

    }




    static void afficheRecap(String[] accessoire ,double[] prixHT ,double[] prixTTC){         // FONCTION QUI PERMET D'AFFICHER LE RECAPITULATIF D'UN ARTICLE 

        double tva = 1.2;
        int position = 0;

        System.out.println("//////////////");              
        System.out.println("RECAPITULATIF");            // TITRE DU RECAPITULATIF
        System.out.println("//////////////");         
        System.out.println("--------------");        
            

        for( int i = 0 ; i < accessoire.length ; i++ ){  
            
            position = position + 1;
            
            prixTTC[i] = prixHT[i] * tva; 

            
            System.out.println("ARTICLE N°"+ position +" : " + accessoire[i]);              
            System.out.println("Prix HT : " + prixHT[i]);                               // RECAPITULATIF POUR L'UTILISATEUR
            System.out.println("Prix TTC : " + prixTTC[i]);
            System.out.println("-----------");  

        }

    }

}