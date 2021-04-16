package aula04b;

public class Aula04b {

    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.setModelo("Bic");
        //c1.modelo="BIC"; //Atributo privado
       
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f; //Atributo privado
        
        //c1.status();        
        System.out.println("tenho uma caneta " + c1.getModelo() + " de ponta "+c1.getPonta());
    }
    
}
