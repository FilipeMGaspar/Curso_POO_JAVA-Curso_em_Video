package aula10b;

public class Aula10b {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setIdade(26);
        p1.setSexo('M');
        p1.pessoaDetalhes();
        
        Professor p2 = new Professor();
        p2.setNome("Maria");
        p2.setEspecialidade("Artes");
        p2.setSalario(2500.52f);
        p2.setIdade(11);
        p2.setSexo('F');
        p2.fichaProfessor();

        Aluno p3 = new Aluno();
        
    }
    
}
