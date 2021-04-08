package aula02exercicio;

public class ClasseObjAbstrato {
    // Classe objeto Abstrato
        // Aluno Academia
    
    String nome;
    int idade;
    float peso;
    boolean inscrito;
    
    void inscricao(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
    }
    
    void increver(){
        this.inscrito = true;
    }
    
}
