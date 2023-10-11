import java.util.ArrayList;

public class Campeonato implements IEstatisticas {

    private ArrayList<Time> times = new ArrayList<>();
    private ArrayList<Time> timesCampeoes;

    @Override
    public String verEstatisticas() {
        String stats = "Campeonato Brasileiro";

        for (Time time : times) {
            int pontos = time.getVitorias() * 3 + time.getEmpates();
            stats += "\n" + time.getNome() + ": Jogos - " + (time.getEmpates() + time.getVitorias() + time.getDerrotas()) +
                    "   Pontos - " + pontos + "   Gols pró - " + time.getGolsMarcados() + "   Gols contra - " + time.getGolsSofridos() +
                    "   Saldo geral - " + (time.getGolsMarcados() - time.getGolsSofridos());
        }
        return stats;
    }

    public ArrayList<Time> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Time> times) {
        this.times = times;
    }
}
