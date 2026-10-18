package negocio;

public class PruebaVideojuego {
    public static void main(String[] args) {

        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        juego1.nombre = "Minecraft";
        juego1.genero = "Aventura";
        juego1.version = "1.21";
        juego1.activo = false;

        juego2.nombre = "FIFA";
        juego2.genero = "Deportes";
        juego2.version = "2026";
        juego2.activo = false;

        juego3.nombre = "Clash Royale";
        juego3.genero = "Estrategia";
        juego3.version = "1.0";
        juego3.activo = false;

        System.out.println("VIDEOJUEGO 1");
        juego1.mostrarInformacion();

        System.out.println("VIDEOJUEGO 2");
        juego2.mostrarInformacion();

        System.out.println("VIDEOJUEGO 3");
        juego3.mostrarInformacion();

        System.out.println("INICIAR JUEGO 2");
        juego2.iniciar();

        juego1.mostrarInformacion();
        juego2.mostrarInformacion();
        juego3.mostrarInformacion();

        System.out.println("CERRAR JUEGO 2");
        juego2.cerrar();
        juego2.mostrarInformacion();

        System.out.println("MOSTRAR VERSION");
        juego1.mostrarVersion();
    }
}
