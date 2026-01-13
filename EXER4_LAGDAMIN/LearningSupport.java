public class LearningSupport extends InclusiveService {
    public LearningSupport(String serviceTitle, String location) {
        super(serviceTitle, location);
    }

    @Override
    public void deliverService() {
        System.out.println(serviceTitle + " is conducting special learning sessions at " + location + " for students with different needs.");
    }
}
