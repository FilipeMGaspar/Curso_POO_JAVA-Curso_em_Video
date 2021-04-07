package aula02;

public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.cor= "Azul";
        c1.ponta = 0.5f;//Referencia a atributo
        c1.tampar(); //Referencia a método
       // c1.status(); //Referencia a método
        c1.rabiscar();   
        
        Caneta c2 = new Caneta();
        
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
    }
    
}
