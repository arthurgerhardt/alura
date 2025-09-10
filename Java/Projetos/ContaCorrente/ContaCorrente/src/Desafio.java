import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Arthur";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*********************************************");
        System.out.println("Olá " + nome + ", seja bem-vindo ao seu banco!");
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldo);
        System.out.println("**********************************************");
        System.out.println("\n");


String menu = """
            Digite a opção desejada:
            1 - Consultar saldo
            2 - Transferir dinheiro
            3 - Receber dinheiro
            4 - Sair""";

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
        leitura.close();
    }
}