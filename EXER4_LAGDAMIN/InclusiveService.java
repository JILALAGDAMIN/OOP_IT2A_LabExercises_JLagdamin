public class InclusiveService {
    protected String serviceTitle;
    protected String location;

    public InclusiveService(String serviceTitle, String location) {
        this.serviceTitle = serviceTitle;
        this.location = location;
    }

    // Default deliver method (to be overridden)
    public void deliverService() {
        System.out.println(serviceTitle + " is currently being provided at " + location);
    }

    // Overloaded methods
    public void info() {
        System.out.println("Service: " + serviceTitle + " | Location: " + location);
    }

    public void info(String extra) {
        System.out.println("Service: " + serviceTitle + " | Location: " + location + " | " + extra);
    }
}
