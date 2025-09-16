package aplicacao;

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alc = 0, gas = 0, die = 0, x = 0;

        System.out.println("Digite um produto: 1 - alcool / 2 gasolina / 3 diesel / 4 sair:");
        x = sc.nextInt();

        while (x != 4) {

            switch (x) {

                case 1:
                    gas++;
                    break;
                case 2:
                    alc++;
                    break;
                case 3:
                    die++;
                    break;

                default:
                    System.out.println("Codigo invalido, digite novamente");
                    break;



            }
            x = sc.nextInt();
        }
        System.out.println("Muito obrigado");
        System.out.println("Alcool " + alc);
        System.out.println("Gasolina " + gas);
        System.out.println("Diesel " + die);
    }
}
