import java.util.Scanner;

public class Desafio4While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double soma = 0, media, qtde = 0;

        // para garantir que qualquer número digitado
        // substitua inicialização de maior e menor.
        int maior = Integer.MIN_VALUE; // menor valor possível de int
        int menor = Integer.MAX_VALUE; // maior valor possível de int

        System.out.println("Digite um número (0 para sair):");
        n = sc.nextInt();

        while (n != 0) {
            qtde++;
            soma += n;
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
            //a instrução tem que ser feita no final do laço
            System.out.println("Digite um número (0 para sair):");
            n = sc.nextInt();
        }
        if (qtde > 0) {
            media = soma / qtde;
            System.out.println("Quantidade: " + qtde);
            System.out.println("Soma: " + soma);
            System.out.printf("Media: %.2f%n", media);
            System.out.println("Maior numero: " + maior);
            System.out.println("Menor numero: " + menor);
        } else {
            System.out.println("Nenhum número válido foi digitado!");
        }

        sc.close();
    }
}
