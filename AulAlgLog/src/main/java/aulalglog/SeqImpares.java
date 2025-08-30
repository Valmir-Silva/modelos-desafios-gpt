package aulalglog;

import java.util.Scanner;

public class SeqImpares {
    public static void main(String[] args) {
        int x, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de X");
        x = sc.nextInt();
        
        for(i = 1; i <= x; i++){
           if (i % 2 != 0){
            System.out.println(i);
           }
        }
            
    }
    
}
