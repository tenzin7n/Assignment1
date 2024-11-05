import java.util.ArrayList;

public class AssignmentOne {
    // Declare the ArrayList to store appointments
    private static ArrayList<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 - Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Smith", "Primary Care", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Brown", "Primary Care", "Internal Medicine");
        Specialist spec1 = new Specialist(4, "Dr. Green", "Cardiology", "Heart Specialist");

        // Example of creating and managing appointments
        createAppointment("Alice", "1234567890", "10:00", gp1);
        createAppointment("Bob", "0987654321", "11:00", gp2);
        printExistingAppointments();
    }

    public static void createAppointment(String patientName, String mobilePhone, String timeSlot, HealthProfessional hp) {
        Appointment app = new Appointment(patientName, mobilePhone, timeSlot, hp);
        appointments.add(app);
    }

    public static void printExistingAppointments() {
        for (Appointment app : appointments) {
            app.printDetails();
        }
    }
}
