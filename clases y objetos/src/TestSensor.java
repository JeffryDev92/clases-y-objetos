public class TestSensor {
    public static void main(String[] args) {
        Sensor s1 = new Sensor();
        s1.setTipo("Temperatura");
        s1.setUbicacion("Motor");
        s1.setEstado("Activo");

        Sensor s2 = new Sensor();
        s2.setTipo("Presión");
        s2.setUbicacion("Ruedas");
        s2.setEstado("Inactivo");

        Sensor s3 = new Sensor();
        s3.setTipo("Velocidad");
        s3.setUbicacion("Transmisión");
        s3.setEstado("Activo");

        Sensor s4 = new Sensor();
        s4.setTipo("Oxígeno");
        s4.setUbicacion("Escape");
        s4.setEstado("Activo");

        System.out.println("Sensores configurados:");
        imprimirSensor(s1);
        imprimirSensor(s2);
        imprimirSensor(s3);
        imprimirSensor(s4);
    }

    public static void imprimirSensor(Sensor s) {
        System.out.println("Tipo: " + s.getTipo() +
                           ", Ubicación: " + s.getUbicacion() +
                           ", Estado: " + s.getEstado());
    }
}
