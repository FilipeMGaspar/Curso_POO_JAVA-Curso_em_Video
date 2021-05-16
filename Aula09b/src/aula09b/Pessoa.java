package aula09b;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    
    //Métodos geters e seters
    public String getNome() {
        return nome;    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if(this.getIdade() > 0 && this.getIdade() < 130){
            this.idade = idade;
        }else{
            System.out.println("Idade Inválida");
        }
        
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    //Métodos Publicos
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
}
