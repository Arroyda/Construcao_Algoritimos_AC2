package aula07;

import java.util.Scanner;

public class VerificadorMedia2 {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       double media = 0.0;

        // Pergunta qual a nota minima
        System.out.println("Qual a nota minima?");
        float nota = input.nextFloat();

       /* Registra todas as notas */
       System.out.print("Coloque a nota da AC1: ");
       float AC1 = input.nextFloat();

       System.out.print("Coloque a nota da AC2: ");
       float AC2 = input.nextFloat();

       System.out.print("Coloque a nota da AG: ");
       float AG = input.nextFloat();
       
       System.out.print("Coloque a nota da AF: ");
       float AF = input.nextFloat();

       /* Soma todas as notas e as mutiplica pelo peso certo */
       media = (AC1 * 0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.45);

       // Faz a verificação da Média
       if (media == nota) {
        System.out.println("Sua nota está na Média!");
        }else if (media < nota) {
        System.out.println("Sua nota está abaixo da Média!");
        } else {
        System.out.println("Sua nota está a cima da Média!");
       }

        if (media <= 2) {
            System.out.println("Reprovado!");
        } else if (media >= 2.1 && media <= 4.9){
            System.out.println("Fazer Substituta!");
        } else {
            System.out.println("Fazer Aprovado!");
        }
        System.out.printf("Sua média final é: %.2f %n ", + media);
       input.close();
    }
}
