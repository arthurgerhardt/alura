public class Principal {
     public static void main(String[] args) {
        String nome = "João";
        double salario = 2890.0;
        int numeroDependentes = 2;
        boolean isento = true;

        if (salario > 2259.20 && !isento) {
            double irrf = salario * (7.5 / 100);
            System.out.println("Valor do IRRF: " + irrf);
        } else if (isento) {
            System.out.println("O contribuinte " + nome + " é isento de IRRF.");
        }
        else {
            System.out.println("Não há imposto a pagar para o contribuinte " + nome + ".");
        }
    }
}
