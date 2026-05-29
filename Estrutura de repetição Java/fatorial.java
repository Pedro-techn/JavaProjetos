import java.util.Scanner;
public class fatorial {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        long numero = 1;
        long fatorial = 1;
         System.out.print("Digite um número: ");
        numero = ler.nextInt();
        if (numero == 0) {

            System.out.println("0! vale 1 é uma excesão");

        } else {
         for (int i = 1; i <= numero; i++) {

            fatorial = fatorial * i;

        }

        System.out.println("Fatorial = " + fatorial);
    }
}
}