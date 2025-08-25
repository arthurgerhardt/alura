public class ComparaNumeros {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 25;

        if (numero1 > numero2) {
            System.out.println("O número " + numero1 + "é maior.");
        } else if (numero2 > numero1) {
            System.out.println("O número " + numero2 + " é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
