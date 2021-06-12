
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
        
        //Canguru especialização de Mamifero
        Canguru cg = new Canguru();
        cg.setPeso(32);
        cg.setIdade(5);
        cg.setMembros(2);
        cg.setCorPelo("Castanho");
        cg.detalhesMamifero();
        cg.usarBolsa();
        cg.locomover();
        cg.alimentar();
        cg.emitirSom();
        
        //Cachorro especialização de Mamifero
        Cachorro cao = new Cachorro();
        cao.setIdade(3);
        cao.setPeso(22);
        cao.setMembros(4);
        cao.setCorPelo("Castanho");
        cao.detalhesMamifero();
        cao.emitirSom();
        cao.alimentar();
        cao.locomover();
        cao.abanarRabo();
        cao.enterrarOsso();
        
        //Cobra especialização de Reptil
        Cobra cbr = new Cobra();
        cbr.setIdade(4);
        cbr.setMembros(0);
        cbr.setPeso(3.5);
        cbr.setCorEscama("Verde");
        cbr.detalhesReptil();
        cbr.alimentar();
        cbr.locomover();
        cbr.alimentar();
        
        //Tartaruga especialização de Reptil
        Tartaruga tnt = new Tartaruga();
        tnt.setPeso(8);
        tnt.setIdade(15);
        tnt.setMembros(4);
        tnt.setCorEscama("Verde");
        tnt.detalhesReptil();
        tnt.alimentar();
        tnt.emitirSom();
        tnt.locomover();
        
        //GoldFish especialização de Peixe
        GoldFish gf = new GoldFish();
        gf.setCorDaEscama("Douradas");
        gf.setPeso(0.0750);
        gf.setIdade(1);
        gf.setMembros(0);
        gf.detalhesPeixe();
        gf.alimentar();
        gf.emitirSom();
        gf.locomover();
        gf.soltarBolha();
        
        //Arara especialização de Ave
        Arara blue = new Arara();
        blue.setPeso(0.0850);
        blue.setIdade(2);
        blue.setMembros(2);
        blue.setCorDasPenas("Azul");
        blue.detalhesAve();
        blue.alimentar();
        blue.emitirSom();
        blue.locomover();
        blue.fazerNinho();
        
    }
    
}
