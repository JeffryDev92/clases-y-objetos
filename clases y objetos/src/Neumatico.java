public class Neumatico {

    private String marca;
    private String tamaño;
    private double presion;

    public Neumatico(String marca, String tamaño, double presion) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.presion = presion;
    }

    public void displayInfo() {
        System.out.println("Información del neumático:");
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Presión: " + presion + " psi");
    }
}
