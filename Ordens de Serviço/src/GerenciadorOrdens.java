import java.util.ArrayList;

public class GerenciadorOrdens implements Imprimivel {
    private static ArrayList<OrdemDeServico> ordens = new ArrayList<>();

    public void criarOrdem(OrdemDeServico ordem) {
        ordens.add(ordem);
    }

    public void removerOrdem(OrdemDeServico ordem) {
        ordens.remove(ordem);
    }


    public OrdemDeServico procurarOrdem(int numeroOrdem) {
        for (OrdemDeServico ordem : ordens) {
            if (ordem.getNumeroOrdem() == numeroOrdem) {
                return ordem;
            }
        }
        return null;
    }

    @Override
    public String mostrarDados() {
        String dadosGerais = "Ordens";
        for (OrdemDeServico ordem : ordens) {
            dadosGerais += ordem.mostrarDados();
        }
        return dadosGerais;
    }

    public static ArrayList<OrdemDeServico> getOrdens() {
        return ordens;
    }
}
