package aula12b;

public class Cachorro extends Mamifero {
    //Métodos públicos
    public void enterrarOsso(){
        System.out.println("Enterrando o Osso!");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o Rabo!");
    }
    
    //Métodos abstractos sobrescritos
     @Override
    public void emitirSom() {
        System.out.println("Latir! Ão ão ão!");
    }
}
