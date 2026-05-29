import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidadeAlunos;
        System.out.print("Número de alunos: ");
        quantidadeAlunos = ler.nextInt();
        double nota;
        double soma = 0;
        double maiorNota = 0;
        double menorNota = 10;
        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Nota do aluno " + i + ": ");
            nota = ler.nextDouble();
            soma = soma + nota;
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
        }
        double media = soma / quantidadeAlunos;
        System.out.println("\nMédia da turma: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
    }

}