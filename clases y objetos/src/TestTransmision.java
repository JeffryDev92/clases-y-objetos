public class TestTransmision {
    public static void main(String[] args) {
        Transmision t1 = new Transmision();
        t1.setTipo("Automática");
        t1.setMarchas(6);
        t1.setTraccion("Delantera");

        Transmision t2 = new Transmision();
        t2.setTipo("Manual");
        t2.setMarchas(5);
        t2.setTraccion("Trasera");

        Transmision t3 = new Transmision();
        t3.setTipo("CVT");
        t3.setMarchas(0); // CVT no tiene marchas tradicionales
        t3.setTraccion("Integral");

        Transmision t4 = new Transmision();
        t4.setTipo("Automática");
        t4.setMarchas(8);
        t4.setTraccion("AWD");

        System.out.println("Transmisiones configuradas:");
        imprimirTransmision(t1);
        imprimirTransmision(t2);
        imprimirTransmision(t3);
        imprimirTransmision(t4);
    }

    public static void imprimirTransmision(Transmision t) {
        System.out.println("Tipo: " + t.getTipo() + ", Marchas: " + t.getMarchas() + ", Tracción: " + t.getTraccion());
    }
}
