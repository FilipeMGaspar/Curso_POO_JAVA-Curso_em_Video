package aula04b;

public class Caneta {
   private String modelo;
   private float ponta;
   private boolean tampada;
   private String cor;
   
   //Método Construtor
   public Caneta(String model, String color, float DmPonta){ //Este é o método Construtor
       this.setModelo(model);
       this.setPonta(DmPonta);
       this.setCor(color);
   }
   
   ////Métoso Acessores e modificadores dao atributo modelo
   public String getModelo(){
       return this.modelo;
   }
   public void setModelo(String model){
      this.modelo = model;  
   }
   
   //Métoso Acessores e modificadores dao atributo Ponta
   public float getPonta(){
       return this.ponta;
   }
   public void setPonta(float DmPonta){
       this.ponta = DmPonta; 
   }
   
   //Métoso Acessores e modificadores dao atributo cor
   public String getCor(){
       return this.cor;
   }
   public void setCor(String color){
       this.cor = color;
   }
   
   //Métoso Acessores e modificadores dao atributo tampada
   public boolean getTampada(){
       return this.tampada;
   }
   public void setTampada(boolean tampa){
       this.tampada = tampa;
   }
   
   public void tampar(){
       this.setTampada(true);
   }
   
   public void destampar(){
       this.setTampada(false);
   }
   
   public void status(){
       System.out.println("SOBRE A CANETA");
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
       System.out.println("Cor: " + this.getCor());
       System.out.println("Tampada: " + this.getTampada());
   }
}
