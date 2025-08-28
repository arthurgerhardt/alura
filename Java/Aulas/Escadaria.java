import java.util.Scanner;
public class Escadaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de degraus: ");
        int degraus = scanner.nextInt();
        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");      
        scanner.close();
    }
}
