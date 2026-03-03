import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Time {
    private LocalDate fecha;


    public Time() {
       this.fecha = LocalDate.now();
    }

    public String longFecha() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern(
                        "EEEE d 'de' MMMM 'de' yyyy",
                        new Locale("es", "ES"));
        return fecha.format(formatter);
    }
    public String shortFecha() {
        DateTimeFormatter formatoCorto =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatoCorto);
    }

}