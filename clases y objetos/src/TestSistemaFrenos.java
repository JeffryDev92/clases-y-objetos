public class TestSistemaFrenos {
    public static void main(String[] args) {
        SistemaFrenos f1 = new SistemaFrenos();
        f1.setTipo("Disco");
        f1.setDiscos(4);
        f1.setAbs(true);
        f1.setEstado("Óptimo");

        SistemaFrenos f2 = new SistemaFrenos();
        f2.setTipo("Tambor");
        f2.setDiscos(2);
        f2.setAbs(false);
        f2.setEstado("Regular");

        SistemaFrenos f3 = new SistemaFrenos();
        f3.setTipo("Mixto");
        f3.setDiscos(4);
        f3.setAbs(true);
        f3.setEstado("Bueno");

        SistemaFrenos f4 = new SistemaFrenos();
        f4.setTipo("Disco ventilado");
        f4.setDiscos(4);
        f4.setAbs(true);
        f4.setEstado("Excelente");

        System.out.println("Sistemas de frenos registrados:");
        imprimirSistemaFrenos(f1);
        imprimirSistemaFrenos(f2);
        imprimirSistemaFrenos(f3);
        imprimirSistemaFrenos(f4);
    }

    public static void imprimirSistemaFrenos(SistemaFrenos f) {
        System.out.println("Tipo: " + f.getTipo() +
                           ", Discos: " + f.getDiscos() +
                           ", ABS: " + (f.isAbs() ? "Sí" : "No") +
                           ", Estado: " + f.getEstado());
    }
}
