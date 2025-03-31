// Part b) Method Overloading and Overriding

// Method overloading example
class MathOperations {
    // First multiply method with two parameters
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Overloaded multiply method with three parameters
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

// Base class for method overriding
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass overriding the method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

// Another subclass overriding the method
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow!");
    }
}

// Main class to demonstrate
public class MethodDemo {
    public static void main(String[] args) {
        // Method overloading demonstration
        MathOperations math = new MathOperations();
        
        int result1 = math.multiply(5, 3);
        int result2 = math.multiply(5, 3, 2);
        
        System.out.println("5 * 3 = " + result1);
        System.out.println("5 * 3 * 2 = " + result2);
        
        // Method overriding and polymorphism demonstration
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        
        myDog.makeSound();  // Calls Dog's version of makeSound()
        myCat.makeSound();  // Calls Cat's version of makeSound()
    }
}
