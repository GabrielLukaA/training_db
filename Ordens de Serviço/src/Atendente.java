public class Atendente extends Usuario implements EditorOrdem, VisualizadorOrdem {

    public Atendente(long cpf, String nome) {
        super(cpf, nome);
    }

    @Override
    public OrdemDeServico editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
        GerenciadorOrdens gerenciador = new GerenciadorOrdens();
        OrdemDeServico ordemAMudar = gerenciador.procurarOrdem(numeroOrdem);

        if (ordemAMudar != null) {
            GerenciadorOrdens.getOrdens().remove(ordemAMudar);
            ordem.setNumeroOrdem(numeroOrdem);
            GerenciadorOrdens.getOrdens().add(numeroOrdem - 1, ordem);
            return ordem;
        } else {
            return null;
        }
    }

    @Override
    public String verOrdens() {
        String ordens = "Todas as ordens";
        for (OrdemDeServico ordem : GerenciadorOrdens.getOrdens()) {
            ordens += ordem.mostrarDados();
        }
        return ordens;
    }
}
