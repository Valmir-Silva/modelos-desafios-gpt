package aulalglog;

import java.util.Scanner;

public class DentFora {
    public static void main(String[] args) {
        int dent = 0, fora = 0, n, x, i;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos numeros vai digitar:");
        n = sc.nextInt();
        
        for (i = 1; i <= n; i++){
            
            System.out.println("Digite um numero:");
            x = sc.nextInt();
            
            if ((x >= 10) && (x <= 20)){
                dent++;
            
             }else{
                fora++;
            }
        }
        System.out.println(dent + " Dentro");
        System.out.println(fora + " Fora");
    }  
    
    
}
