package contabanco;

public class Aula05b {
     public static void main(String[] args) {
        ContaBanco tst = new ContaBanco();
        tst.abrirConta("CC");
        tst.setNumConta(111);
        tst.setDonoConta("Jusevaldo");
        tst.setStatus(true);
        tst.detalhesConta();
        
        System.out.println("");
         
        tst.depositar(150);
        tst.detalhesConta();
        tst.levantar(205);
     }
}
