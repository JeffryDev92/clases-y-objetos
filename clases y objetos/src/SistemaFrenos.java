public class SistemaFrenos {

    private String tipo;
    private int discos;
    private boolean abs;
    private String estado;

    public SistemaFrenos(String tipo, int discos, boolean abs, String estado) {
        this.tipo = tipo;
        this.discos = discos;
        this.abs = abs;
        this.estado = estado;
    }

    public void displayInfo() {
        System.out.println("Información del sistema de frenos:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Discos: " + discos);
        System.out.println("ABS: " + (abs ? "Sí" : "No"));
        System.out.println("Estado: " + estado);
    }
}
