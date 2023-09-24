
package gatodroid;
public class GatoDroid {
   int nivelBateriaGatuna ;
   String nombreGatuno;
   
   public GatoDroid(String droidNombreGatuno){
    nivelBateriaGatuna = 100;
    nombreGatuno = droidNombreGatuno;
   }
   
   public String paraStringGatuno(){
       return "Hola, yo soy el droid "+nombreGatuno;
   }
   public void performTareaGatuna(String gatoTarea){
       System.out.println(nombreGatuno+" esta performeando "+ gatoTarea);  
   }
   public void nivelGatunoDeBateriaPerdida(){
       nivelBateriaGatuna = nivelBateriaGatuna - 10;
   }
   public void energiaGatunaReportada(){
       System.out.println(nivelBateriaGatuna );
   }
   public void energiaGatunaTransferida(){
       System.out.println(nivelBateriaGatuna );
   }
   
    public static void main(String[] args) {
       GatoDroid Gato = new GatoDroid("Gato");
       System.out.println(Gato.paraStringGatuno());
       Gato.performTareaGatuna("bailar");
       Gato.nivelGatunoDeBateriaPerdida();
       Gato.energiaGatunaReportada();
    }
    
}
