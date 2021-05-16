package aula09b;

public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagatual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Método Construtor
    public Livro(String titulo, String autor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
    }
    
    
}
