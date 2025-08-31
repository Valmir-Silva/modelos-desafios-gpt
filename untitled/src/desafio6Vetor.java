import java.util.Scanner;


public class desafio6Vetor {

    // Método para calcular a média de um aluno
    static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos deseja cadastrar? ");
        int qtde = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[qtde];
        double[] nota1 = new double[qtde];
        double[] nota2 = new double[qtde];
        double[] media = new double[qtde];
        int i;

        //entrada dos dados dos alunos
        for (i = 0; i < qtde; i++) {
            System.out.println("Nome do aluno " + (i + 1) + ":");
            nome[i] = sc.nextLine();

            System.out.println("Nota1: ");
            nota1[i] = sc.nextInt();

            System.out.println("Nota2: ");
            nota2[i] = sc.nextInt();
            sc.nextLine(); // limpar buffer

            // Calcular e salvar média
            media[i] = calcularMedia(nota1[i], nota2[i]);
        }
        int aprovados = 0, reprovados = 0, recuperacao = 0;
        double maiorMedia = Double.MIN_VALUE;
        double menorMedia = Double.MAX_VALUE;
        int idxMaior = -1, idxMenor = -1;

        //processar resultados
        for (i = 0; i < qtde; i++) {
            // Contagem de aprovados/recuperação/reprovados
            if (media[i] >= 7) {
                aprovados++;
            } else if (media[i] >= 5) {
                recuperacao++;
            } else {
                reprovados++;
            }
            // Maior e menor média
            if (media[i] > maiorMedia) {
                maiorMedia = media[i];
                idxMaior = i;
            }
            if (media[i] < menorMedia) {
                menorMedia = media[i];
                idxMenor = i;
            }
        }
        //exibir rsultados
        System.out.println("\n--- Resultados ---");
        for (i = 0; i < qtde; i++) {
            String status;

            if (media[i] >= 7) {
                status = "Aprovado";
            }else if (media[i] >= 5) {
                status = "Recuperação";
            } else {
                status = "Reprovado";
            }
            System.out.printf("%s - Média %.1f (%s)\n", nome[i], media[i], status);

        }
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);

        System.out.printf("Maior média: %s (%.1f)\n", nome[idxMaior], maiorMedia);
        System.out.printf("Menor média: %s (%.1f)\n", nome[idxMenor], menorMedia);
    }


}
