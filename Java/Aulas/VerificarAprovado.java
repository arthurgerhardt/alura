public class VerificarAprovado {
    public static void main(String[] args) {
        double nota = 7.0;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota <= 5 && nota < 6.9) {
            System.out.println("Recuperação");
        } else
        {
            System.out.println("Reprovado");
        }
    }
}
