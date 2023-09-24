package bancogatuno;

public class RevisarCuentaGatuna {
private String nombreGatuno;
private int ahorrosGatunos;
private String idGatuno;
private double interesGatuno;


public RevisarCuentaGatuna(String inputNombreGatuno, int inputahorrosGatunos, String inputidGatuno){
this.nombreGatuno = inputNombreGatuno;
this.ahorrosGatunos = inputahorrosGatunos;
this.interesGatuno = 5 ;
}
public int getAhorrosGatunos(){
 return this.ahorrosGatunos;
}
public  void setAhorrosGatunos(int nuevosAhorrosGatunos){
  this.ahorrosGatunos = nuevosAhorrosGatunos;
}
public double getInteresGatuno(){
 return this.interesGatuno * this.ahorrosGatunos;
}

}
