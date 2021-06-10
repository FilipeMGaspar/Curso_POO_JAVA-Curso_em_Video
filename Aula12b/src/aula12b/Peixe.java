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
    
    public void detalhesPeixe(){
        System.out.println("\nPeixe:");
        System.out.println("  Peso: " +this.getPeso());
        System.out.println("  Idade: " + this.idade);
        System.out.println("  Membros: " + this.getMembros());
        System.out.println("  Cor da escama: " + this.corDaEscama);
    }

    //Métodos Abstractos Sobrescritos
    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som!");
    }
    
    
}
