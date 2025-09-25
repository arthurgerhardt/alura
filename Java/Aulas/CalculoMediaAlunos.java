import java.util.Scanner;

public class CalculoMediaAlunos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite a nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a nota 2: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a nota 3: ");
            double nota3 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("A média dos alunos é: " + media);
        }
    }
    
}
