package aula11;
public class App {
    public static void main(String[] args) {
        Carro car = new Carro();
        car.acelera();
        car.cor="Azul";
        car.banco="Branco";
        car.marca="Honda";
        car.motor="AP";
        car.preco=70000.00;
        car.qtdRoda=4;
        car.rodas="Rodão Manero";
        
        Carro car1= new Carro();
        car1.cor="Verde";
        car1.banco="Branco";
        car1.marca="Toyota";
        car1.motor="V8";
        car1.preco=100000.00;
        car1.qtdRoda=4;
        car1.rodas="Rodão Manero";
       
        
        
        System.out.println("Carro1: \n"+car+"\n"+"Carro2: \n"+ car1);
        
    }
}
