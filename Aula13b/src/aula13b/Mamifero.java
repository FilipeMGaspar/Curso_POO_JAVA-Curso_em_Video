package aula13b;

public class Mamifero extends Animal {
    //Atributos
    protected String corDoPelo;
    
    //Métodos geter e seter
    public String getCorDoPelo() {
        return corDoPelo;
    }
    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    //Métodos abestratos sobrescritos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
}
