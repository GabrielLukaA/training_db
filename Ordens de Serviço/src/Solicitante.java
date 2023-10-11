import java.util.ArrayList;

public class Solicitante extends Usuario implements CriadorOrdem, EditorOrdem, VisualizadorOrdem {

    public Solicitante(long cpf, String nome) {
        super(cpf, nome);
    }


    @Override
    public OrdemDeServico editarOrdem(int numeroOrdem, OrdemDeServico ordem) {
        for (OrdemDeServico ordemFor : getOrdens()) {
            if (ordemFor.getNumeroOrdem() == numeroOrdem) {
                getOrdens().remove(ordemFor);
                ordem.setNumeroOrdem(ordemFor.getNumeroOrdem());
                getOrdens().add(numeroOrdem - 1, ordem);
                GerenciadorOrdens.getOrdens().remove(ordemFor);
                GerenciadorOrdens.getOrdens().add(numeroOrdem - 1, ordem);

                return ordem;
            }
        }

        return null;
    }

    @Override
    public String verOrdens() {
        String ordens = "Suas Ordens";
        ArrayList<OrdemDeServico> atualizada = new ArrayList<>();
        for (OrdemDeServico minhaOrdem : getOrdens()) {
            for (OrdemDeServico ordemLista : GerenciadorOrdens.getOrdens()) {
                if (minhaOrdem.getNumeroOrdem() == ordemLista.getNumeroOrdem()) {
                    atualizada.add(ordemLista);
                }
            }
        }

        this.setOrdens(null);
        this.setOrdens(atualizada);

        for (OrdemDeServico ordem : getOrdens()) {
            ordens += ordem.mostrarDados();
        }
        return ordens;


    }

//
//    @Override
//    public String verOrdens() {
//        String ordens = "Suas ordens";
//        ArrayList<OrdemDeServico> ordensAMudar = new ArrayList<>();
//        ArrayList<OrdemDeServico> ordensARemover = new ArrayList<>();
//        for (OrdemDeServico ordem : GerenciadorOrdens.getOrdens()) {
//            int i=0;
//            for (OrdemDeServico ordemMinha : getOrdens()) {
//                i++;
//                if (ordemMinha.getNumeroOrdem() == ordem.getNumeroOrdem()) {
//                    ordemMinha = ordem;
//                    ordensAMudar.add(ordemMinha);
//                } else if (i==getOrdens().size() && ){
//                    ordensARemover.add(ordemMinha);
//                }
//
//            }
//        }
//
//        for (OrdemDeServico ordemMinha: ordensARemover){
//            getOrdens().remove(ordemMinha);
//        }
//
//        for (OrdemDeServico ordemMinha : ordensAMudar) {
//            getOrdens().remove(ordemMinha);
//            System.out.println("Sou o zoneiro"+ordemMinha.mostrarDados());
//            getOrdens().add(ordemMinha.getNumeroOrdem() - 1, GerenciadorOrdens.getOrdens().get(ordemMinha.getNumeroOrdem()+1));
//        }
//
//        for (OrdemDeServico ordem : getOrdens()) {
//            ordens += ordem.mostrarDados();
//        }
//        return ordens;
//    }
}
