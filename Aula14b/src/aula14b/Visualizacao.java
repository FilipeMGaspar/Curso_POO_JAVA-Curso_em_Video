package aula14b;

public class Visualizacao {
    //Atributos
    private Gafanhoto espectador;
    private Video filme;
    
    //Método Construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    //Sobrecarga de Métodos
    public void avaliar(){
       this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        
    }
    
    public void avaliar(float porc){
        
    }
    
    //Métodos Geter e Seter

    public Gafanhoto getEspectador() {
        return espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    //Método toString
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + "\n filme=" + filme + '}';
    }
    
}
