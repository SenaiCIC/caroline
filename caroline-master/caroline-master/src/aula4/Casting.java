
package aula4;

public class Casting {
    public static void main(String[] args) {
        double a;
        float b;
        
        a = 5.0;
        b = (float)a;
        System.out.println(b);
       
       //exemplo2
        double c;
        int d;
        
        c = 5.3;
        d = (int)c;
        System.out.println(d);
        
        //exemplo3
        int e,f;
        double result;
        e = 5;
        f = 2;
        result= (double) e/f;
        System.out.println(result);
    }
    
}
