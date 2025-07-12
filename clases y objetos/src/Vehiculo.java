public class Vehiculo {
 private int id;
    private String marca;
    private String modelo;
    private int año;
    private String color;
    
    public Vehiculo(int id, String marca, String modelo, int año, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    public void displayInfo() {
        System.out.println("Información del vehículo:");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
    }
}
