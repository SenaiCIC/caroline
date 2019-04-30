package aula6;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num = sc.nextInt();
        int res = num%2;
        //== significa comparar
        if(res==0){
            System.out.println("O número é par");
        }
            else{
                    System.out.println("o número é impar");
                    }        
        sc.close();
        //if=se
        //else=senao
        //else if: entao se(dentro de outro se)
    }
}
