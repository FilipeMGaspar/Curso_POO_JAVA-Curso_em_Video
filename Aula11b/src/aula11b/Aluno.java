package aula11b;

public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos geter e seter
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //Método Publico
    public final void pagarMensalidade(){
        System.out.println("Nota de pagamento da mensalidade:");
        System.out.println("  Aluno..: "+this.nome);
        System.out.println("  Matricula..: "+this.matricula);
    }
}
