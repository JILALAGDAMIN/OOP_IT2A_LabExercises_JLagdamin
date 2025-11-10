public abstract class WaterTransport extends Transportation {
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