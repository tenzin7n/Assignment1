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
}
