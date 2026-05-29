import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int quantidade = ler.nextInt();

        int primeiro = 0;
        int segundo = 1;
        int contador = 1;

          while (contador <= quantidade) {

            System.out.println("Termo " + contador + ": " + primeiro);

            int proximo = primeiro + segundo;

            primeiro = segundo;
            segundo = proximo;

            contador++;
        }

    }


    }

