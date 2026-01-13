public class HealthCheckup extends InclusiveService {
    public HealthCheckup(String serviceTitle, String location) {
        super(serviceTitle, location);
    }

    @Override
    public void deliverService() {
        System.out.println(serviceTitle + " is performing free medical checkups at " + location + ".");
    }
}
