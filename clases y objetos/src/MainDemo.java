public class MainDemo {
    public static void main(String[] args) {
        // Vehículo
        Vehiculo vehiculo = new Vehiculo(1, "Toyota", "Corolla", 2022, "Blanco");
        vehiculo.displayInfo();
        System.out.println();

        // Motor
        Motor motor = new Motor("Gasolina", 1800.0, 140);
        motor.displayInfo();
        System.out.println();

        // Transmisión
        Transmision transmision = new Transmision("Automática", 6, "Delantera");
        transmision.displayInfo();
        System.out.println();

        // Chasis
        Chasis chasis = new Chasis("Monocasco", 4.5, 1.8, 1300.0);
        chasis.displayInfo();
        System.out.println();

        // Neumático
        Neumatico neumatico = new Neumatico("Michelin", "205/55R16", 32.0);
        neumatico.displayInfo();
        System.out.println();

        // Sistema Eléctrico
        SistemaElectrico sistemaElectrico = new SistemaElectrico("12V", "LED", "Sensores de proximidad");
        sistemaElectrico.displayInfo();
        System.out.println();

        // Sistema de Frenos
        SistemaFrenos sistemaFrenos = new SistemaFrenos("Disco", 4, true, "Óptimo");
        sistemaFrenos.displayInfo();
        System.out.println();

        // Registro Vehicular
        RegistroVehicular registro = new RegistroVehicular("ABC123", "Juan Pérez", "2023-04-10");
        registro.displayInfo();
        System.out.println();

        // Mantenimiento
        Mantenimiento mantenimiento = new Mantenimiento("2024-03-15", "Cambio de aceite", "Sin observaciones");
        mantenimiento.displayInfo();
        System.out.println();

        // Sensor
        Sensor sensor = new Sensor("Temperatura", "Motor", "Activo");
        sensor.displayInfo();
        System.out.println();
    }
}
