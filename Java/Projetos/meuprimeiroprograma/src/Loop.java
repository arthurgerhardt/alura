import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota =0;
        double media =0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual avaliação você dá ao filme? ");
            nota = scanner.nextDouble();
            media += nota;
        }
        System.out.println("A média das notas de avaliação é: " + (media/3));
        
        scanner.close();
    }
}
