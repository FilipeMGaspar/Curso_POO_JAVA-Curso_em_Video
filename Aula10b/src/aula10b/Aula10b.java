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
        p3.setNome("Matraquilho");
        p3.setIdade(18);
        p3.setSexo('M');
        p3.setCurso("Informática");
        p3.setMatr(true);
        p3.cancelarMatricula();
        p3.fichaAluno();
        
        Funcionario p4 = new Funcionario();
        p4.setNome("Luciliana");
        p4.setIdade(29);
        p4.setSexo('F');
        p4.setSetor("Secretaria");
        p4.setTrabalhando(true);
        p4.fichaFuncionario();
    }
    
}
