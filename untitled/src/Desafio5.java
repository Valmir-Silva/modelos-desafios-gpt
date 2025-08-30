import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, qtdePessoa = 0, qtde18 = 0, qtde60 = 0;
        int maiorIdd = Integer.MIN_VALUE; // menor valor possível de int
        int menorIdd = Integer.MAX_VALUE; // maior valor possível de int
        double mediaIdd, soma = 0;

        System.out.println("Digite uma idade (número negativo para sair):");
        idade = sc.nextInt();
        
        while(idade >= 0){

            qtdePessoa++;
            soma += idade;

            if(idade < 18){
                qtde18++;
            }
            if (idade >= 60){
                qtde60++;
            }
            if(idade > maiorIdd){
                maiorIdd = idade;
            }
            if (idade < menorIdd ){
                menorIdd = idade;
            }
            System.out.println("Digite uma idade (número negativo para sair):");
            idade = sc.nextInt();

        }
        if(qtdePessoa == 0){
            System.out.println("Idade invalida");
        }else{
            mediaIdd = soma / qtdePessoa;

            System.out.println("Quantidade de pessoas: " + qtdePessoa);
            System.out.printf("Media das idades: %.2f%n", mediaIdd);
            System.out.println("Menores de 18 anos: " + qtde18);
            System.out.println("Idosos (60+): " + qtde60);
            System.out.println("Maior idade: " + maiorIdd);
            System.out.println("Menor idade " + menorIdd);
        }
        sc.close();
    }
}
