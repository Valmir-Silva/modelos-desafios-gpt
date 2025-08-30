package aulalglog;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        int i, x = 0, n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vai digitar?");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.println("Digite um numero:");
                x = sc.nextInt();
                
            if (x == 0) {
                System.out.println("NULO");
            } else if (x % 2 == 0) {
                if (x < 0) {
                    System.out.println("PAR NEGATIVO");
                } else {
                    System.out.println("PAR POSITIVO");
                }

            } else {
                if (x < 0) {
                    System.out.println("IMPAR NEGATIVO");
                } else {
                    System.out.println("IMPAR POSITIVO");
                }
            }
        }

    }

}
