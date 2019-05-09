
package aula4;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        //Operadores + Soma
        //Operadores - Subtração
        //Operadores / Divisão
        //Operadores * Multiplicação
        //Operadores % Módulo
        
        int a = 5;
        int b = 2;
        int result;
        result = a % b;
        System.out.println("Módulo de a e b : "+result);
        result = a + b;
        System.out.println("Soma de a e b : "+result);
        result = a - b;
        System.out.println("Subtração de a e b : "+result);
        result = a * b;
        System.out.println("Multiplicação de a e b : "+result);
        double resultado;
        resultado = (double) a / b;
        System.out.println("Divisão de a e b : "+resultado);
    }
    
}
