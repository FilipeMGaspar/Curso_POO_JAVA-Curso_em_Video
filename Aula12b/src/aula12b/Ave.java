package aula12b;

public class Ave {
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
    
}
