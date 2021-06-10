
package aula12b;

public class Aula12b {

    public static void main(String[] args) {
        //Animal a = new Animal(); //Classes abstractas não podem ser instanciadas
       
        //Mamifero especialização de Animal
        Mamifero m = new Mamifero();
        m.setPeso(16.58);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Castanho");
        m.detalhesMamifero();
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        //Reptil especialização de Animal
        Reptil r = new Reptil();
        r.setPeso(0.850);
        r.setCorEscama("Verde");
        r.setIdade(1);
        r.setMembros(4);
        r.detalhesReptil();
        r.locomover();
        r.alimentar();
        r.emitirSom();
        
        
    }
    
}
