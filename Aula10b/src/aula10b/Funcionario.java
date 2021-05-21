package aula10b;

public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Métodos Geters e Seters

    public String getSetor() {
        return setor;    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //Método Publico
    public void mudarTrabalho(){
        this.trabalhando = ! this.getTrabalhando();
    }
    
    public void fichaFuncionario(){
        this.pessoaDetalhes();
        System.out.println("Setor: " + this.getSetor());
        
        if(this.getTrabalhando()){
            System.out.print("Trabalhando.");
        }else{
            System.out.print("EM Repouso.");
        }
        System.out.println("\n");
    }
}
