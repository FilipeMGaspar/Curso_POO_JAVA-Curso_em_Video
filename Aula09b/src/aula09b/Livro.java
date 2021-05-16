package aula09b;

public class Livro {
    //Atributos
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
        this.setTotPaginas(totPaginas);
    }
    
    
    //Métodos geters e Seters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        if(this.getTotPaginas() > 0){
           this.totPaginas = totPaginas; 
        }else{
            this.totPaginas = 0;   
        }        
    }

    public int getPagatual() {
        return pagatual;
    }
    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
}
