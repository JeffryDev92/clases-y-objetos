public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2022);
        myCar.displayInfo();

        Car friendsCar = new Car("Honda", "Civic", 2023);
        friendsCar.displayInfo();
    }
}
