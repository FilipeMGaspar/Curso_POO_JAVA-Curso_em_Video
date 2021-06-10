package aula12b;

public class Ave extends Animal {
    //Atributos
    private String corDasPenas;
    
    //Métodos geter e seter
    public String getCorDasPenas() {
        return corDasPenas;
    }
    public void setCorDasPenas(String corDasPenas) {
        this.corDasPenas = corDasPenas;
    }
    
    //Métodos públicos
    public void fazerNinho(){
        System.out.println("Construiu um ninho!");
    }

    //Métodos abstractos sobrescritos
    @Override
    public void locomover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void emitirSom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
