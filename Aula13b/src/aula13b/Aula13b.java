package aula13b;

public class Aula13b {

    public static void main(String[] args) {
        //programa principal
        
        //Mamifero é uma especialização de Animal
        Mamifero m = new Mamifero();
        m.setIdade(4);
        m.setPeso(36.52);
        m.setMembros(4);
        m.setCorDoPelo("Bege");
        m.emitirSom();
        System.out.println("Mamifero: ");
        m.detalhesMamifero();
    }
    
}
