package aula03;
public class Caneta {
   public String modelo; //atributo público
   public String cor; //atributo público
   private float ponta; //atributo privado
   protected int carga; //atributo protejido
   protected  boolean tampada; //atributo protejido
    
   public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor); //this é referente á p´ropria caneta
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada: "+this.tampada);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não posso rabiscar!");
        }else{
            System.out.println("Estou a rabiscar!");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}
