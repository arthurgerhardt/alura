public class Principal2 {
    public static void main(String[] args) {
        String nome = "João";
        double salario = 2890.0;
        int numeroDependentes = 2;

        if (salario > 2259.20) {
            double irrf = salario * (7.5 / 100);
            System.out.println(nome + "Você tem o valor do IRRF: " + irrf);
        }
        else {
            System.out.println("Isento de IRRF");
        } 
        if (numeroDependentes > 0) {
            double descontoPorDependente = numeroDependentes * 189.59;
            System.out.println("Desconto por dependentes: " + descontoPorDependente);
        } else {
            System.out.println("Sem dependentes");
        }
    }
}
