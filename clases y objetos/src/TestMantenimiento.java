public class TestMantenimiento {
    public static void main(String[] args) {
        Mantenimiento m1 = new Mantenimiento();
        m1.setFecha("2024-01-10");
        m1.setTipo("Cambio de aceite");
        m1.setObservaciones("Sin novedades");

        Mantenimiento m2 = new Mantenimiento();
        m2.setFecha("2024-03-05");
        m2.setTipo("Revisión de frenos");
        m2.setObservaciones("Se cambiaron discos");

        Mantenimiento m3 = new Mantenimiento();
        m3.setFecha("2024-06-20");
        m3.setTipo("Alineación");
        m3.setObservaciones("Neumáticos desgastados");

        Mantenimiento m4 = new Mantenimiento();
        m4.setFecha("2024-07-01");
        m4.setTipo("Revisión general");
        m4.setObservaciones("Todo en orden");

        System.out.println("Historial de mantenimientos:");
        imprimirMantenimiento(m1);
        imprimirMantenimiento(m2);
        imprimirMantenimiento(m3);
        imprimirMantenimiento(m4);
    }

    public static void imprimirMantenimiento(Mantenimiento m) {
        System.out.println("Fecha: " + m.getFecha() +
                           ", Tipo: " + m.getTipo() +
                           ", Observaciones: " + m.getObservaciones());
    }
}
