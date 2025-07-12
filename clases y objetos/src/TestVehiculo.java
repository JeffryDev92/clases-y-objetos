public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.setId(1);
        v1.setMarca("Toyota");
        v1.setModelo("Corolla");
        v1.setAño(2022);
        v1.setColor("Rojo");

        Vehiculo v2 = new Vehiculo();
        v2.setId(2);
        v2.setMarca("Honda");
        v2.setModelo("Civic");
        v2.setAño(2021);
        v2.setColor("Gris");

        Vehiculo v3 = new Vehiculo();
        v3.setId(3);
        v3.setMarca("Mazda");
        v3.setModelo("3");
        v3.setAño(2020);
        v3.setColor("Negro");

        Vehiculo v4 = new Vehiculo();
        v4.setId(4);
        v4.setMarca("Chevrolet");
        v4.setModelo("Onix");
        v4.setAño(2023);
        v4.setColor("Blanco");

        System.out.println("Vehículos registrados:");
        imprimirVehiculo(v1);
        imprimirVehiculo(v2);
        imprimirVehiculo(v3);
        imprimirVehiculo(v4);
    }

    public static void imprimirVehiculo(Vehiculo v) {
        System.out.println("ID: " + v.getId() + ", Marca: " + v.getMarca() +
            ", Modelo: " + v.getModelo() + ", Año: " + v.getAño() +
            ", Color: " + v.getColor());
    }
}
