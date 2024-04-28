import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Monedas {
    Scanner scanner;
    LocalDate fechaActual = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String fechaFormateada = fechaActual.format(formato);

    public Monedas() {
        this.scanner = new Scanner(System.in);
    }

    public void conversorMoneda(Double monedaDestino, Double monedaOrigen,
                                String monedaInicial, String monedaFinal) {
        try {
            System.out.println("Ingrese el monto a cambiar: ");
            Double cantidadACambiar = scanner.nextDouble();
            Double cambio = monedaDestino * cantidadACambiar;
            System.out.println(String.format("- Su cambio es: %.2f %s  \n"
                            + "- la taza para el dia %S fue  de " +
                            " %.0f %s  = %f %s", cambio,
                    monedaFinal, fechaFormateada, monedaOrigen, monedaInicial,
                    monedaDestino, monedaFinal));
        } catch (InputMismatchException e) {
            System.out.println("Error ingrese el monto en números por favor");
            scanner.close();
        }
    }
}

