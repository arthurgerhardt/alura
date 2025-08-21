public class VariaveisEscopo {
    public static void main(String[] args) {
        int idade = 15; // Variável de escopo de método

        if (idade > 18) {
            String status = " Adulto."; // Variável de escopo de bloco
            System.out.println(" Você é maior de idade." + status);
        }
        else {
            String status = " Você é menor."; // Variável de escopo de bloco
            System.out.println(" Você é menor de idade." + status);
        }

        // System.out.println("Status fora do bloco: " + status); // Erro: status não pode ser resolvido
    }
    // Variável de escopo de classe
}
