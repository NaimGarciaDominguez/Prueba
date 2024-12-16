public class ListaTareas {
    //FUNCIONES HECHAS POR ALBA
    static String[] tareas = new String[100];
    static int listaTareas = 0;
    static Boolean[] estadoTarea = new Boolean[100];
    static String estado;

    /**
     * Añade las tareas nuevas que tengas. Deben de entrar con el estado de la Tarea
     * como pendiente y añadirla a la lista de tareas.
     *
     */
    public static void nuevaTarea(String[] tareas) {
        System.out.println("Introduce la nueva tarea: ");
        String nuevaTarea = ConsoleReader.readString();

        tareas[listaTareas] = nuevaTarea;
        estadoTarea[listaTareas] = true;
        listaTareas++;
        System.out.println("Se ha añadido la tarea correctamente");
    }

    /**
     * Almacena las tareas que se deben realizar, implementando su estado actual.
     *
     */
    public static void listaTareas(String[] tareas, Boolean[] estadoTarea) {
        System.out.println("Listado de tareas");
        if (listaTareas == 0 ) {
            System.out.println("No hay ninguna tarea");
        }
        for (int i=0; i < listaTareas; i++){
            if (estadoTarea[i]) {
                estado = "Pendiente";
            }else {
                estado = "Completado";
            }
            System.out.println(" - " + tareas[i] + " | " + estado);
        }
    }

    /**
     * Debe cambiar la tarea que se decida de pendiente a completada.
     *
     */
    public static void tareaCompletada(String[] tareas, Boolean[] estadoTarea) {
        System.out.println("Que tarea quieres completas (escribe su posición)?");
        int completar = ConsoleReader.readInt();
        if (estadoTarea[completar] != null) {
            if (estadoTarea[completar]) {
                estadoTarea[completar] = false; // Cambia a "completado"
                System.out.println("La tarea '" + tareas[completar] + "' ha sido completada.");

            } else {
                System.out.println("La tarea '" + tareas[completar] + "' ya está completada.");
            }
        }else {
            System.out.println("No existe esa tarea");
        }

    }

    public static void main(String[] args) {
//  MAIN HECHO POR NAIM

        int opcion;

        do {

            System.out.println("--- Menú Principal ---");
            System.out.println("1. Añadir tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Terminar");
            opcion = ConsoleReader.readInt();

            switch (opcion) {
                case 1:
                    nuevaTarea(tareas);
                    break;
                case 2:
                    listaTareas(tareas, estadoTarea);
                    break;
                case 3:
                    tareaCompletada(tareas, estadoTarea);
                    break;
                case 4:
                    System.out.println("Terminando...");
                    break;
            }

        }while (opcion != 4);
    }
}
