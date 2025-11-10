public abstract class LandTransport extends Transportation {
    public LandTransport(String name, int capacity, double speed) {
        super(name, capacity, speed);
    }

    @Override
    public void move() {
        System.out.println(getName() + " is driving on the ground.");
    }
}