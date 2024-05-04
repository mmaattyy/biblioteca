import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
    private int ID_Sala;
    private int capacidad;
    private boolean disponible;

    public SalaEstudio(int numero, int capacidad, boolean disponible) {
        this.ID_Sala = numero;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }
    public int getNumero() {
        return ID_Sala;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void PrestarSala() {
        Scanner Scanner = new Scanner(System.in);
        if (disponible) {
            System.out.println("Ingrese el numero de usuarios que ocuparan la sala");
            int NumUsuario = Scanner.nextInt();
            if (NumUsuario <= capacidad) {
                disponible = false;
            } else {
                System.out.println("Capacidad de la sala Superada");
            }
        } else {
            System.out.println("Sala no disponible");
        }
        System.out.println("Sala Prestada correctamente");
    }
    public void ModificiarCapacidad(){
        System.out.println("Ingrese la nueva capacidad");
        Scanner Scanner = new Scanner(System.in);
        int newcapacidad = Scanner.nextInt();
        capacidad = newcapacidad;
    }
}
