package aula6;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.next();
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        System.out.println("Digite seu peso");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();
        System.out.printf("seu nome é %s tem %d anos, pesa %.2f e sua altura é de %.2f%n", nome,idade,peso,altura);
        double alt2 = altura*altura;
        double imc = peso/alt2;
        System.out.printf("seu imc é igual á %.2f%n", imc);
                
                
    }
}
