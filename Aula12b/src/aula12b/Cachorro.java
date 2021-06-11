package aula12b;

public class Cachorro extends Mamifero {
    //Métodos públicos
    public void enterrarOsso(){
        System.out.println("Enterrando o Osso!");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o Rabo!");
    }
    
    public void detalhesCachorro(){
        System.out.println("\nCachorro: ");
        System.out.println("  Peso: " + this.getPeso());
        System.out.println("  Idade: " + this.idade);
        System.out.println("  Membros: " + this.membros);
        System.out.println("  Cor do pelo: " + this.getCorPelo());
    }
    
    //Métodos abstractos sobrescritos
     @Override
    public void emitirSom() {
        System.out.println("Latir! Ão ão ão!");
    }
}
