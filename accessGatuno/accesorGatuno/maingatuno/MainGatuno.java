
package maingatuno;
public class MainGatuno {
    public static void main(String[] args) {
    carroGatuno carroGatuno1 = new carroGatuno();
    carroGatuno1.setNombreCompañiaGatuna("Chevrogato");
    carroGatuno1.setNombreModeloGatuno("Gatucruze");
    carroGatuno1.setAñoGatuno(2005);
    
    String nombreCompañiaGatuna = carroGatuno1.getNombreCompañiaGatuna(); 
    String nombreModeloGatuno = carroGatuno1.getNombreModeloGatuno();
    int añoGatuno = carroGatuno1.getAñoGatuno();
    double kilometrajeGatuno = carroGatuno1.getKilometrajeGatuno();
    
    System.out.println("Nombre de la compañia: "+nombreCompañiaGatuna);
    System.out.println("Nombre del modelo: "+nombreModeloGatuno);
    System.out.println("Año "+añoGatuno);
    System.out.println("Kilometraje: "+ kilometrajeGatuno );
    }
    
}
