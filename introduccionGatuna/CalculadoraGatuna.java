
package calculadoragatuna;

public class CalculadoraGatuna {
    public CalculadoraGatuna(){
    }
    public int sumar(int gato1 ,int gato2){
        return gato1 + gato2;
    }
    public int restar(int gato1 ,int gato2){
        return gato1 - gato2;
    }
    public int multiplicar(int gato1 , int gato2){
        return gato1 * gato2;
    }
    public int division(int gato1 , int gato2){
        return gato1 / gato2;
    }
    public int modulo(int gato1 , int gato2){
        return gato1 % gato2;
    }
    public static void main(String[] args) {
    CalculadoraGatuna miCalculadoraGatuna = new  CalculadoraGatuna();
    System.out.println(miCalculadoraGatuna.sumar(3,5));
    System.out.println(miCalculadoraGatuna.restar(4, 8));
    System.out.println(miCalculadoraGatuna.multiplicar(3, 2));
    }
    
}
