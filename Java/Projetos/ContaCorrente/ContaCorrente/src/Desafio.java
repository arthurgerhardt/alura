import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Arthur";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        
        System.out.println("**************************************");
        System.out.printf("\nNome do cliente: %s", nome);
        System.out.printf("\nTipo da conta: %s", tipoConta);
        System.out.printf("\nSaldo da conta: R$ %.2f", saldo);
        System.out.println("\n*************************************");


        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);
        

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo é de R$ %.2f\n", saldo);
                    break;
                case 2:
                    System.out.println("Qual valor deseja transferir?");
                    double valorTransferencia = leitura.nextDouble();
                    if (valorTransferencia > saldo) {
                        System.out.println("Saldo insuficiente para a transferência.");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.printf("Transferência de R$ %.2f realizada com sucesso.\n", valorTransferencia);
                    }
                    break;
                case 3:
                    System.out.println("Qual valor deseja receber?");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("Valor de R$ %.2f recebido com sucesso.\n", valorRecebido);
                    break;
                case 4:
                    System.out.println("Saindo... Obrigado por usar nosso sistema.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println("*************************************");
        }
        leitura.close();
    }
}
