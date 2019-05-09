package aula11;
public class Carro {
    String cor;
    String banco;
    String marca;
    String motor;
    String rodas;
    double preco;
    int qtdRoda;
    
    public void acelera(){
        System.out.println("Acelera Airton!!");    
    }
      
    public void freia(){
        System.out.println("Freia Airton....!!");  
    }
    
    public void mudadedirecao(){
         System.out.println("Vira pra direita Airton!!"); 
    }
    
    public String toString (){
         String retorno=
        "Cor: "+cor+"\n"+
        "Marca: "+marca+"\n"+
        "Motor: "+motor+"\n"+
        "Rodas: "+rodas+"\n"+
        "Preço: "+preco+"\n"+
        "Quantidade de Rodas: "+qtdRoda+"\n"+
        "Banco: "+banco;
       // System.out.println(retorno);
        return retorno;
    }
    }
   

