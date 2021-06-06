package aula12b;

public class Mamifero extends Animal {
    //Atributos
    private String corPelo;
    
    //Métodos abstractos sobrescritos
    @Override
    public void locomover() {
        
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void emitirSom() {
        
    }
    
    //Métodos geter e seter
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
