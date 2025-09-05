import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu filme favorito: ");
        String nome = scanner.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int ano = scanner.nextInt();
        System.out.println("O filme favorito é: " + nome + " e foi lançado em " + ano);
        System.out.println("Qual avaliação você dá ao filme? ");
        double nota = scanner.nextDouble();
        System.out.println("Você avaliou o filme com nota: " + nota);
        scanner.close();
    }
}
