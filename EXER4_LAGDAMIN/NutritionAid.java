public class NutritionAid extends InclusiveService {
    public NutritionAid(String serviceTitle, String location) {
        super(serviceTitle, location);
    }

    @Override
    public void deliverService() {
        System.out.println(serviceTitle + " is providing healthy meals for learners at " + location + ".");
    }
}
