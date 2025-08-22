public class ConversaoValor {
    public static void main(String[] args) {
        double valorEmReal = 4498.00;
        double valorEmDolar = valorEmReal / 5.25;
        System.out.println("Valor em Dólar: $" + String.format("%.2f", valorEmDolar));
    }
}
