
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
        
        //Peixe especialização de Animal
        Peixe p = new Peixe();
        p.setPeso(0.950);
        p.setIdade(1);
        p.setMembros(0);
        p.setCorDaEscama("Branco e amarelo");
        p.detalhesPeixe();
        p.emitirSom();
        p.locomover();
        p.alimentar();
        
        //Ave especialização de Animal
        Ave a = new Ave();
        a.setPeso(0.750);
        a.setIdade(2);
        a.setMembros(2);
        a.setCorDasPenas("Rosa");
        a.detalhesAve();
        a.alimentar();
        a.emitirSom();
        a.locomover();
    }
    
}
