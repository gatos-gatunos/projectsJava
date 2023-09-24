
package cuentadeahorrosgatuna;
public class CuentaDeAhorrosGatuna {
   public String dueñoGatuno;
   public int balanceGatunoDolar;
   public double balanceGatunoEuro;
   
   public CuentaDeAhorrosGatuna( String dueñoGatuno, int balanceGatunoDolar ){
   dueñoGatuno = dueñoGatuno;
   balanceGatunoDolar = balanceGatunoDolar;
   balanceGatunoEuro = balanceGatunoDolar * 0.85;
   }
   
   public void addDineroGatuno( int balanceGatunoDolar){
   System.out.println("Adicionando "+balanceGatunoDolar+" dolares a la cuenta.");
   this.balanceGatunoDolar = balanceGatunoDolar + 1;
   System.out.println("El nuevo balance es: "+this.balanceGatunoDolar+" dolares.");
   }
   
   public static void main(String[] args) {
   CuentaDeAhorrosGatuna gatigraCuentaDeAhorrosGatuna = new CuentaDeAhorrosGatuna("Gatigra", 1000) ;    
   gatigraCuentaDeAhorrosGatuna = new CuentaDeAhorrosGatuna("Gatigra", 1000) ;   
   gatigraCuentaDeAhorrosGatuna.addDineroGatuno(2000); 
   }
}
