
package aula5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ex = new Scanner (System.in);
            System.out.println("Digite um número inteiro");
            int x = ex.nextInt();
            System.out.println("Digite outro número inteiro");
            int y = ex.nextInt();
            int result;
            result = x + y;
            System.out.println("A soma dos números é: "+result);
        ex.close();
    }
    
}
