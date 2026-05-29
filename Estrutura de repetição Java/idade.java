import java.util.Scanner;

public class idade {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int idade;
        do {
            System.out.print("Digite uma idade: ");
            idade = ler.nextInt();
            if (idade < 0 || idade > 130) {
                System.out.println("Número inválido! Tente novamente.");
            }
        } while (idade < 0 || idade > 130);
        System.out.println("Idade válida: " + idade);
    }

}