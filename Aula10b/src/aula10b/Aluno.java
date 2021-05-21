
package aula10b;

public class Aluno extends Pessoa {
    //Atributos
    private String curso;
    private boolean matr;
    
    //Métodos Geters e Seters

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean getMatr() {
        return matr;
    }
    public void setMatr(boolean matr) {
        this.matr = matr;
    }
    
    //Método
    public void cancelarMatricula(){
        this.matr = ! this.getMatr();
    }
    
    public void fichaAluno(){
        this.pessoaDetalhes();
        System.out.println("  -> Aluno");
        System.out.println("Curso: " + this.getCurso());
        System.out.println("Matricula: ");
        if(this.getMatr()){
            System.out.print("Ativa");
        }else{
            System.out.println("Anulada.");
        }
    }
}