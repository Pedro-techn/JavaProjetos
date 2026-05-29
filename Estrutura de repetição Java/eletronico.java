  import java.util.Scanner;

public class eletronico {
    public static void main(String[] args) {
        Scanner preguiça = new Scanner(System.in);
        int numero = 1;
        int soma = 0;
        while (numero != 0) {
            System.out.print("Digite um número: ");
              numero = preguiça.nextInt();
            soma = soma + numero;
        }
        System.out.println("Soma total: " + soma);

    }

}
