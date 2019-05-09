
package aula4;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //&& significa E
        //|| significa OU
        //| significa NÂO
        
        boolean c1=true;
        boolean c2=false;
        boolean c3=true;
        boolean result2;
        boolean result;
        result= c1&&c2;
        System.out.println(result);
        result2 = c1&&c3;
        System.out.println(result+" "+result2);
    }
 
}
