public class App {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Top Gun: Maverick");
        
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
        double notaDoFilme = 8.1;
        System.out.println("Nota do filme: " + notaDoFilme);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse = """
                Filme Top Gun: Maverick
                Após mais de trinta anos de serviço como um dos melhores aviadores da Marinha,
                Pete "Maverick" Mitchell está onde sempre quis estar, desafiando os limites como um piloto de testes.
                Mediano
                Duração: 130 minutos
                Ano de lançamento: 
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao + " estrelas");
        
        
        
    }
}
