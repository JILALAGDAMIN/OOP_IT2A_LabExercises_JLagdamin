public class TemporaryShelter extends InclusiveService {
    public TemporaryShelter(String serviceTitle, String location) {
        super(serviceTitle, location);
    }

    @Override
    public void deliverService() {
        System.out.println(serviceTitle + " is providing temporary shelters for students at " + location + ".");
    }
}
