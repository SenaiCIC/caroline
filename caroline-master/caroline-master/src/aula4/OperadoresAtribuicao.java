package aula4;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        //= recebe
        int a = 10;
        //recebe o a + 5
        int result = 0;
        a +=5;
        System.out.println(a+" "+result);
        //ele mesmo - um valor
        System.out.println(a -= 2);
        //ele mesmo vezes um valor
        System.out.println(a *=3);
        
        //soma com +1
        a++;
        System.out.println(a);
        int b = ++a;
        System.out.println(b +" "+a);
    }
  
}
