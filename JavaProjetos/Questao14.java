import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo lado: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double c = scanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Os valores formam um triângulo.");
            if (a == b && b == c) {
            
                System.out.println("Tipo: Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tipo: Isósceles");
            } else {
                System.out.println("Tipo: Escaleno");
            }

        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }

        scanner.close();
    }
}