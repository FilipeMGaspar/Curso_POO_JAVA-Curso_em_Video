package aula04b;

public class Caneta {
   private String modelo;
   private float ponta;
   private boolean tampada;
   
   //Método Construtor
   public void Caneta(){ //este é o método Construtor
       
   }
   
   public String getModelo(){
       return this.modelo;
   }
   public void setModelo(String model){
      this.modelo = model;  
   }
   
   public float getPonta(){
       return this.ponta;
   }
   public void setPonta(float DmPonta){
       this.ponta = DmPonta; 
   }
   
   public void tampar(){
       this.tampada = true;
   }
   
   public void destampar(){
       this.tampada = false;
   }
   
   public void status(){
       System.out.println("SOBRE A CANETA");
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
   }
}
