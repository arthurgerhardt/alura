import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.Period;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDateTime dataCompra = LocalDateTime.now();
        LocalDateTime dataPrimeiraParcela = LocalDateTime.of(2025, 5, 15, 0, 0);
        LocalDateTime dataSegundaParcela = dataPrimeiraParcela.plusMonths(1);
        System.out.println("Data da compra: " + dataCompra);

        if(dataPrimeiraParcela.isEqual(LocalDateTime.now())) {
            System.out.println("A primeira parcela vence hoje!");
        } else {
            System.out.println("A primeira parcela não vence hoje.");
        }
        System.out.println("Data da primeira parcela: " + dataPrimeiraParcela);
        System.out.println("Data da segunda parcela: " + dataSegundaParcela);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = dataCompra.format(formato);
        System.out.println("Data da compra formatada: " + dataFormatada);

        ZonedDateTime dataConclusaoCompra  = ZonedDateTime.now();
        System.out.println("Data e hora com fuso horário: " + dataConclusaoCompra);
        ZonedDateTime dataEmNY = dataConclusaoCompra.withZoneSameInstant(java.time.ZoneId.of("America/New_York"));
        System.out.println("Data e hora em Nova York: " + dataEmNY);

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração entre início e fim: " + duracao.toHours() + " horas e " + duracao.toMinutesPart() + " minutos."); 

        LocalDateTime dataPagamento = LocalDateTime.parse("2025-06-15T00:00:00");
        Period periodo = Period.between(dataCompra.toLocalDate(), dataPagamento.toLocalDate());
        System.out.println("Período entre a primeira parcela e o pagamento: " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
        System.out.println("Data de pagamento: " + dataPagamento);

    }
}
