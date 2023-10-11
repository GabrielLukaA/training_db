import java.util.ArrayList;

public abstract class Usuario implements CriadorOrdem{



    public Usuario(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    private long cpf;
    private String nome;
    private ArrayList<OrdemDeServico> ordens = new ArrayList<>();

    public void setOrdens(ArrayList<OrdemDeServico> ordens) {
        this.ordens = ordens;
    }

    @Override
    public void criarOrdem(OrdemDeServico ordem) {
        this.getOrdens().add(ordem);
    }


    public ArrayList<OrdemDeServico> getOrdens() {
        return ordens;
    }

}
