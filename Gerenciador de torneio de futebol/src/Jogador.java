import java.util.ArrayList;

public class Jogador extends Usuario {

    private int gols;
    private int jogos;
    private int desarmes;
    private int assistencias;
    private int defesas;
    ArrayList<String> titulos = new ArrayList<>();
    ArrayList<Time> timesPassados;

    public Jogador(String nome) {
        super(nome);
    }
}
