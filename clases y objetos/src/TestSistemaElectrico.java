public class TestSistemaElectrico {
    public static void main(String[] args) {
        SistemaElectrico s1 = new SistemaElectrico();
        s1.setBateria("12V AGM");
        s1.setLuces("LED");
        s1.setSensores("Proximidad");

        SistemaElectrico s2 = new SistemaElectrico();
        s2.setBateria("12V Litio");
        s2.setLuces("Halógeno");
        s2.setSensores("Temperatura");

        SistemaElectrico s3 = new SistemaElectrico();
        s3.setBateria("24V AGM");
        s3.setLuces("Xenón");
        s3.setSensores("Presión");

        SistemaElectrico s4 = new SistemaElectrico();
        s4.setBateria("48V híbrida");
        s4.setLuces("Láser");
        s4.setSensores("Velocidad");

        System.out.println("Sistemas eléctricos configurados:");
        imprimirSistemaElectrico(s1);
        imprimirSistemaElectrico(s2);
        imprimirSistemaElectrico(s3);
        imprimirSistemaElectrico(s4);
    }

    public static void imprimirSistemaElectrico(SistemaElectrico s) {
        System.out.println("Batería: " + s.getBateria() +
                           ", Luces: " + s.getLuces() +
                           ", Sensores: " + s.getSensores());
    }
}
