package runcing_car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("A");
        Car car1 = new Car("B");
        Car car2 = new Car("C");

        Thread t = new Thread(car);
        Thread t2 = new Thread(car1);
        Thread t3 = new Thread(car2);
        t.start();
        t2.start();
        t3.start();

    }
}
