

import java.util.InputMismatchException;
import java.util.Scanner;

public class Interfaz {
    Scanner lectura = new Scanner(System.in);
    int opcion;


    public void menu() {
        System.out.println("""
                ************************************************
                Sea bienvenido/a   al  Conversor  de  Moneda  =)
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción válida:
                *********************************************
                                
                """);
    }


    public Comparador<String, String> opcionInput() {

        String monedaInicial = "";
        String monedaFinal = "";

        boolean salir = true;
        try {
            while (salir) {
                opcion = lectura.nextInt();
                switch (opcion) {
                    case 1:
                        monedaInicial = "USD";
                        monedaFinal = "ARS";
                        return new Comparador<>(monedaInicial, monedaFinal);
                    case 2:
                        monedaInicial = "ARS";
                        monedaFinal = "USD";
                        return new Comparador<>(monedaInicial, monedaFinal);

                    case 3:
                        monedaInicial = "USD";
                        monedaFinal = "BRL";
                        return new Comparador<>(monedaInicial, monedaFinal);

                    case 4:
                        monedaInicial = "BRL";
                        monedaFinal = "USD";
                        return new Comparador<>(monedaInicial, monedaFinal);
                    case 5:
                        monedaInicial = "USD";
                        monedaFinal = "COP";
                        return new Comparador<>(monedaInicial, monedaFinal);
                    case 6:
                        monedaInicial = "COP";
                        monedaFinal = "USD";
                        return new Comparador<>(monedaInicial, monedaFinal);
                    case 7:
                        monedaInicial = "salir";
                        monedaFinal = "salir";
                        return new Comparador<>(monedaInicial, monedaFinal);
                    default:
                        System.out.println("Error ingrese una opción valida");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(" Error de tipo " + e.getMessage() + "ingrese solo" + "opciones validas ");
            lectura.next();

        }
        return new Comparador<>(monedaInicial, monedaFinal);
    }
}
