public class Carro extends Automovel {
    @Override
    public void mover() {
        System.out.println("Carro se movendo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("VRUMMMMMMMMMMMMMM PA");
    }
}
