package aula04b;

public class Caneta {
   public String modelo;
   private float ponta;
   
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
   
   public void status(){
       System.out.println("SOBRE A CANETA");
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
   }
}
