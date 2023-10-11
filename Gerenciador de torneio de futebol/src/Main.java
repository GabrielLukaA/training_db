import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Campeonato campeonato = new Campeonato();
    static Usuario usuario = new Torcedor("pk");


    public static void main(String[] args) {

        usuario.getUsuarios().add(new Torcedor("LK"));
        campeonato.getTimes().add(new Time("Vasco", 10, 5, 3, 25, 17));
        do {
            telaInicial();
        } while (true);
    }

    private static void telaInicial() {
        System.out.println("Informe seu nome: ");
        String nome = sc.next();
        Usuario usuario = new Usuario("puta");
        usuario.setNome(nome);
        if (usuario.getNome().equals("luka")) {
            devZone();
        } else {
            usuario = usuario.buscarUsuario();


            if (usuario != null) {
                System.out.println("Seja bem vindo");
                menu(usuario);
            } else {
                System.out.println("Nome desconhecido.");
            }
        }


    }

    private static void devZone() {
    }

    private static void menu(Usuario usuario) {
        System.out.println(usuario.menu());
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1 -> campeonato.verEstatisticas();
        }
    }

}
