
package gato;
public class Gato {
   String raza;
   boolean dueño;
   int edad;
   
   public Gato(String razaGato, boolean dueñoGato, int gatoAños){
    System.out.println("Constructor invocado");
    raza = razaGato;
    dueño = dueñoGato;
    edad = gatoAños;
   }
   
    public static void main(String[] args) {
    System.out.println("El metodo main ha comenzado");
    Gato gatigra = new Gato("blanco",true,4);
    Gato gatigro = new Gato("naranaja",true,5);
    boolean esGatigraMasVieja = gatigra.edad > gatigro.edad;
    int totalAñosGatunos = gatigra.edad + gatigro.edad;
    System.out.println("Dos perros creados : un "+gatigro.raza+" y un "+gatigra.raza);
    System.out.println("gatigra es mas vieja que gatigro?"+esGatigraMasVieja );
    System.out.println("El total de las edades es; "+totalAñosGatunos);
    System.out.println("El metodo main ha finalizado");
    }
    
}
