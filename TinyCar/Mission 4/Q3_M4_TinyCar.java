/*

  Tinycar / Mission 4 / Question 3
  Laid SEREIR 
  BTS 1
  
*/

import java.util.Scanner;

public class Q3_M4_TinyCar{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);





        int nbProd = 0;

        System.out.print("Combien de produits voulait vous ajouter au panier ? : ");            // INITIALISATION DU NOMBRE DE PRODUITS PAR L'UTILISATEUR 
        nbProd = sc.nextInt();





        String[] accessoire = new String[nbProd];
        Double[] prixHT = new Double[nbProd];                   // TABLEAUX DES ACCESSOIRES ET LEUR PRIX HT 
        int position = 0;





        if (nbProd == 1){

            System.out.println("Veuiller indiquer le nom de l'accessoire : ");     

        }else {                                                                              // MESSAGE D'INDICATION POUR L'UTILISATEUR ( LE  " IF " C'EST POUR L'ORTOGRAPHE )

            System.out.println("Veuiller indiquer le nom des accessoires : ");      

        }





        for( int i = 0 ; i < accessoire.length ; i++ ){                   //   BOUCLE " FOR " PERMETTANT A L'UTILISATEUR D'INDIQUER LE NOM DE L'ACCESSOIRE 
                                                         
            position = position + 1 ; 

            System.out.print(" Accessoire n°" + position + " : "); 
            accessoire[i] = sc.next();             
            
        }

        position = 0;   // REMETTRE LE COMPTEUR DE " POSITION " A 0





        if (nbProd == 1){

            System.out.println("Veuiller indiquer le prix HT de l'accessoire suivant : ");    

        }else {                                                                               // MESSAGE D'INDICATION POUR L'UTILISATEUR ( LE  " IF " C'EST POUR L'ORTOGRAPHE )

            System.out.println("Veuiller indiquer le prix HT des accessoires suivants : ");      

        }





        for( int i = 0 ; i < accessoire.length ; i++ ){            //   BOUCLE " FOR " PERMETTANT A L'UTILISATEUR D'INDIQUER LE PRIX HT DE L'ACCESSOIRE 
                                                                                        
            System.out.print(accessoire[i]+ " : ");
            prixHT[i] = sc.nextDouble();             
            
        }





        for( int i = 0 ; i < accessoire.length ; i++ ){             // BOUCLE " FOR " PERMETTANT AU PROGRAMME DE PARCOURIR LES TABLEAUX ET D'AFFICHER LES ARTICLES ET LEUR PRIX HT 

            position = position + 1 ;
                                                                                        
            System.out.println("Article n°"+ position +" : " + accessoire[i]);              
            System.out.println("Prix HT : " + prixHT[i]);
        }





        double somme = 0;

        for( int i = 0 ; i < accessoire.length ; i++ ){


            somme = somme + prixHT[i];                         // BOUCLE " FOR " PERMETTANT AU PROGRAMME DE FAIRE LA SOMME DES PRIX DU TABLEAU 

        }

        System.out.println("Somme total du Panier : " + somme);





        System.out.println("Merci de votre visite au revoir et à bientôt !");        // MESSAGE DE FIN DE PROGRAMME 
        
    }
}