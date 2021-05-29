package aula11b;

public class Bolsista extends Pessoa {
    //Atributos
    private float bolsa;
    
    //Métodos geter e seter
    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
    //Método público
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
}
