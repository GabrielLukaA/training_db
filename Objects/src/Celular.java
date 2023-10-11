import java.util.Objects;

public class Celular implements Comparable<Celular> {
    private String nome;
    private Integer id;
    private int armazenamento;

    static int contador = 1;

    public Celular(String nome, int armazenamento) {
        this.nome = nome;
        this.id = contador++;
        this.armazenamento = armazenamento;
    }

    public Celular(String nome, int armazenamento, int id) {
        this.nome = nome;
        this.id = id;
        this.armazenamento = armazenamento;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Celular - " +
                "nome: " + nome + "  -  " +
                "id: " + id + "  -  " +
                "armazenamento: " + armazenamento + "\n\n";
    }

    @Override
    public boolean equals(Object o) {
        return this.id.equals(((Celular) o).getId());

    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id, armazenamento);
    }

    @Override
    public int compareTo(Celular o) {
        return this.getId().compareTo(o.getId());
    }
}
