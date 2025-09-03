public class ConversaoTemperatura1 {
    public static void main(String[] args) {
        double temperaturaCelsius = 25.0;
        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;

        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius + "°C");
        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit + "°F");

        int temperaturaFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit (inteira) é: " + temperaturaFahrenheitInteira + "°F");
    }

}
