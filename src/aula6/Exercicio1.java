
package aula6;

public class Exercicio1 {
    public static void main(String[] args) {
        String produto1 = "computador";
        String produto2 = "mesa";
        int idade = 30;
        int codigo = 3200;
        char sexo = 'F';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;
        System.out.println("produtos:");
        System.out.printf("%s com preço de R$ %.2f%n", produto1, preco1);
        System.out.printf("%s com preço de R$ %.2f%n", produto2, preco2);
        System.out.printf("Idade: %d anos, codigo %d e sexo %c%n",idade, codigo, sexo);
        System.out.printf("medida com 8 casas: %.8f%n", medida);
        System.out.printf("medida arredondada com 3 casa:, %.3f%n", medida);
        
    }
  
}
