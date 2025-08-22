public class Principal2 {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 2890.0;
        int numeroDependentes = 2;

        if (salario > 2259.20) {
            double irrf = salario * (7.5 / 100);
            System.out.println("Valor do IRRF: " + irrf);
        }
        else {
            System.out.println("Isento de IRRF");
        } 
    }
}
