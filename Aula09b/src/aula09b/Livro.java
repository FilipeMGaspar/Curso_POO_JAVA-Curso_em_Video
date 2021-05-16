package aula09b;

public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
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
        if(totPaginas > 0){
           this.totPaginas = totPaginas; 
        }else{
            this.totPaginas = 0;   
        }        
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
        
    //Métodos abstratos subrever métodos
    public void abrir() {
            this.setAberto(true);  
            this.setPagAtual(1);
    }

    public void fechar() {
        this.setAberto(false);
    }

    public void folhear() {
        if(this.getAberto()){
            System.out.println("\nEstou a folhear o livro!");
        } else {
            System.out.println("\nO livro está fechado não posso folhear!");
        }
    }

    public void avacarPag() {
        if(this.getAberto()){
            System.out.println("\nEstamos na página: " + this.getPagAtual());
            System.out.println("Vou avançar uma página!");
            this.setPagAtual(this.getPagAtual() + 1);            
            System.out.println("Página atual: " + this.getPagAtual());
        }else{
           System.out.println("O livro está fechado!");
           System.out.println("Não posso avançar páginas!");
        }
    }

    public void voltarPag() {
        if(this.getAberto()){
            System.out.println("\nEstamos na página: " + this.getPagAtual());
            System.out.println("Vou recuar uma página!");
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Página atual: " + this.getPagAtual());
        }else{
           System.out.println("O livro está fechado!");
           System.out.println("Não posso recuar nas páginas!");
        }
    }
    
    
    //Métodos públicos
    public void detalhes(){
        System.out.println("\n **** Livro, detalhes ****");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Número de páginas: " + this.getTotPaginas());
    }

    public void emprestarLivro(Pessoa leitor){
        System.out.println("\n ### Empréstimo de Livro! ###");
        System.out.println("O livro " + this.getTitulo());
        this.leitor.fichaPessoa();
    }
}
