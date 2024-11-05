public class GeneralPractitioner extends HealthProfessional {
    private String specialty;

    // Default constructor
    public GeneralPractitioner() {}

    // Parameterized constructor
    public GeneralPractitioner(int id, String name, String department, String specialty) {
        super(id, name, department); // Initialize base class variables
        this.specialty = specialty;   // Initialize GeneralPractitioner-specific variable
    }

    // Method to print health professional details
    @Override
    public void printDetails() {
        System.out.println("The health professional details are (General Practitioner): ");
        super.printDetails();  // Call the method from the base class to print ID, name, department
        System.out.println("Specialty: " + specialty);  // Print specialty for general practitioner
    }
}