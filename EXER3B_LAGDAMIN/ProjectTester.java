// -------------------------------------------------------------------------
// --- 1. PERSON HIERARCHY ---
// -------------------------------------------------------------------------

// BASE CLASS
abstract class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract String getRole();

    public void displayInfo() {
        System.out.println("Name: " + name + " | ID: " + id);
    }
}

// INTERMEDIATE CLASS
abstract class Employee extends Person {
    protected double salary;
    protected String hireDate;

    public Employee(String name, int id, double salary, String hireDate) {
        super(name, id);
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: $" + salary);
    }

    @Override
    public String getRole() {
        return "General Employee";
    }
}

// CONCRETE SUBCLASSES (Employee)
class Teacher extends Employee {
    private String subject;

    public Teacher(String name, int id, double salary, String hireDate, String subject) {
        super(name, id, salary, hireDate);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }

    @Override
    public String getRole() {
        return "Teacher (" + subject + ")";
    }
}

class Administrator extends Employee {
    private String department;

    public Administrator(String name, int id, double salary, String hireDate, String department) {
        super(name, id, salary, hireDate);
        this.department = department;
    }

    public void manage() {
        System.out.println(name + " manages " + department + ".");
    }

    @Override
    public String getRole() {
        return "Administrator (" + department + ")";
    }
}

// CONCRETE SUBCLASS (Person)
class Student extends Person {
    private String studentId;
    private String major;

    public Student(String name, int id, String studentId, String major) {
        super(name, id);
        this.studentId = studentId;
        this.major = major;
    }

    public void study() {
        System.out.println(name + " is studying " + major + ".");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId + " | Major: " + major);
    }

    @Override
    public String getRole() {
        return "Student";
    }
}

// -------------------------------------------------------------------------
// --- 2. CONTENT HIERARCHY (The Knowledge) ---
// -------------------------------------------------------------------------

// BASE CLASS
abstract class Content {
    protected String title;
    protected String contentType;

    public Content(String title, String contentType) {
        this.title = title;
        this.contentType = contentType;
    }

    public abstract void displayContentDetails();
}

// CONCRETE SUBCLASSES
class CuratedContent extends Content {
    private int version;

    public CuratedContent(String title, int version) {
        super(title, "Structured");
        this.version = version;
    }

    @Override
    public void displayContentDetails() {
        System.out.println("Content: " + title + " (Curated) | Version: " + version + " | Status: Fixed.");
    }
}

class DynamicContent extends Content {
    private String dataSource;

    public DynamicContent(String title, String dataSource) {
        super(title, "Evolving");
        this.dataSource = dataSource;
    }

    @Override
    public void displayContentDetails() {
        System.out.println("Content: " + title + " (Dynamic) | Source: " + dataSource + " | Status: Real-time.");
    }
}

// -------------------------------------------------------------------------
// --- 3. DELIVERY METHOD HIERARCHY (The Access) ---
// -------------------------------------------------------------------------

// BASE CLASS
abstract class DeliveryMethod {
    protected String methodName;
    protected String format;

    public DeliveryMethod(String methodName, String format) {
        this.methodName = methodName;
        this.format = format;
    }

    public abstract void describeDelivery();
}

// CONCRETE SUBCLASSES
class AsynchronousMethod extends DeliveryMethod {
    private String platform;

    public AsynchronousMethod(String methodName, String platform) {
        super(methodName, "Self-Paced");
        this.platform = platform;
    }

    @Override
    public void describeDelivery() {
        System.out.println("Delivery: " + methodName + " (Async) | Platform: " + platform + " | Limit: Time Flexible.");
    }
}

class SynchronousMethod extends DeliveryMethod {
    private int maxParticipants;

    public SynchronousMethod(String methodName, int maxParticipants) {
        super(methodName, "Real-Time");
        this.maxParticipants = maxParticipants;
    }

    @Override
    public void describeDelivery() {
        System.out.println("Delivery: " + methodName + " (Sync) | Max Participants: " + maxParticipants + " | Limit: Schedule Fixed.");
    }
}

// -------------------------------------------------------------------------
// --- 4. PROJECT TESTER (MAIN CLASS) ---
// -------------------------------------------------------------------------

public class ProjectTester {
    public static void main(String[] args) {
        System.out.println("--- Education System: Learn Without Limits Demo ---");
        System.out.println("----------------------------------------------------");

        // 1. Person Instances (Participants)
        Student aisha = new Student("Aisha Khan", 1001, "A2024", "AI Ethics");
        Teacher profLee = new Teacher("Dr. Lee", 2005, 95000.00, "2015-01-10", "Quantum Physics");
        Administrator dirChen = new Administrator("Director Chen", 3001, 110000.00, "2010-07-01", "Global Enrollment");
        
        System.out.println("--- 1. Participants ---");
        aisha.displayInfo();
        aisha.study();
        profLee.displayInfo();
        profLee.teach();
        dirChen.displayInfo();
        dirChen.manage();
        System.out.println("\n");
        
        // 2. Content Instances (The Knowledge)
        CuratedContent historyModule = new CuratedContent("World History 101", 3);
        DynamicContent marketData = new DynamicContent("Global Market Trends", "Live Stock Feed");

        System.out.println("--- 2. Content Types ---");
        historyModule.displayContentDetails();
        marketData.displayContentDetails();
        System.out.println("\n");
        
        // 3. Delivery Method Instances (The Access)
        AsynchronousMethod selfPaced = new AsynchronousMethod("Moodle Course", "EdX");
        SynchronousMethod webinar = new SynchronousMethod("Weekly Webinar", 5000);

        System.out.println("--- 3. Delivery Methods ---");
        selfPaced.describeDelivery();
        webinar.describeDelivery();
        System.out.println("\n");
        
        // Polymorphism Demonstration
        System.out.println("--- Polymorphism (Content Array) ---");
        Content[] materials = {historyModule, marketData};
        for (Content c : materials) {
            c.displayContentDetails();
        }
    }
}