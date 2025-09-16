import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringsJava {
    public static void main(String[] args) {
        String texto = "Meu e-mail é jaqueline@alura.com.br";
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find()) {
            System.out.println("E-mail encontrado: " + matcher.group());
        } else {
            System.out.println("E-mail não encontrado.");
        }
        System.out.println(formatarTelefone("2199887744"));
    }
   public static String formatarTelefone(String telefone) {
        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if (matcher.matches()) {
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return "Número de telefone inválido!";
    }
}
