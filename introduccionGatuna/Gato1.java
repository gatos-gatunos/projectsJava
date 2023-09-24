
package gato1;
public class Gato1{
    String[] articulosGatunosPopulares;
    int[] vistasGatunas;
    double[] rangosGatunos;
    public Gato1(String[] articulosGatunosIniciales, int[] vistasGatunasIniciales, double[] rangosGatunosIniciales){
    articulosGatunosPopulares = articulosGatunosIniciales;
    vistasGatunas = vistasGatunasIniciales;
    rangosGatunos = rangosGatunosIniciales;
    }
    public String obtenerArticuloGatunoTop(){
        return articulosGatunosPopulares[3];
    }
    public void articuloGatunoVisto(int numerodeGatunoArticulo){
        vistasGatunas[numerodeGatunoArticulo] = vistasGatunas[numerodeGatunoArticulo] + 1;
        System.out.println("El articulo "+articulosGatunosPopulares[numerodeGatunoArticulo]+"ha sido visto "+vistasGatunas[numerodeGatunoArticulo]+" veces.");
    }
    public void cambiarRangoGatuno(int numerodeGatunoArticulo, double rangoGatunoNuevo){
        if(rangoGatunoNuevo>5 || rangoGatunoNuevo < 0){
            System.out.println("el rango debe estar entre 0 y 5");
        }else{
        rangosGatunos[numerodeGatunoArticulo] = rangoGatunoNuevo;
        System.out.println("el articulo"+articulosGatunosPopulares[numerodeGatunoArticulo]+" esta ahora siendo clasificado "+rangosGatunos[numerodeGatunoArticulo]+" comienza");
        }
    }
    public static void main(String[] args) {
    String[]articulosRobotGatuno = {" Noticias del aceite gatuno "," Motores innovadores para carros gatunos ", " Gatos culones, exterminio gatuno ", " Implantes organicos para gatos ", " Encontrando un camino a un mundo no conocido gatunos "};
    int[] vistasRobotGatuno  = {20, 32, 13, 11, 7};
    double[] rangosRobotGatuno = {2.5 , 3.2 , 4.5 , 1.7 , 4.3};
    Gato1 tiemposRobotGatuno = new Gato1(articulosRobotGatuno , vistasRobotGatuno , rangosRobotGatuno );
    tiemposRobotGatuno.articuloGatunoVisto(0);
    tiemposRobotGatuno.articuloGatunoVisto(1);
    System.out.println("El articulo gatuno mas top es: "+tiemposRobotGatuno.obtenerArticuloGatunoTop());
    tiemposRobotGatuno.cambiarRangoGatuno(0, 3 );
    }
}
