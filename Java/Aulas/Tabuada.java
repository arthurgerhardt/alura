import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();


        for (int contador = 1; contador <= 10; contador++) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
        }
        scanner.close();
    }
}
