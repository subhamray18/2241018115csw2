 interface Vehicle {
    void accelerate();
    void brake();
    }
    class Car implements Vehicle {
    public void accelerate() {
    System.out.println("Car is accelerating.");
    }
    public void brake() {
    System.out.println("Car is braking.");
    }
    public void accelerate(int speed) {
    System.out.println("Car is accelerating to " + speed + " mph.");
    }
    public void accelerate(int speed, int duration) {
    System.out.println("Car is accelerating to " + speed + " mph for " + duration + " seconds.");
    }
    }
     class Bicycle implements Vehicle {
    public void accelerate() {
    System.out.println("Bicycle is pedaling faster.");
    }
    public void brake() {
    System.out.println("Bicycle is slowing down.");
    }
    public void accelerate(int speed) {
    System.out.println("Bicycle is pedaling faster to reach " + speed + " mph.");
    }
    public void accelerate(int speed, int duration) {
    System.out.println("Bicycle is pedaling faster to reach " + speed + " mph for " + duration + " seconds.");
    }
    }
    public class Q8 {
    public static void main(String[] args) {
    Vehicle car = new Car();
    Vehicle bicycle = new Bicycle();
    car.accelerate();
    car.brake();
    car.accelerate();
    car.accelerate();
    System.out.println();
    bicycle.accelerate();
    bicycle.brake();
    bicycle.accelerate();
    bicycle.accelerate();
    }
    }
    
