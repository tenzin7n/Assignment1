// Assuming HealthProfessional class is defined as follows:
class HealthProfessional {
    protected int id;
    protected String name;
    protected String department;

    public HealthProfessional() {}

    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}

public class Appointment {
    private String patientName;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional healthProfessional;

    // Default constructor
    public Appointment() {}

    // Parameterized constructor
    public Appointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.healthProfessional = healthProfessional;
    }

    // Method to print appointment details
    public void printDetails() {
        System.out.println("Appointment Details:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.print("Health Professional: ");
        healthProfessional.printDetails();  // Prints details of the assigned health professional
    }

    // Getter for mobilePhone to allow appointment lookup by mobile number
    public String getMobilePhone() {
        return mobilePhone;
    }

    // Main method to test the Appointment class
    public static void main(String[] args) {
        // Create HealthProfessional instances
        HealthProfessional hp1 = new HealthProfessional(101, "Dr. Alice", "Pediatrics");
        HealthProfessional hp2 = new HealthProfessional(102, "Dr. Bob", "Cardiology");

        // Create Appointment instances with sample data
        Appointment appointment1 = new Appointment("John Doe", "123-456-7890", "10:00 AM - 10:30 AM", hp1);
        Appointment appointment2 = new Appointment("Jane Smith", "987-654-3210", "11:00 AM - 11:30 AM", hp2);

        // Print details for each appointment
        System.out.println("---- Appointment 1 ----");
        appointment1.printDetails();
        
        System.out.println("\n---- Appointment 2 ----");
        appointment2.printDetails();
    }
}
