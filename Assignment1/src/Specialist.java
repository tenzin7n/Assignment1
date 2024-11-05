public class Specialist extends HealthProfessional {
    private String field;

    // Default constructor
    public Specialist() {}

    // Parameterized constructor
    public Specialist(int id, String name, String department, String field) {
        super(id, name, department); // Initialize base class variables
        this.field = field;          // Initialize Specialist-specific variable
    }

    // Method to print health professional details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are (Specialist): ");
        super.printDetails();  // Call the method from the base class to print ID, name, department
        System.out.println("Field: " + field);  // Print field for specialist
    }
}