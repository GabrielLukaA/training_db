public class Pessoa implements IMovimento, IEmitirSom {
    @Override
    public void mover() {
        System.out.println("Pessoa se movendo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("A HABLAR");
    }
}
