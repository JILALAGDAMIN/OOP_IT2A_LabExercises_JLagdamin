// --- Base Class: Transportation (Abstract) ---
abstract class Transportation {
    private String name;
    private int capacity;
    protected double speed; // Added for AirTransport

    // Constructor now accepts 3 arguments
    public Transportation(String name, int capacity, double speed) { 
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

    // Abstract method: MUST be implemented by all concrete subclasses
    public abstract void move();

    // Common non-abstract method (inherited)
    public void displayInfo() {
        System.out.println("Type: " + name + " | Max Capacity: " + capacity + " people. | Speed: " + speed + " mph");
    }

    public String getName() {
        return name;
    }
}

// ----------------------------------------------------------------------------------

// --- Intermediate Class 1: Air Transport ---
abstract class AirTransport extends Transportation {
    protected double maxAltitude; // in feet

    // Constructor accepts 4 arguments, calling super with 3
    public AirTransport(String name, int capacity, double speed, double maxAltitude) {
        super(name, capacity, speed);
        this.maxAltitude = maxAltitude;
    }
    
    public void fly() {
        System.out.println(getName() + " is airborne.");
    }
    
    @Override
    public void move() {
        System.out.println(getName() + " is flying through the air.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Displays parent info (including speed)
        System.out.println("Max Altitude: " + maxAltitude + " ft");
    }
}

// Subclasses of AirTransport
class Helicopter extends AirTransport {
    public Helicopter() {
        super("Helicopter", 6, 150.0, 15000.0);
    }
    @Override
    public void move() {
        System.out.println("The " + getName() + " is moving via rotor lift.");
    }
}

class Airplane extends AirTransport {
    public Airplane() {
        super("Airplane", 400, 550.0, 45000.0);
    }
}

class SpaceShuttle extends AirTransport {
    public SpaceShuttle() {
        super("Space Shuttle", 8, 17500.0, 3280000.0);
    }
    @Override
    public void move() {
        System.out.println("The " + getName() + " is launching into space.");
    }
}

// ----------------------------------------------------------------------------------

// --- Intermediate Class 2: Land Transport ---
abstract class LandTransport extends Transportation {
    public LandTransport(String name, int capacity, double speed) {
        super(name, capacity, speed);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is driving on the ground.");
    }
}

// Subclasses of LandTransport
class Truck extends LandTransport {
    public Truck() {
        super("Truck", 3, 70.0);
    }
}

class SUV extends LandTransport {
    public SUV() {
        super("SUV", 7, 95.0);
    }
}

class Tricycle extends LandTransport {
    public Tricycle() {
        super("Tricycle", 5, 25.0);
    }
}

class Motorcycle extends LandTransport {
    public Motorcycle() {
        super("Motorcycle", 2, 120.0);
    }
}

class Kariton extends LandTransport {
    public Kariton() {
        super("Kariton (Pushcart)", 1, 3.0);
    }
    @Override
    public void move() {
        System.out.println("The " + getName() + " is being manually pushed.");
    }
}

// ----------------------------------------------------------------------------------

// --- Intermediate Class 3: Water Transport ---
abstract class WaterTransport extends Transportation {
    public WaterTransport(String name, int capacity, double speed) {
        super(name, capacity, speed);
    }
    
    public void floatOnWater() {
        System.out.println(getName() + " is currently afloat.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is navigating the water.");
    }
}

// Subclasses of WaterTransport 
class Boat extends WaterTransport {
    public Boat() {
        super("Boat", 10, 40.0);
    }
}

class Submarine extends WaterTransport {
    public Submarine() {
        super("Submarine", 50, 25.0);
    }
    @Override
    public void move() {
        System.out.println("The " + getName() + " is submerging and moving underwater.");
    }
}

// ----------------------------------------------------------------------------------

/**
 * Main Class to demonstrate the hierarchy and polymorphism.
 * File must be named TransportationDemo.java
 */
public class TransportationDemo {
    public static void main(String[] args) {
        System.out.println("--- Transportation Hierarchy Demonstration ---");
        
        // Polymorphism in action: treating all vehicles as the base 'Transportation' type
        Transportation[] vehicles = {
            new Airplane(), 
            new Truck(), 
            new Submarine(), 
            new Kariton(), 
            new Motorcycle(), 
            new Helicopter()
        };
        
        // Looping through the array and calling the polymorphic move() method
        for (Transportation v : vehicles) {
            System.out.println("---------------------------------");
            v.displayInfo(); // Calls the most specific displayInfo (e.g., AirTransport's)
            v.move();        // Calls the most specific move()
        }
        System.out.println("---------------------------------");
    }
}