import java.util.Scanner;
public class tabuada {
    public static void main(String[] args) {
        Scanner ezz = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = ezz.nextInt();
        for (int x = 1; x <= 10; x++) {
            System.out.println(numero + " x " + x + " = " + (numero * x));
        }

    }

}