public class Sensor {

    private String tipo;
    private String ubicacion;
    private String estado;

    public Sensor(String tipo, String ubicacion, String estado) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public void displayInfo() {
        System.out.println("Información del sensor:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Estado: " + estado);
    }
}
