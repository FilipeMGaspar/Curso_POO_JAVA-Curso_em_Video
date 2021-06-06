
package aula12b;

public abstract class Animal {
    //Atributos
    protected double peso;
    protected int idade;
    protected int membros;
    
    //Métodos Abstractos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
}
