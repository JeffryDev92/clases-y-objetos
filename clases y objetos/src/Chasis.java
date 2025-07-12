public class Chasis {

    private String tipo;
    private double largo;
    private double ancho;
    private double peso;

    public Chasis(String tipo, double largo, double ancho, double peso) {
        this.tipo = tipo;
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
    }

    public void displayInfo() {
        System.out.println("Información del chasis:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Largo: " + largo + " m");
        System.out.println("Ancho: " + ancho + " m");
        System.out.println("Peso: " + peso + " kg");
    }
}
