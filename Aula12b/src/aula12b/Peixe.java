package aula12b;

public class Peixe {
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
}
