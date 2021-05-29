
package aula11b;

public class Aula11b {

    public static void main(String[] args) {
        
        //Pessoa P1 = new Pessoa();
        /*Visitante v1 = new Visitante();
        v1.setNome("João");
        v1.setIdade(33);
        v1.setSexo('M');
        System.out.println(v1.toString());*/
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(232115);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo('M');
        a1.pagarMensalidade();
    }
    
}
