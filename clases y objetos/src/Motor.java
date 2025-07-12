public class Motor {

    private String tipo;
    private double cilindrada;
    private int potencia;

    public Motor(String tipo, double cilindrada, int potencia) {
        this.tipo = tipo;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public void displayInfo() {
        System.out.println("Información del motor:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindrada: " + cilindrada + " cc");
        System.out.println("Potencia: " + potencia + " HP");
    }
}
