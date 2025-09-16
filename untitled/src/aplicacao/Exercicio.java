package aplicacao;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        System.out.println("Digite um numero");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é par");

        } else {
            System.out.println("O numero é impar");
        }
        sc.close();
    }
}
