package aula12b;

public class Canguru extends Mamifero {
    //Métodos públicos
    public void usarBolsa(){
        System.out.println("Usando bolsa!");
    }
    
    
    //Métodos abstractos sobrescritos
    @Override
    public void locomover() {
        System.out.println("Saltando!");
    }
}
