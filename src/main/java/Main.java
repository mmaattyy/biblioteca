import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El señor de los anillos", "J.R.R. Tolkien", "Fantasía", 3);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico", 5);
        Libro libro3 = new Libro("1984", "George Orwell", "Ciencia ficción", 2);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        Usuario usuario1 = new Usuario("Juan", "Estudiante");
        Usuario usuario2 = new Usuario("María", "Profesor");

        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        Administrador administrador = new Administrador(biblioteca);

        administrador.realizarPrestamo(usuario1, libro1);
        administrador.realizarPrestamo(usuario2, libro2);
        administrador.realizarPrestamo(usuario1, libro3);
        administrador.realizarDevolucion(usuario1, libro1);

        administrador.eliminarUsuario(usuario2);

        System.out.println("Información de los libros en el catálogo:");
        for (Libro libro : biblioteca.getCatalogo()) {
            System.out.println(libro);
        }

        System.out.println("\nInformación de los usuarios registrados:");
        for (Usuario usuario : biblioteca.getUsuarios()) {
            System.out.println(usuario);
        }

        System.out.println("\nPréstamos registrados:");
        for (Map.Entry<Usuario, List<Libro>> entry : biblioteca.getPrestamos().entrySet()) {
            Usuario usuario = entry.getKey();
            List<Libro> librosPrestados = entry.getValue();
            System.out.println("Usuario: " + usuario.getNombre());
            System.out.println("Libros prestados:");
            for (Libro libro : librosPrestados) {
                System.out.println("- " + libro.getTitulo());
            }
        }
    }
}
