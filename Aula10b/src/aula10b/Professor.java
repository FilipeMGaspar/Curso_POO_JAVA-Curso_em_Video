package aula10b;

public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos Geters e Seters

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //Método
    public void receberAumento(float aumt){
        this.setSalario(this.getSalario() + aumt);
    }
    
    public void fichaProfessor(){
        this.pessoaDetalhes();
        System.out.println("Especialidade: " + this.getEspecialidade());
        System.out.println("Salário: R$ " + this.getSalario());
        System.out.println("");
    }
}
