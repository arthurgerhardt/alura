public class Desafio {
    public static void main(String[] args) {
        String nome = "Arthur";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;
        int option = 0;
        
        System.out.println("**************************************");
        System.out.printf("\nNome do cliente: %s", nome);
        System.out.printf("\nTipo da conta: %s", tipoConta);
        System.out.printf("\nSaldo da conta: R$ %.2f", saldo);
        System.out.println("\n*************************************");

        while (option != 4) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");

            java.util.Scanner scanner = new java.util.Scanner(System.in);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: R$ ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", deposito);
                    } else {
                        System.out.println("Valor de depósito inválido.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", saque);
                    } else {
                        System.out.println("Valor de saque inválido ou saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
