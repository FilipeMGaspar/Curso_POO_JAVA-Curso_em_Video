package aula09b;

public class Livro implements Publicacao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private boolean emprestado;
    private Pessoa leitor;
    
    //Método Construtor
    public Livro(String titulo, String autor, int totPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.setTotPaginas(totPaginas);
        this.emprestado = false;
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
    
    public boolean getEmprestado(){
        return emprestado;
    }
    public void setEmprestado(boolean emprestado){
        this.emprestado = emprestado;
    }
        
    //Métodos abstratos subrever métodos
    public void abrir() {
        this.setAberto(true);  
        System.out.println("\nAbri o livro!\n"); 
    }

    public void fechar() {
        this.setAberto(false);
        System.out.println("\nFechei o livro!\n");
    }

    public void folhear() {
        if(this.getAberto()){
            System.out.println("\nEstou a folhear o livro!\n");
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
           
           System.out.println("\\nNão posso avançar páginas!");
           System.out.println("O livro está fechado!\n");
        }
    }

    public void voltarPag() {
        if(this.getAberto()){
            System.out.println("\nEstamos na página: " + this.getPagAtual());
            System.out.println("Vou recuar uma página!");
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Página atual: " + this.getPagAtual());
        }else{          
           System.out.println("\nNão posso recuar nas páginas!");
           System.out.println("O livro está fechado! \n");
           
        }
    }
    
    
    //Métodos públicos
    public void detalhes(){
        System.out.println("\n **** Livro, detalhes ****");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Número de páginas: " + this.getTotPaginas());
    }

    public void emprestarLivro(Pessoa leitores){
        if(this.getEmprestado() == false){
            System.out.println("Livro emprestado!");
            this.setEmprestado(true);
            this.leitor = leitores;
            this.detalhesEmprestimo();   
        }else{
            this.leitor = leitores;
            System.out.println("ERRO! Operação inválida!");
            System.out.println("O livro " + this.getTitulo() + " está emprestado!");
        }
          
    }
    
    public void devolverLivro(Pessoa leitores){
        if(this.getEmprestado()){
            System.out.println("Livro devolvido!");
            this.setEmprestado(false);
            this.leitor = leitores;
            this.detalhesEmprestimo();  
        }else{
            System.out.println("ERRO! Operação inválida!");
            System.out.println("O livro "+this.getTitulo()+" está na Estante!");
            System.out.println("Não pode ser devolvido!");
        }            
    }
    
    public void detalhesEmprestimo(){
        if(this.getEmprestado()){
            System.out.println("");
            System.out.println("O livro: " + this.getTitulo());            
            System.out.println("Foi requisitado pelo(a) Leitor(a): " + this.leitor.getNome() + " com " + this.leitor.getIdade() + " anos.");
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("O livro " + this.getTitulo());            
            System.out.println("Foi entrege pelo(a) leitor(a): " + this.leitor.getNome() + " com " + this.leitor.getIdade() + " anos.");
            System.out.println("");
        }
    }
}
