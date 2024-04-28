import com.api.MonedasApi;

public class Principal {
    public static void main(String[] args) {
        MonedasApi moneda = new MonedasApi();
        Interfaz interfaceUsuario = new Interfaz();
        Monedas conversorMoneda = new Monedas();

        try {
            boolean continuar = true;
            while (continuar) {

                interfaceUsuario.menu();


                Comparador<String, String> monedaPar = interfaceUsuario.opcionInput();


                String salida = monedaPar.getFirst();
                if (salida == "salir") {
                    continuar = false;
                } else {

                    String monedaInicial = monedaPar.getFirst();
                    String monedaFinal = monedaPar.getSecond();


                    var monedaDeCambio = moneda.MonedasData(monedaInicial);


                    Double monedaOrigen = monedaDeCambio.conversion_rates().get(monedaInicial);
                    Double monedaDestino = monedaDeCambio.conversion_rates().get(monedaFinal);


                    conversorMoneda.conversorMoneda(monedaDestino, monedaOrigen, monedaInicial, monedaFinal);
                }

            }
        }catch (RuntimeException  e){
            System.out.println("Finalizando la aplicación.");
        }






    }
}


