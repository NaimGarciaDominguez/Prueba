public class GestionNotas  {//Lucia Argenti Sánchez
    public static void main(String[] args) {


        System.out.println("¿Cuántos estudiantes hay?");
        int numEstudiantes = ConsoleReader.readInt();

        String[] nombres = new String[numEstudiantes];
        double[] notas = new double[numEstudiantes];

        // Leer nombres y notas
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Introduce el nombre del estudiante " + (i + 1) + ":");
            nombres[i] = ConsoleReader.readString();

            System.out.println("Introduce la nota de " + nombres[i] + ":");
            notas[i] = ConsoleReader.readDouble();

        }

        // Calcular y mostrar resultados
        System.out.println("La media del grupo es: " + calcularMedia(notas));
        mostrarResultados(nombres, notas);
        mostrarNotaMaxima(nombres, notas);

    }

    /**
     * Return un double, calculando la media arimetica de un array paralela
     *
     * @param notas Array pararelo de tipo double
     * @return la media ,de procesar el array pararelo
     */



    // Función para calcular la media del grupo
    public static double calcularMedia(double[] notas) {
        double acumulador=0;
        for (int i=0; i<notas.length; i++ )
        {
            acumulador+=notas[i];
        }
        return acumulador/notas.length;
    }

    /**
     * Busca en el array para ver el orden de los datos espuestos
     *
     * @param notas Array pararelo de tipo double
     * @return el nombre con su nota corespondiente
     */

    // Función para mostrar aprobados y suspendidos
    public static void mostrarResultados(String[] nombres, double[] notas) {
        // Implementar


        for (int i=0; i<nombres.length; i++)
        {

            if (notas[i]>=5){
                System.out.println("El alumno" + nombres[i] + "tiene" + notas[i] +" por eso esta aprobado");

            }else {

                System.out.println("El alumno" + nombres[i] + "tiene" + notas[i] +" por eso esta suspendido");

            }



            //Una forma diferente para hacer una especie de if mas rapiada
            String note=(notas[i]>=5)?"aprobado":"suspendido";
            System.out.println("El alumno" + nombres[i] + "tiene" + notas[i] +"y por eso esta" + note);


        }
    }

    // Función para mostrar el estudiante con la nota más alta
    public static void mostrarNotaMaxima(String[] nombres, double[] notas) {
        // Implementar
       double maxima=0;

        for (int i=0; i<notas.length; i++)
        {
            if (notas[i]>maxima){
                maxima=notas[i];
            }
        }

        for (int i=0; i<nombres.length; i++)
        {

            if (notas[i]==maxima){
                System.out.println("La persona con la nota mas alta es " + nombres[i] + " con un " + notas[i]);
            }
        }
    }


}