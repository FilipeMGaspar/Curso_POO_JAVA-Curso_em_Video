package aula12b;

public class Mamifero extends Animal {
    //Atributos
    private String corPelo;
    
    //Métodos abstractos sobrescritos
    @Override
    public void locomover() {
        System.out.println("Correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("Em cria. Mamando!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero!");
    }
    
    //Métodos geter e seter
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
