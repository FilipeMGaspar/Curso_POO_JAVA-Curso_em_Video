package aula11b;
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected char sexo;
    
    //Métodos Geter e Seter

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    //Método público
    public void fazerAniversario(){
        this.idade ++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
