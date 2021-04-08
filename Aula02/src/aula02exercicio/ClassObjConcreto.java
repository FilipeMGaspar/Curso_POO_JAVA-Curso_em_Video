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
    
    void arrancar(){
        arrancar = true;
    }
    
    void parar(){
        arrancar = false;
    }
}
