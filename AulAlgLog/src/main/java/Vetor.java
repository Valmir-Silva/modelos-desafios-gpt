
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        int n, i;
        double vet[] = new double[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos numeros vc vai digitar?");
        n = sc.nextInt();
        
        for (i = 0; i <= n - 1; i++){
            System.out.println("Digite um numero");
            vet[i] = sc.nextDouble();
        }
          System.out.println("NUmeros digitados");
          
          for(i = 0; i <= n - 1; i++){
              System.out.println(vet[i]);
          }
    }
    
}
