package aula12b;

public class Peixe extends Animal {
    //Atributos
    private String corDaEscama;
    
    //Métodos Geter e Seter
    public String getCorDaEscama() {
        return corDaEscama;
    }
    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }
    
    //Métodos públicos
    public void soltarBolha(){
        System.out.println("Soltou uma bolha!");
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
