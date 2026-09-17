
public class CarApp {

    public static void main(String[] args) {
        Car.kilometerToMiles();
        Car nano = new Car();
        nano.milage();
    }
}

class Car {

    static void kilometerToMiles() {
        System.out.println("Calculating the distance from km to miles");
    }

    void milage() {
        System.out.println("calculating milage.......");
    }

}
