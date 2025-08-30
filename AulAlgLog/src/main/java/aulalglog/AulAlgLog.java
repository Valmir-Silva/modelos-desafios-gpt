package aulalglog;

import java.util.Scanner;

public class AulAlgLog {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        int gas = 0, alc = 0, die = 0, cod = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o codigo:");
            cod = sc.nextInt();

       while (cod != 4)
        {
            
        
            switch (cod) {

                case 1:
                     alc++;
                    break;
                case 2:
                    gas++;
                    break;
                case 3:
                    die++;
                    break;
                    
                     default:
                    System.out.println("Código inválido. Digite 1, 2, 3 ou 4.");

            } 
            
            System.out.println("Digite o codigo:");
            cod = sc.nextInt();
        }
        
        System.out.println("muito obg");
        System.out.println("Alcool " + alc);
        System.out.println("Gasolina " + gas);
        System.out.println("Diesel " + die);
    }
}
