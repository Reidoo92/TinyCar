/*

  Tinycar / Mission 3 / Question 3
  Laid SEREIR 
  BTS 1
  
*/
  
  
import java.util.Scanner;

public class Q3_M3_TinyCar {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double TVA = 1.2;
        int t = 0, tentative = 3;



        
        System.out.print("Quel est votre mot de passe ? : ");           // MOT DE PASSE POUR ACCEDER AU PROGRAMME
        String mdp = sc.nextLine();





        while( !mdp.equals("Padawan") & t < 2 ){            // BOUCLE PERMETTANT A L'UTILISATEUR DE RETAPER SON MOT DE PASSE 

            t = t + 1;
            tentative = tentative - 1;





            if( tentative != 1){
                System.out.println("Attention il ne vous reste plus que " + tentative + " tentatives !");

            }                                                                                              // POUR L'ORTOGRAPHE PCQ JE SUIS UN BG (MÊME SI LE RESTE EST CATASTROPHIQUE 0_0)
            else{
                System.out.println("Attention il ne vous reste plus que " + tentative + " tentative !");

            }





                System.out.print("Quel est votre mot de passe ? : ");           // NOUVELLE CHANCE DE RETAPER SON MOT DE PASSE 
                    mdp = sc.nextLine();
        }
        



                                                                             
        if(mdp.equalsIgnoreCase("Padawan")){
                                                                        // MESSAGE DE BIENVENUE POUR L'UTILISATEUR
            System.out.println("Bienvenu Padawan !");





            System.out.print("Quel est la marque du véhicule ? : ");
            String marque = sc.nextLine();

            System.out.print("Quel est le modèle du véhicule ? : ");                            // QUESTION POUR L'UTILISATEUR 
            String modele = sc.nextLine();

            System.out.print("Quel est le prixHT du véhicule ? : ");
            double prixHT = sc.nextDouble(); 

            System.out.print("Le véhicule est-il éléctrique ? (veuiller répondre uniquement par oui/non) : ");
            String elec = sc.nextLine();





            if(elec.equalsIgnoreCase("oui")){

                TVA = 1.05;                                             // CONDITION POUR UNE TVA A 5% AU LIEU DE 20%
            System.out.println("Votre TVA sera de 5% !");

            }

               
            
            double prixTTC = prixHT*TVA;



            if(prixTTC >= 20000){                     // CONDITION POUR UNE LA REMISE DE 10%

                prixTTC = prixTTC * 0.90;                                                       
                 System.out.println("10% de remise sont appliquée à votre achat !");

            }





            System.out.println("Marque : " + marque);
            System.out.println("Modèle : " + modele);            // RECAPITULATIUF 
            System.out.println("PrixTTC : " + prixTTC);





            System.out.println("Merci de votre visite au revoir et à bientôt !");        // MESSAGE DE FIN DE PROGRAMME 

        }



        

        else{

            System.out.println("Vous n'êtes pas malheuresement pas habilité à utiliser ce programme ");             // PAS AUTORISER A UTILISER LE PROGRAMME 
        }
            
    }

}