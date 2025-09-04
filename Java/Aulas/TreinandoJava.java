public class TreinandoJava {
    public static void main(String[] args) {
        double nota1 = 8.5;
        double nota2 = 7.3;
        double media = (nota1 + nota2) / 2;
        System.out.println("A média das notas é: " + media);

        double altura = 1.75; // em metros
        int alturaInt = (int) (altura * 100); // convertendo para centímetros
        System.out.println("A altura em centímetros é: " + alturaInt + " cm");
        double peso = 70; // em kg
        double imc = peso / (altura * altura);
        System.out.println("O IMC é: " + imc);

        char letra = 'A';
        String palavra = "Alura";
        System.out.println("Letra: " + letra + ", Palavra: " + palavra);

        double precoProduto = 49.99;
        int quantidade = 3;
        double total = precoProduto * quantidade;
        System.out.println("O total da compra é: R$ " + total);

        double valorEmDolares = 100;
        double cotacaoDolar = 5.25;
        double valorEmReais = valorEmDolares * cotacaoDolar;
        System.out.println("O valor em reais é: R$ " + valorEmReais);

        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);
    }
}
