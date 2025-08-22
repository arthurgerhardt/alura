import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int password = 123456;

        System.out.print("Digite a senha: ");

        System.out.println(input.nextInt() == password ? "Acesso permitido!" : "Acesso Negado!");
        input.close();
    }
}
