package aplicacao;

import java.util.Scanner;

public class Desafio8Matriz {
    static double calcularMedia(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtde, i;


        System.out.println("Quantos alunos deseja cadastrar? ");
        qtde = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[qtde];
        double[][] notas = new double[qtde][5];

        for (i = 0; i < qtde; i++) {
            System.out.println("Digite o nome do " + (i + 1) + " aluno: ");
            nome[i] = sc.nextLine();

            System.out.println("Digite a nota 1:");
            notas[i][0] = sc.nextDouble();

            System.out.println("Digite a nota 2:");
            notas[i][1] = sc.nextDouble();
            sc.nextLine();
            System.out.println("Digite a nota 3:");
            notas[i][2] = sc.nextDouble();

            System.out.println("Digite a nota 4:");
            notas[i][3] = sc.nextDouble();
            sc.nextLine();

            notas[i][4] = calcularMedia(notas[i][0], notas[i][1], notas[i][2], notas[i][3]);


        }


        for (i = 0; i < qtde; i++) {
            String status;
            if (notas[i][4] >= 7) {
                status = "Aprovado";
            }
            else if (notas[i][4] >= 5) {
                status = "Recuperação";
            } else {
                status = "Reprovado";
            }
            System.out.printf("Nome: %s - nota 1: %.2f - nota 2: %.2f - nota 3: %.2f - " +
                    "nota 4: %.2f - Media: %.2f \n", nome[i], notas[i][0], notas[i][1], notas[i][2], notas[i][3], notas[i][4]);
        }
        double maiorMedia = Double.MIN_VALUE, menorMedia = Double.MAX_VALUE;
        int idxMaior = -1, idxMenor = -1;
        int aprovado = 0, recuperacao = 0, reprovado = 0;
        for (i = 0; i < qtde; i++) {

            if (notas[i][4] >= 7) {
                aprovado++;
            }
            else if (notas[i][4] >= 5) {
                recuperacao++;
            } else {
                reprovado++;
            }

            if(notas[i][4] > maiorMedia){
               maiorMedia = notas[i][4];
               idxMaior = i;
            }
            if(notas[i][4] < menorMedia){
                menorMedia = notas[i][4];
                idxMenor = i;
            }

        }

        System.out.println("\n--- RESUMO DA TURMA ---");
        System.out.println("Aprovados: " + aprovado);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovado);
        System.out.printf("Maior média: %s (%.2f)%n", nome[idxMaior], maiorMedia);
        System.out.printf("Menor média: %s (%.2f)%n", nome[idxMenor], menorMedia);

        sc.close();
    }
}
