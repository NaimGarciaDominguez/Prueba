public class CambioEuros {

    /**
     * Metodo para pedir la moneda que desea convertir.
     *
     * @param moneda Array de monedas de tipo string.
     */

    public static void definirMonedas(String[] moneda){

    }

    /**
     * Metodo para definir el cambio de una moneda al euro.
     * asigna una tasa de cambio a cada moneda.
     *
     * @param moneda Array de monedas de tipo string.
     * @param tasaCambio Array que las tasas de cambio de tipo double.
     */

    public static void definirCambio(String[] moneda, Double[] tasaCambio){

    }

    /**
     * Metodo para hacer la conversión de euros a una moneda.
     *
     * @param moneda Array de monedas de tipo string
     * @param tasaCambio Array que las tasas de cambio de tipo double.
     */


    public static void calcularConversion(String[] moneda, Double[] tasaCambio){

    }

    //el main
    public static void main (String[] args){

        //array para definir las monedas
        String[] moneda = new String[10];

        //array para definir el cambio de la moneda
        Double[] tasaCambio = new Double[10];


        int opcion;
        do {
            System.out.println("--- Menú Principal ---");
            System.out.println("1. Definir monedas");
            System.out.println("2. Define el cambio");
            System.out.println("3. Calcular conversion");
            System.out.println("4. Salir");
            opcion = ConsoleReader.readInt();

            switch (opcion) {
                case 1:
                    definirMonedas(moneda);
                    break;
                case 2:
                    definirCambio(moneda, tasaCambio);
                    break;
                case 3:
                    calcularConversion(moneda, tasaCambio);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }while(opcion != 4);
    }
}
