public class ExemploRepeticao {
    public static void main(String[] args) {
        String[] vendedores = {"Carlos", "Mariana", "João", "Fernanda"};
        double[] vendas = {4000.0, 8000.0, 12000.0, 5000.0};
    }

    public static double calcularComissao(double totalVendas) {
        if (totalVendas <= 10000.0) {
            return totalVendas * 0.03;
        }
        // You may want to handle cases where totalVendas > 10000.0
        return totalVendas * 0.05;
    }
}
