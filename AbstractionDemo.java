// Question 2: Abstraction and Exception Handling in Java

// Part a) Abstraction

// Abstract class
abstract class Appliance {
    // Abstract method - must be implemented by subclasses
    public abstract void turnOn();
}

// Concrete subclass implementing the abstract method
class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is turning on... Starting to rotate.");
    }
}

// Another concrete subclass implementing the abstract method
class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("TV is turning on... Screen is lighting up.");
    }
}

// Main class to demonstrate abstraction
public class AbstractionDemo {
    public static void main(String[] args) {
        // Cannot instantiate abstract class
        // Appliance app = new Appliance(); // This would cause error
        
        // Create objects of concrete subclasses
        Appliance fan = new Fan();
        Appliance tv = new TV();
        
        // Call abstract method (polymorphism)
        fan.turnOn();
        tv.turnOn();
    }
}
