public class OrdemInstalacao extends OrdemDeServico implements Imprimivel {
    private String cliente;
    private String dataInstalacao;

    public OrdemInstalacao(String descricao, String status, String cliente, String dataInstalacao) {
        super(descricao, status);
        this.cliente = cliente;
        this.dataInstalacao = dataInstalacao;
    }

    @Override
    public String mostrarDados() {
        return super.mostrarDados() + "\nCliente - " + this.cliente + "\nData de instalação - " + this.dataInstalacao;
    }
}
