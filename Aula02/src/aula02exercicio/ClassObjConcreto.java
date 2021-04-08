package aula02exercicio;

public class ClassObjConcreto {
    // Classe objeto concreto
        // Carro   
    String marca;
    String modelo;
    String combustivel;
    boolean arrancar;
        
    void criarMarca(String m){
        this.marca = m; 
    }
    
    void criarModelo(String mod){
        this.modelo = mod;
    }
    
    void tipoCombustivel(String comb){
        this.combustivel = comb;
    }
    
    void ligarMotor(){
        arrancar = true;
    }
    
    void pararMotor(){
        arrancar = false;
    }
    
    void iniciarMarcha(){
       if(this.arrancar == true){
           System.out.println("Vamos iniciar a viagem!");
       }
    }
}
