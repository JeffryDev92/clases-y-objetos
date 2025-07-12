public class SistemaElectrico {

    private String bateria;
    private String luces;
    private String sensores;

    public SistemaElectrico(String bateria, String luces, String sensores) {
        this.bateria = bateria;
        this.luces = luces;
        this.sensores = sensores;
    }

    public void displayInfo() {
        System.out.println("Información del sistema eléctrico:");
        System.out.println("Batería: " + bateria);
        System.out.println("Luces: " + luces);
        System.out.println("Sensores: " + sensores);
    }
}
