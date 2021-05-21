package aula10b;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    //Métodos Geters e Seters

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
    
    //Método 
    public void fazerAniv(){
        this.setIdade(this.getIdade() + 1);
    }
}
