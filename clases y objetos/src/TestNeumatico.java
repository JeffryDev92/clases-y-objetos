public class TestNeumatico {
    public static void main(String[] args) {
        Neumatico n1 = new Neumatico();
        n1.setMarca("Michelin");
        n1.setTamaño("205/55R16");
        n1.setPresion(32.0);

        Neumatico n2 = new Neumatico();
        n2.setMarca("Pirelli");
        n2.setTamaño("215/60R17");
        n2.setPresion(30.5);

        Neumatico n3 = new Neumatico();
        n3.setMarca("Bridgestone");
        n3.setTamaño("225/45R18");
        n3.setPresion(31.0);

        Neumatico n4 = new Neumatico();
        n4.setMarca("Goodyear");
        n4.setTamaño("195/65R15");
        n4.setPresion(29.0);

        System.out.println("Neumáticos configurados:");
        imprimirNeumatico(n1);
        imprimirNeumatico(n2);
        imprimirNeumatico(n3);
        imprimirNeumatico(n4);
    }

    public static void imprimirNeumatico(Neumatico n) {
        System.out.println("Marca: " + n.getMarca() + ", Tamaño: " + n.getTamaño() + ", Presión: " + n.getPresion() + " psi");
    }
}
