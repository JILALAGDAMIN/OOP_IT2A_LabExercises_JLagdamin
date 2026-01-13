import java.util.ArrayList;

public class IEMSMainTester {
    public static void main(String[] args) {

        ArrayList<InclusiveService> services = new ArrayList<>();

        // Add unique services
        services.add(new EmergencyAid("Typhoon Relief Program", "Barangay Evacuation Center"));
        services.add(new LearningSupport("Inclusive Learning Program", "Community School"));
        services.add(new NutritionAid("School Feeding Program", "Barangay Hall"));
        services.add(new HealthCheckup("Medical Mission", "Inclusive School Clinic"));
        services.add(new TemporaryShelter("Temporary Housing for Students", "Municipal Gymnasium"));

        System.out.println("=== Inclusive Education Management System Services ===\n");

        for (InclusiveService service : services) {
            service.deliverService();           // overridden method
            service.info("Polymorphism & Overloading Demo"); // overloaded method
            System.out.println("---------------------------------------------");
        }
    }
}
