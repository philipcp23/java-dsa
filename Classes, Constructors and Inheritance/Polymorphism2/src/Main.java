class Car {
    private int cylinders;
    private int wheels;
    private boolean engine;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("start Car engine");
    }

    public void brake() {
        System.out.println("stop car");
    }

    public void accelerate() {
        System.out.println("gooo car");
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }
}

class Tesla extends Car {
    public Tesla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("tesla start engine");
    }

    @Override
    public void brake() {
        System.out.println("tesla brake");
    }

    @Override
    public void accelerate() {
        System.out.println("tesla accelerate");
    }
}

class Range extends Car {
    public Range(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("range start engine");
    }

    @Override
    public void brake() {
        System.out.println("range brake");
    }

    @Override
    public void accelerate() {
        System.out.println("range accelerate");
    }
}

class Lambo extends Car {
    public Lambo(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("lambo start engine");
    }

    @Override
    public void brake() {
        System.out.println("lambo brake");
    }

    @Override
    public void accelerate() {
        System.out.println("lambo accelerate");
    }

}

class Ferrari extends Car {
    public Ferrari(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println("ferrari start engine");
    }

    @Override
    public void brake() {
        System.out.println("ferrari brake");
    }

    @Override
    public void accelerate() {
        System.out.println("ferrari accelerate");
    }

}



public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "Honda");
        car.startEngine();
        car.accelerate();
        car.brake();

        Tesla tesla = new Tesla(4, "Tesla");
        tesla.startEngine();
        tesla.accelerate();
        tesla.brake();

        Range range = new Range(12, "Range");
        range.startEngine();
        range.accelerate();
        range.brake();

        Lambo lambo = new Lambo(12, "Range");
        lambo.startEngine();
        lambo.accelerate();
        lambo.brake();

        Ferrari ferrari = new Ferrari(8, "Ferrari");
        ferrari.startEngine();
        ferrari.accelerate();
        ferrari.brake();


    }

}
