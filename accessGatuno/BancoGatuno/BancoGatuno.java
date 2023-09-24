
package bancogatuno;
public class BancoGatuno{
    private RevisarCuentaGatuna cuentaGatuna1;
    private RevisarCuentaGatuna cuentaGatuna2;
    
    public BancoGatuno(){
     cuentaGatuna1 = new RevisarCuentaGatuna("Zeus",100,"1");
     cuentaGatuna2 = new RevisarCuentaGatuna("Hades",200,"2");
    }
    public static void main(String[] args) {
    BancoGatuno bancoDeLosDiosesGatunos = new BancoGatuno();
    System.out.println(bancoDeLosDiosesGatunos.cuentaGatuna1.getAhorrosGatunos());
    bancoDeLosDiosesGatunos.cuentaGatuna1.setAhorrosGatunos(5000);
    System.out.println(bancoDeLosDiosesGatunos.cuentaGatuna1.getAhorrosGatunos());
    System.out.println(bancoDeLosDiosesGatunos.cuentaGatuna1.getInteresGatuno());
    }
}
