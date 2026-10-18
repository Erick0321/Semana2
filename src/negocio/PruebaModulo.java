package negocio;

public class PruebaModulo {
    public static void main(String[] args) {

        Modulo modulo1 = new Modulo();
        Modulo modulo2 = new Modulo();
        Modulo modulo3 = new Modulo();

        modulo1.nombre = "Login";
        modulo1.lenguaje = "Java";
        modulo1.version = "1.0";
        modulo1.terminado = false;

        modulo2.nombre = "Inventario";
        modulo2.lenguaje = "Java";
        modulo2.version = "2.0";
        modulo2.terminado = false;

        modulo3.nombre = "Reportes";
        modulo3.lenguaje = "Java";
        modulo3.version = "1.5";
        modulo3.terminado = false;

        System.out.println("MODULO 1");
        modulo1.mostrarInformacion();

        System.out.println("MODULO 2");
        modulo2.mostrarInformacion();

        System.out.println("MODULO 3");
        modulo3.mostrarInformacion();

        System.out.println("MARCAR TERMINADO MODULO 2");
        modulo2.marcarTerminado();

        System.out.println("ESTADOS");
        modulo1.mostrarEstado();
        modulo2.mostrarEstado();
        modulo3.mostrarEstado();

        System.out.println("VERSIONES");
        modulo1.mostrarVersion();
        modulo2.mostrarVersion();
        modulo3.mostrarVersion();
    }
}
