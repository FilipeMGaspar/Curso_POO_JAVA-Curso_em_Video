package aula13b;

public class Mamifero extends Animal {
    //Atributos
    protected String corDoPelo;
    
    //Métodos geter e seter
    public String getCorDoPelo() {
        return corDoPelo;
    }
    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    //Métodos abestratos sobrescritos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }
    
    //Método publico
    public void detalhesMamifero(){
        System.out.println(" Idade ......: " + this.getIdade());
        System.out.println(" Peso .........: " + this.peso);
        System.out.println(" Membros ......: " + this.membros);
        System.out.println(" Cor do pelo ..: " + this.getCorDoPelo());
    }
}
