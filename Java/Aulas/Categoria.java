public class Categoria {
    public static void main(String[] args) {
        double preco = 150.0;
        String[] categorias = {"Economico", "Intermediario", "Premium"};
        if (preco < 100.0) {
            System.out.println("Categoria: " + categorias[0]);
        } else if (preco >= 100.0 && preco < 200.0) {
            System.out.println("Categoria: " + categorias[1]);
        } else {
            System.out.println("Categoria: " + categorias[2]);
        }
    }
}
