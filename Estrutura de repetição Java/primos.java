import java.util.Scanner;
public class primos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int inicio;
        int fim;
        int totalPrimos = 0;
        System.out.print("Digite o início do intervalo: ");
        inicio = ler.nextInt();
        System.out.print("Digite o fim do intervalo: ");
        fim = ler.nextInt();
        System.out.println("\nPrimos entre " + inicio + " e " + fim + ":");
        for (int numero = inicio; numero <= fim; numero++) {
            boolean primo = true;
            if (numero < 2) {
                primo = false;
            }
            for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
                if (numero % divisor == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.print(numero + " ");
                totalPrimos++;
            }
        }
        System.out.println("\n\nTotal de primos encontrados: " + totalPrimos);
    }
}
    

