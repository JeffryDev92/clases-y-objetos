public class TestRegistroVehicular {
    public static void main(String[] args) {
        RegistroVehicular r1 = new RegistroVehicular();
        r1.setMatricula("ABC123");
        r1.setPropietario("Juan Pérez");
        r1.setFechaRegistro("2023-01-15");

        RegistroVehicular r2 = new RegistroVehicular();
        r2.setMatricula("DEF456");
        r2.setPropietario("María López");
        r2.setFechaRegistro("2022-11-30");

        RegistroVehicular r3 = new RegistroVehicular();
        r3.setMatricula("GHI789");
        r3.setPropietario("Carlos Gómez");
        r3.setFechaRegistro("2024-03-22");

        RegistroVehicular r4 = new RegistroVehicular();
        r4.setMatricula("JKL012");
        r4.setPropietario("Laura Rodríguez");
        r4.setFechaRegistro("2023-09-08");

        System.out.println("Registros vehiculares:");
        imprimirRegistro(r1);
        imprimirRegistro(r2);
        imprimirRegistro(r3);
        imprimirRegistro(r4);
    }

    public static void imprimirRegistro(RegistroVehicular r) {
        System.out.println("Matrícula: " + r.getMatricula() +
                           ", Propietario: " + r.getPropietario() +
                           ", Fecha de registro: " + r.getFechaRegistro());
    }
}
