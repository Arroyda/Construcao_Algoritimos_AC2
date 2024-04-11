package Aula09;

import java.util.Scanner;

public class VerificadorMedia4 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       double media = 0.0;

       /* Registra todas as notas e pesos */
       System.out.print("Coloque a nota da AC1: ");
       float AC1 = input.nextFloat();

       System.out.print("Coloque o peso da AC1: ");
       float PesoAC1 = input.nextFloat();

       System.out.print("Coloque a nota da AC2: ");
       float AC2 = input.nextFloat();

       System.out.print("Coloque o peso da AC2: ");
       float PesoAC2 = input.nextFloat(); 

       System.out.print("Coloque a nota da AG: ");
       float AG = input.nextFloat();

       System.out.print("Coloque o peso da AG: ");
       float PesoAG = input.nextFloat(); 
       
       System.out.print("Coloque a nota da AF: ");
       float AF = input.nextFloat();

       System.out.print("Coloque o peso da AF: ");
       float PesoAF = input.nextFloat(); 

       /* Soma todas as notas e as mutiplica pelo peso colocado pelo usuario */
       media = (AC1 * PesoAC1) + (AC2 * PesoAC2) + (AG * PesoAG) + (AF * PesoAF);

       /* Faz a verificação se a Media estiver a cima de 10 de um aviso, caso contrario efetue a verificação se foi Reprovado, Recuperação ou Aprovado */
        if (media <10) {
            if (media <= 2) {
                System.out.println("Reprovado!");
                System.out.printf("Sua média final é = %.2f %n ", + media);
            } else if (media >= 2.1 && media <= 4.9){
                System.out.println("Fazer Substituta!");
                System.out.printf("Sua média final é = %.2f %n ", + media);
            } else {
                System.out.println("Aprovado!");
                System.out.printf("Sua média final é = %.2f %n ", + media);

            } 
        } else {
            System.out.println("Sua nota ultrapassou 10, por favor tente novamente!");
        } 

       input.close();
    }
}
