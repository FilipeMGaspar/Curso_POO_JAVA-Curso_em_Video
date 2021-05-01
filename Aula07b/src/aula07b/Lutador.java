package aula07b;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //métodos especiais
    //método construtor
    public Lutador(String nome, String nacionalidade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(peso);
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria(float qtpesa) { //Método privado pois a categora vai ser atribuida consoante o  peso do lutador
        if(qtpesa < 52.2){
            this.categoria = "Inválido";
        }else if(qtpesa <= 70.3){
            this.categoria = "Leve";
        }else if(qtpesa <= 83.9){
            this.categoria = "Médio";
        }else if(qtpesa <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }        
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }    
    
    //métodos 
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    
}
