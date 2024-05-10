package Aula08;

import java.util.Scanner;

public class VerificadorMedia3 {
    private static final char nomeAvaliacao = 0;

    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       
       double media = 0.0, somaNotas = 0.0, somaPesos = 0.0;

       // Pergunta qual a nota minima
       System.out.println("Qual a nota minima?");
       float notaMinima = input.nextFloat();

        // Solicita o número de notas a serem verificadas
        System.out.print("Quantas notas serão inseridas? ");
        int numNotas = input.nextInt();
 
        // Registra as notas e pesos
        for (int i = 0; i < numNotas; i++) {
            System.out.printf("Nome da Avaliação %d: ", i + 1);
            String nomeAvaliacao = input.next();

            System.out.printf("Nota %d: ", i + 1);
            float nota = input.nextFloat();
 
            System.out.printf("Peso %d: ", i + 1);
            float peso = input.nextFloat();

            somaNotas += nota * peso;
            somaPesos += peso;
          
        }
        
        //Verificação se ultrapassou o limite de peso = 1
        if (somaPesos < 1) {
            // Calcula a média
            media = somaNotas;

            // Faz a verificação da Média
            if (media == notaMinima) {
                System.out.println("Sua nota está na Média!");
            }else if (media < notaMinima) {
                System.out.println("Sua nota está abaixo da Média!");
            } else {
                System.out.println("Sua nota está a cima da Média!");
            }


            // faz a validação da média para saber se foi aprovado ou não e comenta o resultado
            if (media <= 2) {
                System.out.println("Reprovado!");
                System.out.printf("Sua média final é: %.2f %n ", + media);
             } else if (media >= 2.1 && media <= 4.9){
                System.out.println("Fazer Substituta!");
                System.out.printf("Sua média final é: %.2f %n ", + media);
            } else {
                System.out.println("Aprovado!");
                System.out.printf("Sua média final é: %.2f %n ", + media);
            }
        }else {
            System.out.println("Seu conjunto de Notas ultrapassou o Limite! Por favor refaça!");
        }

        
       
       input.close();
    }
}
