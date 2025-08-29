public class SomaValores {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma dos valores é: " + soma);
    }
}
