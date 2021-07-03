package aula14b;

public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected char sexo;
    protected float experiencia;
    
    //Método Construtor

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    
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

    public float getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
    //Método toString

    @Override
    public String toString() {
        return "\nPessoa" + "\n ..: Nome: " + nome + "\n ..: Idade: " + idade + "\n ..: Sexo: " + sexo + "\n ..: Experiencia=" + experiencia;
    }
    
}
