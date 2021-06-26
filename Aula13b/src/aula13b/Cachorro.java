package aula13b;

public class Cachorro extends Lobo {
    //Métodos Abstracto sobrescrito
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    public void reagir(String frase){
        if(frase.equals("Olá") || frase.equals("Comida")){
            System.out.println("Abanar o rabo e latir!");
        }else {
            System.out.println("Rosnar!");
        }
    }
}
