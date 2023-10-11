

public class Main {


    //Usuários
    static Atendente atendente = new Atendente(128, "João");
    static Administrador administrador = new Administrador(129, "Carlos");
    static Solicitante solicitante = new Solicitante(130, "Juca");

    //Ordens de manutenção
    static OrdemDeServico OM1 = new OrdemManutencao("Ordem de manutenção 1", "Não feita", "Máquina", "00/00/00");
    static OrdemDeServico OM2 = new OrdemManutencao("Ordem de manutenção 2", "Não feita", "Máquina", "00/00/00");
    static OrdemDeServico OM3 = new OrdemManutencao("Ordem de manutenção 3", "Não feita", "Máquina", "00/00/00");
    static OrdemDeServico OM4 = new OrdemManutencao("Ordem de manutenção 4", "Não feita", "Máquina", "00/00/00");


    //Ordens de Instalação
    static OrdemDeServico OI1 = new OrdemInstalacao("Ordem de instalação 1", "Não feita", "Cleiton", "00/00/00");
    static OrdemDeServico OI2 = new OrdemInstalacao("Ordem de instalação 2", "Não feita", "Cleiton", "00/00/00");
    static OrdemDeServico OI3 = new OrdemInstalacao("Ordem de instalação 3", "Não feita", "Cleiton", "00/00/00");
    static OrdemDeServico OI4 = new OrdemInstalacao("Ordem de instalação 4", "Não feita", "Cleiton", "00/00/00");

    //Ordens para adaptação
    static OrdemDeServico OI5 = new OrdemInstalacao("Ordem de instalação 5", "Não feita", "Cleiton", "00/00/00");
    static OrdemDeServico OI6 = new OrdemInstalacao("Ordem de instalação 6", "Não feita", "Cleiton", "00/00/00");
    static OrdemDeServico OI7 = new OrdemInstalacao("Ordem de instalação 7", "Não feita", "Cleiton", "00/00/00");

    //Gerenciador
    static GerenciadorOrdens gerenciadorDeOrdens = new GerenciadorOrdens();

    //Relatório
    static Relatorio relatorio = new Relatorio();

    public static void main(String[] args) {

        //Criando ordens para os usuários
        solicitante.criarOrdem(OM1);
        solicitante.criarOrdem(OM2);
        solicitante.criarOrdem(OM3);
        solicitante.criarOrdem(OM4);
        administrador.criarOrdem(OI1);
        administrador.criarOrdem(OI4);
        atendente.criarOrdem(OI3);
        atendente.criarOrdem(OI2);


        //Adicionando todas as  ordens no gerenciador;
        gerenciadorDeOrdens.criarOrdem(OM1);
        gerenciadorDeOrdens.criarOrdem(OM2);
        gerenciadorDeOrdens.criarOrdem(OM3);
        gerenciadorDeOrdens.criarOrdem(OM4);
        gerenciadorDeOrdens.criarOrdem(OI1);
        gerenciadorDeOrdens.criarOrdem(OI2);
        gerenciadorDeOrdens.criarOrdem(OI3);
        gerenciadorDeOrdens.criarOrdem(OI4);

        //Modificando status
        OM1.atualizarStatus("Feita.");


        //Editando Ordem e gerando relatório
        System.out.println(relatorio.gerarRelatorio(solicitante.editarOrdem(3, OI5)));
        System.out.println(relatorio.gerarRelatorio(administrador.editarOrdem(4, OI6)));
        System.out.println(relatorio.gerarRelatorio(atendente.editarOrdem(7, OI7)));


        //Removendo ordem
        administrador.deletarOrdem(2);
        gerenciadorDeOrdens.removerOrdem(gerenciadorDeOrdens.procurarOrdem(2));

        //Vendo todas as ordens
        System.out.println(solicitante.verOrdens());
        System.out.println(administrador.verOrdens());
        System.out.println(atendente.verOrdens());
        System.out.println(gerenciadorDeOrdens.mostrarDados());
    }
}
