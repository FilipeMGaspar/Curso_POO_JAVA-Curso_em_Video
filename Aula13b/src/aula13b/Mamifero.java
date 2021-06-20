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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
