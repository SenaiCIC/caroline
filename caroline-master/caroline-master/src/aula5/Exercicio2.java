
package aula5;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo");
        String nome = sc.next();
        String sobre = sc.nextLine();
        System.out.println("Seu nome é "+nome+sobre);
        
        sc.close();
    }
    
}
