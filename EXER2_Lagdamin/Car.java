public class Car {
    private final String color;
    private final String plateNo;
    private final String chassisNo;
    private final String brand;
    private final String logo;
    private final String origin;
    private final String name;
    private final double price;

    // No-argument constructor
    public Car() {
        this.color = "No Color";
        this.plateNo = "No PlateNumber";
        this.chassisNo = "No Chassis No Yet!";
        this.brand = "Unknown";
        this.logo = "Unknown";
        this.origin = "Unknown";
        this.name = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Car(String color, String plateNo, String chassisNo,
               String brand, String logo, String origin, String name, double price) {
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.brand = brand;
        this.logo = logo;
        this.origin = origin;
        this.name = name;
        this.price = price;
    }

    // Method to display car information
    public void displayInfo() {
        String info = "";
        info += "Brand: " + this.brand;
        info += "\nModel: " + this.name;
        info += "\nColor: " + this.color;
        info += "\nPlateNo: " + this.plateNo;
        info += "\nChassisNo: " + this.chassisNo;
        info += "\nLogo: " + this.logo;
        info += "\nOrigin: " + this.origin;
        info += "\nPrice: " + this.price;

        System.out.println(info);
        System.out.println("-----------------------------");
    }
}

   