
abstract class Transportation {
    private String name;
    private int capacity;
    protected double speed;

    public Transportation(String name, int capacity, double speed) { 
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

    public abstract void move();

    public void displayInfo() {
        System.out.println("Type: " + name + " | Max Capacity: " + capacity + " people. | Speed: " + speed + " mph");
    }

    public String getName() {
        return name;
    }
}

abstract class AirTransport extends Transportation {
    protected double maxAltitude; // in feet

    // Constructor accepts 4 arguments, passing 3 to parent
    public AirTransport(String name, int capacity, double speed, double maxAltitude) {
        super(name, capacity, speed);
        this.maxAltitude = maxAltitude;
    }

    // Air-specific method
    public void fly() {
        System.out.println(getName() + " is airborne.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is flying through the air.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Displays parent info (name, capacity, speed)
        System.out.println("Max Altitude: " + maxAltitude + " ft");
    }
}