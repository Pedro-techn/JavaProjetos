import java.util.Scanner;

public class piramide {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int n = ler.nextInt();
        for (int linha = 1; linha <= n; linha++) {
            // Espaços
            for (int espaco = 1; espaco <= n - linha; espaco++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int estrela = 1; estrela <= (2 * linha - 1); estrela++) {
                System.out.print("*");
            }
            // Quebra de linha
            System.out.println();
        }
    }
}