import java.util.Scanner;

public class RemovendoEspacos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        String nomeFormatado = nome.trim();
        System.out.println("Nome sem espaços: " + nomeFormatado);
        scanner.close();
    }
}
