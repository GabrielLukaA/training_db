import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("BEM VINDO!!!");
        } while (menu());


    }

    private static boolean menu() {
        System.out.println("""
                Você quer jogar?
                0 - Sim
                Outro - Não
                """);
        try {
            if (sc.nextInt() == 0) {
                jogar();
                return true;
            }
        } catch (InputMismatchException e) {
            System.out.println("Insira um valor válido");
            sc = new Scanner(System.in);
            return true;
        }

        return false;
    }

    private static void jogar() {
        boolean continuar = false;
        Random sorteia = new Random();
        int inteiro = sorteia.nextInt(100) + 1;
        int numeroChute = 0;

        do {

            System.out.println("""
                    Esse é o quickNumber, então
                    chute um número inteiro de 1 a 100:
                    """);

            try {
                numeroChute = sc.nextInt();
                continuar = verificarResposta(inteiro, numeroChute);
            } catch (InputMismatchException e) {
                System.out.println("Insira um valor válido");
                sc = new Scanner(System.in);
            }
        } while (!continuar);

    }

    private static boolean verificarResposta(int sorteio, int chute) {
        if (sorteio == chute) {
            System.out.println("Parabéns, você acertou!");
            return true;
        } else if (sorteio < chute - 15 || sorteio > chute + 15) {
            System.out.println("Errou feio, errou rude.");
        } else {
            System.out.println("Quase lá!");
        }
        return false;
    }
}

