import java.util.Scanner;

public class CalcularFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
        scanner.close();
    }

}
