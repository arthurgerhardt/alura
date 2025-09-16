public class TiposDados {
    public static void main(String[] args) {
        String professor = "Jaqueline Oliveira";

        String disciplina = "Java e Programação Orientada a Objetos";

        String curriculo = """
                "Pós graduada em Engenharia e 
                Arquitetura de Software; 
                Desenvolvedora Java desde 2010;
                Instrutora na Alura desde 2019."
                """;
        
        String texto = String.format("Disciplina %s - %s", professor, disciplina, curriculo);
        System.out.println(texto);

        System.out.println("Nome %s %n Disciplina %s".formatted(professor, disciplina));
        System.out.println(curriculo);
    }
}
