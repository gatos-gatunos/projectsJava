
package bancogatuno1;

public class revisarCuentaGatuna {
public String nombreGatuno;
public int ahorrosGatunos;  
public String idGatuno; 

public revisarCuentaGatuna(String inputNombreGatuno, int inputAhorrosGatunos, String inputIdGatuno ){
nombreGatuno = inputNombreGatuno;
ahorrosGatunos = inputAhorrosGatunos;
idGatuno = inputIdGatuno;
} 

public void adicionarFondosGatunos(int fondosGatunosParaAdicionar){
ahorrosGatunos =  fondosGatunosParaAdicionar + 1;
}

public void getInfoGatuna(){
System.out.println("Esta cuenta revisada pertenece a "+ nombreGatuno+", tiene ahorrado "+ahorrosGatunos+" en ella.");
}
}


