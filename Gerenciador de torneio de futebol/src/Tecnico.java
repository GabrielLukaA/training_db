import java.util.ArrayList;

public class Tecnico extends Usuario{
    ArrayList<String> titulos = new ArrayList<>();
    ArrayList<Time> timesPassados;

    public Tecnico(String nome) {
        super(nome);
    }
}
