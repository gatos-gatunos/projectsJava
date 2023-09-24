
package bancogatuno1;
public class BancoGatuno1 {
    private revisarCuentaGatuna cuentaGatuna1;
    private revisarCuentaGatuna cuentaGatuna2;
    
    public  BancoGatuno1(){
    cuentaGatuna1 = new revisarCuentaGatuna("Zeus", 100, "1") ;
    cuentaGatuna2 = new revisarCuentaGatuna("Hades", 200,"2");
    }
    public static void main(String[] args) {
    BancoGatuno1 bancoDeLosDiosesGatunos = new BancoGatuno1();  
    System.out.println(bancoDeLosDiosesGatunos.cuentaGatuna1.nombreGatuno);
    bancoDeLosDiosesGatunos.cuentaGatuna1.adicionarFondosGatunos(5);
    bancoDeLosDiosesGatunos.cuentaGatuna1.getInfoGatuna();
    }
    
}
