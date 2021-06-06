package aula12b;

public class Reptil extends Animal {
    //Atributos
    private String corEscama;
    
    //Métodos Geter e seter
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //Métodos Abstractos Sobrescritos
    @Override
    public void locomover() {
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void emitirSom() {
    }
    
}
