public class Mantenimiento {

    private String fecha;
    private String tipo;
    private String observaciones;

    public Mantenimiento(String fecha, String tipo, String observaciones) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.observaciones = observaciones;
    }

    public void displayInfo() {
        System.out.println("Información de mantenimiento:");
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo: " + tipo);
        System.out.println("Observaciones: " + observaciones);
    }
}
