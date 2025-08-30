package aulalglog;

import java.util.Scanner;

public class Ponderada {
    public static void main(String[] args) {
        int n, i;
        double a, b, c, media;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qauntos casos vai digitar?");
        n = sc.nextInt();
        
        for (i = 1; i <= n; i++){
            System.out.println("Digite 3 numeros:"); 
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            media = (a * 2 + b * 3 + c * 5)/10;
            System.out.printf("MEDIA = %.1f \n", media);
        }
        
        
    }
    
}
