/*

  Tinycar / Mission 5 / Question 4
  Laid SEREIR 
  BTS 1
  
*/

public class Q4_M5_TinyCar{

    public static void main(String[] args){





        String[] accessoire = {"Roue", "Auto-Radio", "Fenêtre", "siège", "peinture"};         // TABLEAUX DES ACCESSOIRES ET LEUR PRIX HT
        double[] prixHT = {120.00, 80.00, 230.00, 500.00, 439.99};   
        double[] prixTTC = new double[prixHT.length];        
        
        


        
        afficheMoyenne(prixHT, prixTTC);                    // PERMET D'APPELLER LA FONCTION 
        affichePrixMini(accessoire, prixHT, prixTTC);
        affichePrixMax(accessoire, prixHT, prixTTC);




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
            System.out.println("Prix HT : " + prixHT[i]);                                   // RECAPITULATIF POUR L'UTILISATEUR
            System.out.println("Prix TTC : " + prixTTC[i]);
            System.out.println("-----------");  

        }

    }




    static void afficheMoyenne(double[] prixHT ,double[] prixTTC){                // FONCTION QUI PERMET D'AFFICHER LE PRIX MOYEN D'UN ARCTILE 

        double tva = 1.2, sommeHT = 0, sommeTTC = 0, moyenneHT = 0, moyenneTTC = 0;


        System.out.println("///////");              
        System.out.println("MOYENNE");            // TITRE DU RECAPITULATIF
        System.out.println("///////");         
        System.out.println("-------");        
            

        for( int i = 0 ; i < prixHT.length ; i++ ){  
            
            prixTTC[i] = prixHT[i] * tva; 

            sommeHT = sommeHT + prixHT[i];
            sommeTTC = sommeTTC + prixTTC[i];

            moyenneHT = sommeHT / prixHT.length;
            moyenneTTC = sommeTTC / prixHT.length;

        }

            
        System.out.println("Prix HT moyen de votre panier : " + moyenneHT );     
        System.out.println("Prix TTC moyen de votre panier : " + moyenneTTC );                // RECAPITULATIF POUR L'UTILISATEUR
        System.out.println("-----------------------------------------");       
            
        

    }




    static void affichePrixMini(String[] accessoire ,double[] prixHT ,double[] prixTTC){         // FONCTION QUI PERMET D'AFFICHER LE PRIX LE PLUS BAS D'UN ARTICLE 


        String prodMini = accessoire[0];
        double tva = 1.2, sommeHT = 0, sommeTTC = 0, prixMiniHT = prixHT[0], prixMiniTTC = prixHT[0] ;
        


        System.out.println("/////////");              
        System.out.println("PRIX MINI");            // TITRE DU RECAPITULATIF
        System.out.println("/////////");         
        System.out.println("--------");        
        

        for( int i = 0 ; i < accessoire.length ; i++ ){ 
            
            prixTTC[i] = prixHT[i] * tva;
        
            if( prixMiniHT > prixHT[i]) {                                
                prixMiniHT = prixHT[i]; 
                prodMini = accessoire[i];                                          
            }  
            if( prixMiniTTC > prixTTC[i]) {                                
           
                prixMiniTTC = prixTTC[i];                                           
            }  

        }
        
        System.out.println("Article avec le prix le moin elever : " + prodMini );
        System.out.println("Prix HT : " + prixMiniHT );     
        System.out.println("Prix TTC : "  + prixMiniTTC );                              // RECAPITULATIF POUR L'UTILISATEUR
        System.out.println("------------------------------");       
        
        
    }     





    static void affichePrixMax(String[] accessoire ,double[] prixHT ,double[] prixTTC){         // FONCTION QUI PERMET D'AFFICHER LE PRIX LE PLUS ELEVER D'UN ARTICLE 


        String prodMax = accessoire[0];
        double tva = 1.2, sommeHT = 0, sommeTTC = 0, prixMaxHT = prixHT[0], prixMaxTTC = prixHT[0] ;


        System.out.println("////////");              
        System.out.println("PRIX MAX");            // TITRE DU RECAPITULATIF
        System.out.println("////////");         
        System.out.println("--------");        
        

        for( int i = 0 ; i < accessoire.length ; i++ ){  

            prixTTC[i] = prixHT[i] * tva;
        
            if( prixMaxHT < prixHT[i]) {                                
           
                prixMaxHT = prixHT[i]; 
                prodMax = accessoire[i];                                         
            }  
            if( prixMaxTTC < prixTTC[i]) {                                
           
                prixMaxTTC = prixTTC[i];                                           
            }            
            
        }


        System.out.println("Article avec le prix le plus elever : " + prodMax );
        System.out.println("Prix HT : " + prixMaxHT );     
        System.out.println("Prix TTC : "  + prixMaxTTC );                               // RECAPITULATIF POUR L'UTILISATEUR
        System.out.println("-------------------------------");       
        


    }  

}