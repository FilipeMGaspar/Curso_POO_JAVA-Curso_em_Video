package contabanco;

public class Aula05b {
     public static void main(String[] args) {
        ContaBanco tst = new ContaBanco();
         
        tst.setNumConta(111);
        tst.setDonoConta("Jusevaldo");
        tst.setStatus(true);
        tst.setTipoConta("CC");
        tst.detalhesConta();
     }
}
