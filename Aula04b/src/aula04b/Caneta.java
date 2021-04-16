package aula04b;

public class Caneta {
   private String modelo;
   private float ponta;
   private boolean tampada;
   private String cor;
   
   //Método Construtor
   public Caneta(String model, String color, float DmPonta){ //Este é o método Construtor
       this.tampar();
       this.cor = "Azul";
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
       System.out.println("Cor: " + this.cor);
       System.out.println("Tampada: " + this.tampada);
   }
}
