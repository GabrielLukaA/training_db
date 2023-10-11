
import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int idade;
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public Usuario buscarUsuario() {
        for (Usuario usuario: usuarios){
            System.out.println("Im here bitch");
            if (usuario.nome.equals(this.nome)){
                return usuario;
            }
        }
        return null;
    }

    public String menu() {
        return """
                0 - Logout
                1 - Ver o campeonato
                2 - Buscar Jogador
                3 - Buscar time
                4 - Ver Estádio
                5 - Adicionar Comentário
                """;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

}
