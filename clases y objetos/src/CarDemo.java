public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();

        // Usamos setters para inicializar
        myCar.setMake("Toyota");
        myCar.setModel("Corolla");
        myCar.setYear(2024);

        // Usamos getters para leer
        System.out.println("Make  : " + myCar.getMake());
        System.out.println("Model : " + myCar.getModel());
        System.out.println("Year  : " + myCar.getYear());
    }
}
