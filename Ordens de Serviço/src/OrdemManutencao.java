public class OrdemManutencao extends OrdemDeServico implements Imprimivel {

    private String equipamento;
    private String dataManutencao;

    public OrdemManutencao(String descricao, String status, String equipamento, String dataManutencao) {
        super(descricao, status);
        this.equipamento = equipamento;
        this.dataManutencao = dataManutencao;
    }

    @Override
    public String mostrarDados() {
        return super.mostrarDados() + "\nEquipamento - " + this.equipamento + "\nData de manutenção - " + this.dataManutencao;
    }
}
