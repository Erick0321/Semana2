package negocio;

public class PruebaTarea {
    public static void main(String[] args) {

        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.titulo = "Crear interfaz";
        tarea1.responsable = "Carlos";
        tarea1.horasEstimadas = 5;
        tarea1.completada = false;

        tarea2.titulo = "Programar Login";
        tarea2.responsable = "Erick";
        tarea2.horasEstimadas = 8;
        tarea2.completada = false;

        tarea3.titulo = "Realizar pruebas";
        tarea3.responsable = "Maria";
        tarea3.horasEstimadas = 4;
        tarea3.completada = false;

        System.out.println("TAREA 1");
        tarea1.mostrarInformacion();

        System.out.println("TAREA 2");
        tarea2.mostrarInformacion();

        System.out.println("TAREA 3");
        tarea3.mostrarInformacion();

        System.out.println("COMPLETAR TAREA 2");
        tarea2.completar();

        System.out.println("ESTADOS");
        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();

        System.out.println("RESPONSABLES");
        tarea1.mostrarResponsable();
        tarea2.mostrarResponsable();
        tarea3.mostrarResponsable();
    }
}
