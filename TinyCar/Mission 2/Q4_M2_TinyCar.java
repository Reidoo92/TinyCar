/*

  Tinycar / Mission 2 / Question 4
  Laid SEREIR 
  BTS 1
  
*/
  
  
import java.util.Scanner;

public class Q4_M2_TinyCar {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double TVA = 1.2;





        System.out.print("Quel est votre mot de passe ? : ");
        String mdp = sc.nextLine();


        if(mdp.equalsIgnoreCase("Padawan")){                         // DEMANDE DE MOT DE PASSE
                                                                               
            System.out.println("Bienvenu Padawan !");







            System.out.print("Avez-vous une carte une carte Gold ou Platinium ? (veuiller répondre uniquement par oui/non) : ");                      
            String carte =sc.nextLine();


            if(carte.equalsIgnoreCase("oui")){                                                                  // VERIFICATION DE CARTE 

                System.out.print("Avez-vous une Carte 1- Gold ou 2- Platinium ? (veuiller répondre uniquement par 1/2) :  ");
                int carteR = sc.nextInt();










                if(carteR == 1){        // CARTE GOLD

                    double reduction = 0.85;

                    System.out.println("Vous bénéficiez d'un réduction de 15% !");


                    System.out.print("Quel est la marque du véhicule ? : ");
                    String marque = sc.next();
        
                    System.out.print("Quel est le modèle du véhicule ? : ");             // QUESTION POUR L'UTILISATEUR 
                    String modele = sc.next();
        
                    System.out.print("Quel est le prixHT du véhicule ? : ");
                    double prixHT = sc.nextDouble(); 

                    System.out.print("Le véhicule est-il éléctrique ? (veuiller répondre uniquement par oui/non) : ");
                    String elec = sc.next();




        
                    if(elec.equalsIgnoreCase("oui")){           // CONDITION POUR UNE TVA A 5% AU LIEU DE 20% + REDUCTION DE 30%
        
                        TVA = 1.05;
                        reduction = 0.7;

                    System.out.println("Votre TVA sera de 5% et votre réduction passe à 30% géniale !!");
        
                    }
        


                    double prixTTC = prixHT*TVA;
                    prixTTC = prixTTC*reduction;

        
                
                    if(prixTTC >= 20000){                          // CONDITION POUR UNE LA REMISE DE 10%
        
                        prixTTC = prixTTC * 0.90;
        
                        System.out.println("10% de remise sont appliquée à votre achat !");
        
                    }
        
                    System.out.println("Marque : " + marque);
                    System.out.println("Modèle : " + modele);           // RECAPITULATIF
                    System.out.println("PrixTTC : " + prixTTC);
        

                }










            if (carteR == 2){        // CARTE PLATINIUM

                double reduction = 0.8;

                System.out.println("Vous bénéficiez d'un réduction de 20% !");


                System.out.print("Quel est la marque du véhicule ? : ");
                String marque = sc.next();
    
                System.out.print("Quel est le modèle du véhicule ? : ");            // QUESTION POUR L'UTILISATEUR 
                String modele = sc.next();
    
                System.out.print("Quel est le prixHT du véhicule ? : ");
                double prixHT = sc.nextDouble(); 

                System.out.print("Le véhicule est-il éléctrique ? (veuiller répondre uniquement par oui/non) : ");
                String elec = sc.next();




    
                if(elec.equalsIgnoreCase("oui")){           // CONDITION POUR UNE TVA A 5% AU LIEU DE 20% + REDUCTION DE 30%
    
                    TVA = 1.05;
                    reduction = 0.7;

                System.out.println("Votre TVA sera de 5% et votre réduction passe à 30% géniale !!");
    
                }


    
                double prixTTC = prixHT*TVA;
                prixTTC = prixTTC*reduction;
    
            
            
                if(prixTTC >= 20000){                           // CONDITION POUR UNE LA REMISE DE 10%
    
                    prixTTC = prixTTC * 0.90;
    
                    System.out.println("10% de remise sont appliquée à votre achat !");
    
                }
    
                System.out.println("Marque : " + marque);
                System.out.println("Modèle : " + modele);           // RECAPITULATIF
                System.out.println("PrixTTC : " + prixTTC);
    

            }
            

        }










        else{                // SANS CARTE

                System.out.print("Quel est la marque du véhicule ? : ");
                String marque = sc.nextLine();

                System.out.print("Quel est le modèle du véhicule ? : ");            // QUESTION POUR L'UTILISATEUR 
                String modele = sc.nextLine();

                System.out.print("Quel est le prixHT du véhicule ? : ");
                double prixHT = sc.nextDouble(); 

                System.out.print("Le véhicule est-il éléctrique ? (veuiller répondre uniquement par oui/non) : ");
                String elec = sc.nextLine();





                if(elec.equalsIgnoreCase("oui")){           // CONDITION POUR UNE TVA A 5% AU LIEU DE 20%

                    TVA = 1.05;
                    System.out.println("Votre TVA sera de 5% !");

                }



                double prixTTC = prixHT*TVA;

        
        
                if(prixTTC >= 20000){                          // CONDITION POUR UNE LA REMISE DE 10%



                    prixTTC = prixTTC * 0.90;

                    System.out.println("10% de remise sont appliquée à votre achat !");

                }

                System.out.println("Marque : " + marque);
                System.out.println("Modèle : " + modele);           // RECAPITULATIF
                System.out.println("PrixTTC : " + prixTTC);
                
            }





            System.out.println("Merci de votre visite au revoir et à bientôt !");        // MESSAGE DE FIN DE PROGRAMME 

        }





        else{                     // FIN DE PROGRAMME SI MAUVAIS MOT DE PASSE 

            System.out.println("Vous n'êtes pas malheuresement pas habilité à utiliser ce programme ");
        }

    }

}