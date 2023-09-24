
package personagatuna;
public class PersonaGatuna {
    public int edadGatuna;
    public int saberGatuno;
    public int fitnessGatuno;
    
    public PersonaGatuna(int inputEdadGatuna){
    this.edadGatuna = inputEdadGatuna;
    this.saberGatuno = inputEdadGatuna * 5;
    this.fitnessGatuno = 100 - inputEdadGatuna;
    }
    public void setEdadGatuna(int nuevaEdadGatuna){
    this.edadGatuna = nuevaEdadGatuna;
    }
    public void setSaberGatuno(int nuevoSaberGatuno){
    this.saberGatuno = nuevoSaberGatuno;
    }
     
    public void setFitnessGatuno(int nuevoFitnessGatuno){
    this.fitnessGatuno = nuevoFitnessGatuno;
    }
    
    public void cumpleañosGatuno(){
    this.setEdadGatuna(this.edadGatuna + 1);
    this.setSaberGatuno(this.saberGatuno + 5);
    this.setFitnessGatuno(this.fitnessGatuno - 3);
    }
  
    public static void main(String[] args) {
    PersonaGatuna gatigra = new PersonaGatuna(20);
    gatigra.cumpleañosGatuno();
    System.out.println("La nueva edad es: "+gatigra.edadGatuna);
    System.out.println("Nuevo saber es: "+gatigra.saberGatuno);
    System.out.println("Nuevo fitness es: "+ gatigra.fitnessGatuno );
    }
}
