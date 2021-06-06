
package aula12b;

public class Aula12b {

    public static void main(String[] args) {
        //Animal a = new Animal(); //Classes abstractas não podem ser instanciadas
        
        Mamifero m = new Mamifero();
        m.setPeso(16.58);
        m.setIdade(2);
        m.setMembros(4);
        m.setCorPelo("Castanho");
        m.detalhesMamifero();
        
    }
    
}
