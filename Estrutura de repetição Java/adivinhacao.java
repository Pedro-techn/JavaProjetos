import java.util.Scanner;

public class adivinhacao {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int secreto = 42;
        int tentativa;
        int contador = 1;

        System.out.println("Tente adivinhar o número (1 a 100).");
        System.out.println("Você tem 7 tentativas.");

        do {

            System.out.print("Tentativa " + contador + ": ");
            tentativa = ler.nextInt();

            if (tentativa > secreto) {

                System.out.println("Muito alto! Tente um número menor.");

            } else if (tentativa < secreto) {

                System.out.println("Muito baixo! Tente um número maior.");

            } else {

                System.out.println("Parabéns! Você acertou em " + contador + " tentativas!");
                break;

            }

            contador++;

        } while (contador <= 7);

        if (tentativa != secreto) {

            System.out.println("Suas tentativas acabaram!");
            System.out.println("O número era " + secreto + ".");

        }

    }

}