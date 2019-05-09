package aula8;

import java.util.Scanner;

public class ProjetoBanco {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite seu nome");
       String nome = sc.next();
       System.out.println("Digite o depósito");
       double deposito = sc.nextDouble();
       
        System.out.println("-------------------------------");
        System.out.println("1-novo depósito");
        System.out.println("2-saque");
        System.out.println("3-saldo");
        System.out.println("-------------------------------");
        int menu = sc.nextInt();
        
            
        switch (menu){
            case 1:
                System.out.println("Digite o valor de deposito");
                double deposito2;
                deposito2 = sc.nextDouble();
                double somadep = deposito + deposito2;
                break;
            case 2:
                System.out.println("Digite o valor de saque");
                double saque = sc.nextDouble();
                double menos = deposito-saque;
                break;
            case 3:
                System.out.println(deposito);
                break;
            default:
                String fala = "Número Inválido";
                System.out.println(fala);   
        }
        sc.close();
    }
}
        
    
                        
        
        
        
        
        
        
                
        
        

