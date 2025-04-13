class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car is starting");

    }

    @Override
    public void stop() {
        System.out.println("Car stopped");

    }
}

class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Bike is starting");

    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");

    }
}


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        car.stop();
        bike.start();
        bike.stop();

    }
}