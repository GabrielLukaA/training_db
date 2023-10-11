public class SaldoInsuficienteException extends RuntimeException {

 public SaldoInsuficienteException(String objeto){
     super("Saldo insuficiente do "+objeto);
 }

}
