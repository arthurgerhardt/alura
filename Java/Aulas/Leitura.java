import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu filme favorito: ");
        String nome = scanner.nextLine();
        System.out.println("O filme favorito é: " + nome);
        scanner.close();
    }
}
