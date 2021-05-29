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
    public void pagarMensalidade(){
        System.out.println("O aluno " + this.nome +" pagou a mensalidade!");
    }
}
