public class TestMotor {
    public static void main(String[] args) {
        Motor m1 = new Motor();
        m1.setTipo("Gasolina");
        m1.setCilindrada(1600.0);
        m1.setPotencia(130);

        Motor m2 = new Motor();
        m2.setTipo("Diésel");
        m2.setCilindrada(2000.0);
        m2.setPotencia(150);

        Motor m3 = new Motor();
        m3.setTipo("Híbrido");
        m3.setCilindrada(1800.0);
        m3.setPotencia(140);

        Motor m4 = new Motor();
        m4.setTipo("Eléctrico");
        m4.setCilindrada(0.0);
        m4.setPotencia(170);

        System.out.println("Motores configurados:");
        imprimirMotor(m1);
        imprimirMotor(m2);
        imprimirMotor(m3);
        imprimirMotor(m4);
    }

    public static void imprimirMotor(Motor m) {
        System.out.println("Tipo: " + m.getTipo() + ", Cilindrada: " + m.getCilindrada() + " cc, Potencia: " + m.getPotencia() + " HP");
    }
}
