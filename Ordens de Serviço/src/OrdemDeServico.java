    public class OrdemDeServico implements Imprimivel{
    private int numeroOrdem;
    private String descricao;
    private String status;
    private static int contador = 1;

    public OrdemDeServico(String descricao, String status) {
        this.numeroOrdem = contador++;
        this.descricao = descricao;
        this.status = status;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;

    }

    public void setNumeroOrdem(int numeroOrdem) {
        this.numeroOrdem = numeroOrdem;
    }

    @Override
    public String mostrarDados() {
        return "\n\nNumero da Ordem - " + numeroOrdem +
                "\nDescrição - " + descricao +
                "\nStatus - " + status;
    }

    public int getNumeroOrdem() {
        return numeroOrdem;
    }
}
