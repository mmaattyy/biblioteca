import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private int ejemplaresDisponibles;
    private List<Integer> calificaciones;
    private List<String> comentarios;

    public Libro(String titulo, String autor, String categoria, int ejemplaresDisponibles) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.ejemplaresDisponibles = ejemplaresDisponibles;
        this.calificaciones = new ArrayList<>();
        this.comentarios = new ArrayList<>();
    }

    public void agregarCalificacion(int calificacion) {
        calificaciones.add(calificacion);
    }

    public void agregarComentario(String comentario) {
        comentarios.add(comentario);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getEjemplaresDisponibles() {
        return ejemplaresDisponibles;
    }

    public List<Integer> getCalificaciones() {
        return calificaciones;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setEjemplaresDisponibles(int ejemplaresDisponibles) {
        this.ejemplaresDisponibles = ejemplaresDisponibles;
    }

    public void prestamoRealizado() {
        if (ejemplaresDisponibles > 0) {
            ejemplaresDisponibles--;
        }
    }

    public void devolucionRealizada() {
        ejemplaresDisponibles++;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", ejemplaresDisponibles=" + ejemplaresDisponibles +
                ", calificaciones=" + calificaciones +
                ", comentarios=" + comentarios +
                '}';
    }
}
