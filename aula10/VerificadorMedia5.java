package aula10;

import java.util.Scanner;

public class VerificadorMedia5 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean cancelarSomaPesos = false; // Opera para cancelar o If SomaPesos
        boolean continuar = true;          // Opera se irá continuar ou não o while
        boolean retornaAoInicio = true;    // Opera para que volte para o inicio 
        int resposta = 0;                  // Armazena a resposta do usuario
        int indiceAtual = 0;               // Armazena qual parte do for deve ser executado
        float nota = 0, peso = 0;          // Armazena a nota e o peso do aluno
        double media = 0.0, somaNotas = 0.0, somaPesos = 0.0;

        // Pergunta quantos alunos será verificado e joga dentro do FOR
        System.out.println("Quantos alunos serão avaliados?");
        int numAlunos = input.nextInt();
        
        // Pergunta qual a nota minima
        System.out.println("Qual a nota minima?");
        float notaMinima = input.nextFloat();

        // Solicita o número de notas a serem verificadas
        System.out.println("Quantas notas serão inseridas? ");
        int numNotas = input.nextInt();
 
        for (int j = 0; j <numAlunos; j++) {
            // Pergunta o nome do aluno avaliado e registra ele
            input.nextLine();
            System.out.println("Nome do Aluno");
            String nomeAluno = input.nextLine();

            while (continuar == true) {
                // Reseta os dados dos alunos 
                media = 0;
                peso = 0;
                nota = 0;
                somaPesos = 0;
                somaNotas = 0;
                
                for (int i = indiceAtual; i < numNotas; i++) {
                    // Registra as notas e pesos
                    System.out.printf("Nome da Avaliação %d: ", i + 1);
                    String nomeAvaliacao = input.nextLine();
                    
                    System.out.printf("Nota %d: ", i + 1);
                    nota = input.nextFloat();          
    
                    System.out.printf("Peso %d: ", i + 1);
                    peso = input.nextFloat();
                    
                    // Faz a soma dos pessos e das notas
                    somaNotas += nota * peso;
                    somaPesos += peso;
                    
                    // Verifica se as notas digitas foram corretas
                    System.out.println("Tem certeza destas notas?");
                    System.out.println("1 Sim ---- 2 Não");
                    resposta = input.nextInt();
                    input.nextLine();
                    
                    // Se a resposta for Não ele executa novamente as perguntas de nota e valor daquela avaliação
                    if (resposta == 2){
                        indiceAtual = 0;
                        cancelarSomaPesos = true;
                        retornaAoInicio = true;
                        break;
                    } 
                
                } // Fim do Segundo FOR

                // Cancela a soma de pesos para que não haja conflito 
                if (cancelarSomaPesos = false) {
                    continue;
                }else if (somaPesos > 1) { 
                    // Avisa se ultrapassou o limite de peso = 1
                    System.out.println("Seu conjunto de Notas ultrapassou o Limite! Por favor refaça!");
                }else {
                    // Cancela a função
                    cancelarSomaPesos = false;

                    // Calcula a média
                    media = somaNotas;

                    // Printa o nome do aluno
                    System.out.println(nomeAluno);

                    // Faz a verificação da Média
                    if (media == notaMinima) {
                        System.out.println("Sua nota está na Média!");
                    }else if (media < notaMinima) {
                        System.out.println("Sua nota está abaixo da Média!");
                    } else {
                        System.out.println("Sua nota está a cima da Média!");
                    }
            
                    // Faz a validação da média para saber se foi aprovado ou não e comenta o resultado
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
                    
                }  
                
                //Retorna para o inicio do programa
                if (retornaAoInicio) {
                    break;
                }

            } // Fim do While

            
        } // Fim do primeiro FOR

       input.close();

    }
}
