package aula11b;

public class Bolsista extends Aluno {
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
    
    @Override
    public void pagarMensalidade(){
        System.out.println("\n..: Aluno Bolsista :..");
        System.out.println("Paga com desconto!");
        System.out.println(" Nome ..: " + this.nome);
        System.out.println(" Matrivula ..: " + this.getMatricula());
        System.out.println(" Curso ..: " + this.getCurso());
    }
}
