package contabanco;

public class ContaBanco {
   public int numConta;
   protected String tipoConta;
   private String donoConta;
   private double saldoConta;
   private boolean statusConta;
   
   //Métodos especiais
   public ContaBanco(){
       this.saldoConta = 0; //Saldo igual a zero
       this.statusConta = false; //Conta fechada
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
   
   //Método get e set para o atributo status
   public boolean getStatus(){
       return this.statusConta;
   }
   public void setStatus(boolean status){
       this.statusConta = status;
   }
   
   //Métodos
   //Método para abrir uma conta
   public void abrirConta(String tpConta){
       this.setTipoConta(tpConta);
       this.setStatus(true);
       
       if(tpConta == "CC"){
           this.setSaldoConta(50);
       }else if (tpConta == "CP"){
           this.setSaldoConta(150);
       }
   }
   
   //Método para fechar a conta
   public void fecharConta(){
       if(this.getSaldoConta() > 0){
           System.out.println("Impossivel Fechar a conta!");
           System.out.println("A conta tem de saldo: R$ " + this.getSaldoConta());
           System.out.println("O saldo deve ser igual a R$ 0.");
       }else if(this.getSaldoConta() < 0){
           System.out.println("Impossivel Fechar a conta!");
           System.out.println("Esta conta tem em divida: R$ " + this.getSaldoConta()); 
           System.out.println("O saldo deve ser igual a R$ 0.");
       }
   }
   
}
