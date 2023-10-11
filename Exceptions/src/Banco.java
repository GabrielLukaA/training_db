public class Banco {

    double saldo;
    double saldoConta1;
    double saldoConta2;
    double saldoCaixa;

    void saque(double valor) throws ValorInvalidoException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException("usuário");
        }
        if (valor <= 0) {
            throw new ValorInvalidoException();
        }
        if (saldoCaixa < valor) {
            throw new SaldoInsuficienteException("caixa");
        }

        saldo -= valor;
    }

    void deposito(double valor) throws ValorInvalidoException{
        if (valor<=0){
            throw new ValorInvalidoException();
        }
        saldo+=valor;
    }


    void transferir(double valor){
        if (saldoConta1< valor){
            throw new SaldoInsuficienteException("usuário");
        }
        saldoConta1-=valor;
        saldoConta2+=valor;
    }
}
