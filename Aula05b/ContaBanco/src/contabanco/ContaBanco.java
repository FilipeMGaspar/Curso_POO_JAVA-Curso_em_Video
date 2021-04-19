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
   
   //Método get e set para o atributo numConta
   public int getNumConta(){
       return this.numConta;
   }
   public void setNumConta(int nrConta){
       this.numConta = nrConta;
   }
   
   //Método get e set para o atributo tipoConta
   public String getTipoConta(){
       return this.tipoConta;
   }
   public void setTipoConta(String tipo){
       this.tipoConta = tipo;
   }
   
   //Método get e set para o atributo donoConta
   public String getDonoConta(){
       return this.donoConta;
   }   
   public void setDonoConta(String dono){
       this.donoConta = dono;
   }
   
   //Método get e set para o atributo saldoConta
   public double getSaldoConta(){
       return this.saldoConta;
   }
   public void setSaldoConta(double valor){
       this.saldoConta = valor;
   }
}
