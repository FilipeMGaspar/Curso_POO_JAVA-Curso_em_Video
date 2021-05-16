package aula09b;

public class Aula09b {
    public static void main(String[] args) {        
        Pessoa ana = new Pessoa("Ana", 25, 'F');
        //ana.fichaPessoa();
        //ana.fazerAniver();
        //ana.fichaPessoa();
        
        Livro sql = new Livro("SLQ para iniciantes", "Gustavo Guanabara", 659);
       // sql.emprestarLivro(ana);
        
        sql.devolverLivro(ana);
        
        
        //sql.detalhes();
        //sql.abrir();
        
        //sql.setPagAtual(10);
        //sql.avacarPag(); //Avançar uma página       
        
        //sql.setPagAtual(20);
        //sql.voltarPag(); //Recuar uma página
        //sql.folhear();
    }    
}
