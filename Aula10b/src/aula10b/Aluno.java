
package aula10b;

public class Aluno extends Pessoa {
    //Atributos
    private String curso;
    private boolean matr;
    private int numMatr;
    
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

    public int getNumMatr() {
        return numMatr;
    }
    public void setNumMatr(int numMatr) {
        this.numMatr = numMatr;
    }
    
    //Método
    public void cancelarMatricula(){
        this.setMatr(false);
    }
    
    public void ativarMatricula(){
        this.setMatr(true);
    }
    
    public void fichaAluno(){
        this.pessoaDetalhes();
        System.out.println("Matricula: EngInf - "+this.getNumMatr());
        System.out.println("Curso: " + this.getCurso());
        System.out.print("Matricula: ");
        if(this.getMatr()){
            System.out.print("Ativa");
        }else{
            System.out.print("Cancelada.");
        }
        System.out.println("\n");
    }
}