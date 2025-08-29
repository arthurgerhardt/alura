import java.util.Scanner;

public class NomeValido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        do {
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
            if (nome.length() < 3) {
                System.out.println("Nome inválido. Digite novamente.");
            }
        } while (nome.length() < 3);
        System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
        scanner.close();
    }
}
