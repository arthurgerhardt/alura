import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        double media = 0;
        int totalNotas = 0;
        //boolean continuar = true;

        while (nota != -1) {
            System.out.println("Qual avaliação você dá ao filme? (Digite -1 para sair)");
            nota = scanner.nextDouble();
            if (nota != -1) {
                media += nota;
                totalNotas++;
            }
            
        }
        System.out.println("A média das notas de avaliação é: " + (media / totalNotas));

        scanner.close();
    }
}
