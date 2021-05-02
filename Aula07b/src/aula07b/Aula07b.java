package aula07b;

public class Aula07b {
    public static void main(String[] args) {
      /* Lutador l = new Lutador("Pretty boy", "França", 31 ,1.75f, 68.9f, 11, 2, 1);
       l.apresentar();
       l.status();*/
      
        Lutador l[] = new Lutador[6]; //array de lutadores
        l[0] = new Lutador("Pretty boy", "França", 31 ,1.75f, 68.9f, 11, 2, 1);
        //l[0].status();
        
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[1].status();
    }
    
}
