public class Main {
    static Banco banco = new Banco();
    public static void main(String[] args) {

        banco.saldo = 1001;
        banco.saldoCaixa = 800;

        try{
            metodo2();
        } catch (ValorInvalidoException e){
            System.out.println(e);
        }

        System.out.println(banco.saldo);


    }

    private static void metodo2() throws ValorInvalidoException {
        try {
            banco.saque(1500);
        } catch (ValorInvalidoException e){
            throw e;
        }

    }
}
