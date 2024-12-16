import java.lang.reflect.Array;

public class CambioMonedas {

    /**
     * Return ConsoleReader para saber que tipo de moneda tiene
     *
     * @param tip_moneda Array pararelo de tipo String
     * @return La el tipo de moneda que quiere el usuario
     */
    public static void Define_Monedas(String[] tip_moneda) {

    }

    /**
     * Return un string para saber las monedas y valor
     *
     * @param tip_moneda Array pararelo de tipo String
     * @param cantidad Array pararelo de tipo double
     * @return la cantidad y tipo de monedas
     */

    public static void cambio_Monedas(String[] tip_moneda , double[] cantidad) {

    }

    /**
     * Return un double y un string para averiguar el cambio de moneda de la moneda a €
     *
     * @param tip_moneda Array pararelo de tipo String
     * @param cantidad Array pararelo de tipo double
     * @param euros Array pararelo de tipo double
     * @return la convercion de monedas
     */

    public static void Convercion(String[] tip_moneda, double[] euros,double[] cantidad) {

    }


    public static void main(String[] args) {

        //1€ ES -->  Dolares = 0,95    Yenes = 0,0062    Libras=1,21
        String[] tip_moneda =new String[] {"Dolares" ,"Yenes","Libras"};
        double[] cantidad = new double[0];
        double[] euros = new double[0];


        //Calculos
        Define_Monedas(tip_moneda);
        cambio_Monedas(tip_moneda, cantidad);
        Convercion(tip_moneda, euros,cantidad);






    }


}
