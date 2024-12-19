public class ListaTareas_Lucia_Naim {

    //Mian hecho por Naim y completado por Lucia

    /**
     * Añade las tareas nuevas que tengas. Deben de entrar con el estado de la Tarea
     * como pendiente y añadirla a la lista de tareas.
     *
     */
    public static void nuevaTarea(String[] tareas) {
        //implementar

        System.out.println("Escribe la tarea: ");

        String tarea = ConsoleReader.readString();

        tareas[10] = tarea;

    }

    /**
     * Almacena las tareas que se deben realizar, implementando su estado actual.
     *
     */
    public static void listaTareas(String[] tareas, Boolean[] estadoTarea,String[] estado) {
        //implementar
        System.out.println("--- Listado de Tareas ---");
        if (tareas.length == 0) {

            System.out.println("No hay ninguna tarea.");
            return;
        }

        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i] != null) { // Verificar si hay una tarea en el índice
                if (estadoTarea[i] == null) {
                    estado[i] = "Pendiente";
                } else {
                    estado[i] = estadoTarea[i] ? "Completada" : "Pendiente";
                }
                System.out.println(tareas[i] + ": " + estado[i]);
            }
        }


    }

    /**
     * Debe cambiar la tarea que se decida de pendiente a completada.
     *
     */
    public static void tareaCompletada(String[] tareas, Boolean[] estadoTarea) {
        //implementar
        System.out.print("Introduce el número de la tarea a completar: ");
        String numeroTareaM = ConsoleReader.readString();


        //la entrada
        int numeroTarea;
        try {
            numeroTarea = Integer.parseInt(numeroTareaM);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Debe ser un número.");
            return;
        }

        // Validar el número de tarea
        if (numeroTarea >= 0 && numeroTarea < tareas.length) {
            if (estadoTarea[numeroTarea] != null ) {
                estadoTarea[numeroTarea] = true; // Cambiar el estado a completada
                System.out.println("Tarea completada: " + tareas[numeroTarea]);
            } else {
                System.out.println("La tarea esta completada.");
            }
        } else {
            System.out.println("Número de tarea inválido.");
        }
    }

    public static void main(String[] args) {

        String[] tareas = new String[100];
        Boolean[] estadoTarea = new Boolean[100];
        String[] estado = new String[100];
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
                    listaTareas(tareas, estadoTarea,estado);
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
