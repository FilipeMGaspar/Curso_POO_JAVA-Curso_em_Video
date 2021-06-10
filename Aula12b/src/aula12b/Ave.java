package aula12b;

public class Ave extends Animal {
    //Atributos
    private String corDasPenas;
    
    //Métodos geter e seter
    public String getCorDasPenas() {
        return corDasPenas;
    }
    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }
    
    //Métodos públicos
    public void fazerNinho(){
        System.out.println("Construiu um ninho!");
    }

    //Métodos abstractos sobrescritos
    @Override
    public void locomover() {
        System.out.println("Voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave!");
    }
    
    
}
