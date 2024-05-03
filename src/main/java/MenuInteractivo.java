import java.util.*;

public class MenuInteractivo {
    // Mapeo de opciones a métodos correspondientes
    private static final Map<String, Runnable> OPCIONES = new LinkedHashMap<>();

    static {
        OPCIONES.put("ejemplo", MenuInteractivo::mostrar); // El primer dato es lo que se muestra
        // en la pantalla, el segundo es el llamado al método
    }
    public static void mostrar(){
        System.out.println("ejemplo ejemplo");
    }
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("------ Menú ------");
            int i = 1;
            for (String opcion : OPCIONES.keySet()) {
                System.out.println(i + ". " + opcion);
                i++;
            }
            System.out.println(i + ". Salir");
            System.out.println("Seleccione una opción: ");

            int opcionSeleccionada = scanner.nextInt();
            scanner.nextLine();

            if (opcionSeleccionada >= 1 && opcionSeleccionada <= OPCIONES.size()) {
                List<Runnable> listaOpciones = new ArrayList<>(OPCIONES.values());
                if (opcionSeleccionada == OPCIONES.size() + 1) {
                    salir = true;
                } else {
                    Runnable opcion = listaOpciones.get(opcionSeleccionada - 1);
                    opcion.run();
                }
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

        System.out.println("¡Gracias por usar el menú interactivo!");
        scanner.close();
    }
}
