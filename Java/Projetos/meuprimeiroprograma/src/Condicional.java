public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento recente, vale a pena assistir!");
        } else {
            System.out.println("Filme mais antigo, mas pode ser interessante.");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado.");
        } else {
            System.out.println("Deve pagar a locação.");
        }
        if (notaDoFilme >= 7) {
            System.out.println("Filme com boa avaliação.");
        } else if (notaDoFilme >= 4) {
            System.out.println("Filme com avaliação mediana.");
        } else {
            System.out.println("Filme com baixa avaliação.");
        }
    }
}
