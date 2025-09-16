package aplicacao;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, maior, menor;

        System.out.println("Digite 3 numeros inteiros:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        maior = Math.max(n1, Math.max(n2, n3));
        menor = Math.min(n1, Math.min(n2, n3));
        System.out.println("O numero maior é: " + maior);
        System.out.println("O numero menor é: " + menor);

        if (n1 > n2 && n1 > n3)
            maior = n1;
        else if (n2 > n3)
            maior = n2;
        else {
            maior = n3;
        }
        System.out.println("O numero maior é: " + maior);

        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n3) {
            menor = n2;
        } else {
            menor = n3;
        }
        System.out.println("O numero menor é: " + menor);

        // condição ? valor se vdd : valor se falso
        // primeiro testo o n1 e depois o n2
        maior = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.println("O numero maior é: " + maior);

        menor = (n1 < n2) ? ((n1 < n3) ? n1 : n3) : ((n2 < n3) ? n2 : n3);
        System.out.println("O numero menor é: " + menor);
        sc.close();
    }
}
