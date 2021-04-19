package contabanco;

public class ContaBanco {
   public int numConta;
   protected String tipoConta;
   private String donoConta;
   private double saldoConta;
   private boolean status;
   
   //Métodos especiais
   public ContaBanco(){
       this.saldoConta = 0; //Saldo igual a zero
       this.status = false; //Conta fechada
   }
}
