package aplicacao;

import java.util.Scanner;

public class Desafio7Matriz {

    // Método para calcular a média de um aluno
    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtde, i;


        System.out.println("Quantos alunos deseja cadastrar? ");
        qtde = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[qtde];
        double[][] notas = new double[qtde][3];

        //entrada de dados
        for (i = 0; i < qtde; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            nome[i] = sc.nextLine();

            System.out.println("Digite a nota 1:");
            notas[i][0] = sc.nextDouble();

            System.out.println("Digite a nota 2:");
            notas[i][1] = sc.nextDouble();
            sc.nextLine();

            notas[i][2] = calcularMedia(notas[i][0], notas[i][1]);


        }

        // Variáveis de estatísticas
        int aprovados = 0, recuperacao = 0, reprovados = 0;
        double maiorMedia = Double.MIN_VALUE, menorMedia = Double.MAX_VALUE;
        int idxMaior = -1, idxMenor = -1;


        //processar resultados
        for (i = 0; i < qtde; i++) {
            // Contagem de aprovados/recuperação/reprovados
            if (notas[i][2] >= 7) {
                aprovados++;
            } else if (notas[i][2] >= 5) {
                recuperacao++;
            } else {
                reprovados++;
            }
            // Maior e menor média
            if (notas[i][2] > maiorMedia) {
                maiorMedia = notas[i][2];
                idxMaior = i;
            }
            if (notas[i][2] < menorMedia) {
                menorMedia = notas[i][2];
                idxMenor = i;
            }
        }

        System.out.println("-- Resultados --");
        for (i = 0; i < qtde; i++) {
            String status;
            if (notas[i][2] >= 7) {
                status = "Aprovado";
            } else if (notas[i][2] >= 5) {
                status = "Recuperação";
            } else {
                status = "Reprovado";
            }
            System.out.printf("%-10s - NOTA 1: %-3.1f | NOTA 2: %-3.1f | MEDIA: %-3.1f | %s%n",
                    nome[i], notas[i][0], notas[i][1], notas[i][2], status);
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);

        System.out.printf("Maior média: %s (%.1f)\n", nome[idxMaior], maiorMedia);
        System.out.printf("Menor média: %s (%.1f)\n", nome[idxMenor], menorMedia);

            sc.close();
    }


}

