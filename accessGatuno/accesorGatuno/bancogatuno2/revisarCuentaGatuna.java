package bancogatuno2;
public class revisarCuentaGatuna {
private String nombreGatuno;
private int balanceGatuno;
private String idGatuno;

public revisarCuentaGatuna(String inputNombreGatuno, int inputBalanceGatuno, String inputIdGatuno){
nombreGatuno = inputNombreGatuno;
balanceGatuno = inputBalanceGatuno;
idGatuno = inputIdGatuno;
}

public int getBalanceGatuno(){
 return balanceGatuno;
}
public void setBalanceGatuno(int nuevoBalanceGatuno){
 balanceGatuno = nuevoBalanceGatuno; 
}
}
