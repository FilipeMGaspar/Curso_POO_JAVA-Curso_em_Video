package aula12b;

public class Canguru extends Mamifero {
    //Métodos públicos
    public void usarBolsa(){
        System.out.println("Usando bolsa!");
    }
    
    public void detalhesCanguru(){
        System.out.println("\nCanguru: ");
        System.out.println("  Peso: " + this.peso);
        System.out.println("  Idade: " + this.getIdade());
        System.out.println("  Membros: " + this.membros);
        System.out.println("  Cor do pelo: " + this.getCorPelo());
    }
    
    //Métodos abstractos sobrescritos
    @Override
    public void locomover() {
        System.out.println("Saltando!");
    }
}
