import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private List<Libro> catalogo;
    private List<Usuario> usuarios;
    private Map<Usuario, List<Libro>> prestamos;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        catalogo.remove(libro);
    }

    public void actualizarLibro(Libro libro) {
        // falta relleno
        System.out.println("falta lógica");
    }

    public void actualizarUsuario(Usuario usuario) {
        // falta relleno
        System.out.println("falta lógica");
    }


    // Gestión de usuarios
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
        prestamos.remove(usuario);
    }


    public void realizarPrestamo(Usuario usuario, Libro libro) {
        if (prestamos.containsKey(usuario)) {
            List<Libro> prestamosUsuario = prestamos.get(usuario);
            prestamosUsuario.add(libro);
            prestamos.put(usuario, prestamosUsuario);
        } else {
            List<Libro> prestamosUsuario = new ArrayList<>();
            prestamosUsuario.add(libro);
            prestamos.put(usuario, prestamosUsuario);
        }
        libro.prestamoRealizado();
    }

    public void realizarDevolucion(Usuario usuario, Libro libro) {
        if (prestamos.containsKey(usuario)) {
            List<Libro> prestamosUsuario = prestamos.get(usuario);
            prestamosUsuario.remove(libro);
            prestamos.put(usuario, prestamosUsuario);
            libro.devolucionRealizada();
        }
    }
}
