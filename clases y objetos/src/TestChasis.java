public class TestChasis {
    public static void main(String[] args) {
        Chasis c1 = new Chasis();
        c1.setTipo("Monocasco");
        c1.setLargo(4.5);
        c1.setAncho(1.8);
        c1.setPeso(1300.0);

        Chasis c2 = new Chasis();
        c2.setTipo("Bastidor de escalera");
        c2.setLargo(5.2);
        c2.setAncho(2.0);
        c2.setPeso(1800.0);

        Chasis c3 = new Chasis();
        c3.setTipo("Espina de pez");
        c3.setLargo(4.7);
        c3.setAncho(1.9);
        c3.setPeso(1500.0);

        Chasis c4 = new Chasis();
        c4.setTipo("Tubular");
        c4.setLargo(4.2);
        c4.setAncho(1.75);
        c4.setPeso(1250.0);

        System.out.println("Chasis registrados:");
        imprimirChasis(c1);
        imprimirChasis(c2);
        imprimirChasis(c3);
        imprimirChasis(c4);
    }

    public static void imprimirChasis(Chasis c) {
        System.out.println("Tipo: " + c.getTipo() + ", Largo: " + c.getLargo() + " m, Ancho: " + c.getAncho() + " m, Peso: " + c.getPeso() + " kg");
    }
}
