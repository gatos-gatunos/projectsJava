
package bancogatuno2;
public class BancoGatuno2 {
    private revisarCuentaGatuna cuentaGatuna1;
    private revisarCuentaGatuna cuentaGatuna2;
    
    public  BancoGatuno2(){
    cuentaGatuna1 = new revisarCuentaGatuna("Gatigra", 100, "1");
    cuentaGatuna2 = new revisarCuentaGatuna("Gatigro", 200, "2");
    }
    
    public static void main(String[] args) {
    BancoGatuno2 bancoDeGatos = new BancoGatuno2();
    System.out.println(bancoDeGatos.cuentaGatuna1.getBalanceGatuno());
    bancoDeGatos.cuentaGatuna1.setBalanceGatuno(5000);
    System.out.println(bancoDeGatos.cuentaGatuna1.getBalanceGatuno());
    }
    
}
