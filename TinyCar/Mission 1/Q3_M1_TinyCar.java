/*

  Tinycar / Mission 1 / Question 3
  Laid SEREIR 
  BTS 1
  
*/


import java.util.Scanner;       // IMPORTE L'OUTIL SCANNER 

public class Q3_M1_TinyCar {

    public static void main(String[] args) {





        Scanner sc = new Scanner(System.in);
        double TVA = 1.2;





        System.out.print("Quel est le prixHT du véhicule ? : ");
        double prixHT = sc.nextDouble(); 





        double prixTTC = prixHT * TVA;

        System.out.println("Le prixTTC du véhicule est de " + prixTTC);

    }
  
  }