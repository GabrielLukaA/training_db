import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Cachorro cachorro = new Cachorro();
        Carro carro = new Carro();
        Terra terra = new Terra();
        Mesa mesa = new Mesa();

        Animal animal = cachorro;
        Automovel automovel = carro;
        IMovimento movimento = cachorro;

        Object object = terra;

        ArrayList<IMovimento> objetosComMovimento = new ArrayList<>();
        for (IMovimento iMovimento : objetosComMovimento) {
            iMovimento.mover();
        }

    }
}
