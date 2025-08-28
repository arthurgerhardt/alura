import java.util.Scanner;

public class ExemploRepeticao {
    public static void main(String[] args) {
        String[] vendedores = {"Carlos", "Mariana", "João", "Fernanda"};
        double[] vendas = {4000.0, 8000.0, 12000.0, 5000.0};

        for (int i = 0; i < vendedores.length; i++) {
            System.out.printf("%s - comissão %.2f\n", vendedores[i], calcularComissao(vendas[i]));
        }

        System.out.println("Teste com o while");
        int j = 0;
        boolean imprimeOutro = true;
        Scanner leitura = new Scanner(System.in);

        do {
            System.out.printf("%s - comissão %.2f\n", vendedores[j], calcularComissao(vendas[j]));
            j++;
            System.out.println("Imprimir outro? (true/false)");
            imprimeOutro = leitura.nextBoolean();
        } while(imprimeOutro);

        leitura.close();
    }

    public static double calcularComissao(double totalVendas) {
        if (totalVendas <= 5000.0) {
            return totalVendas * 0.03;
        } else if (totalVendas <= 10000.0) {
            return totalVendas * 0.05;
        }
        else {
            return totalVendas * 0.07;
        }
    }
}
