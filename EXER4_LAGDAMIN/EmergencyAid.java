public class EmergencyAid extends InclusiveService {
    public EmergencyAid(String serviceTitle, String location) {
        super(serviceTitle, location);
    }

    @Override
    public void deliverService() {
        System.out.println(serviceTitle + " is giving immediate emergency aid at " + location + ".");
    }
}
