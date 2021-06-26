package aula13b;

public class Cachorro extends Lobo {
    //Métodos Abstracto sobrescrito
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    //Sobrecarga de métodos 
    public void reagir(String frase){
        if(frase.equals("Olá") || frase.equals("Comida")){
            System.out.println("Abanar o rabo e latir!");
        }else {
            System.out.println("Rosnar!");
        }
    }
    
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Saltar, correr, comer!");
        }
    }
}
