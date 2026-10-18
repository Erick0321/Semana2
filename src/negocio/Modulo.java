package negocio;

public class Modulo {
    public String nombre;
    public String lenguaje;
    String version;
    boolean terminado;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
        System.out.println("Version: " + version);
        System.out.println("Terminado: " + terminado);
    }

    public void marcarTerminado() {
        terminado = true;
    }

    void mostrarEstado() {
        System.out.println("Terminado: " + terminado);
    }

    void mostrarVersion() {
        System.out.println("Version: " + version);
    }
}
