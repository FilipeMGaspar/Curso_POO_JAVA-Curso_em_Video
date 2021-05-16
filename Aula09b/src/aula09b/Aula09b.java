package aula09b;

public class Aula09b {
    public static void main(String[] args) {
        Pessoa ana = new Pessoa("Ana", 25, 'F');
        ana.fichaPessoa();
        ana.fazerAniver();
        ana.fichaPessoa();
        
        Livro sql = new Livro("SLQ para iniciantes", "Gustavo Guanabara", 659);
        sql.detalhes();
        sql.abrir();
        sql.avacarPag();
        
        //sql.folhear();
    }    
}
