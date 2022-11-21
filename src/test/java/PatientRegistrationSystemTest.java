import static org.junit.jupiter.api.Assertions.*;

class PatientRegistrationSystemTest {

    @org.junit.jupiter.api.Test
    void printPatients() {
        String firstName = "Betelhem";
        String lastName = "Feyissa";
        String SSN = "1234";
        String address = "1234 Main St., Minneapolis, MN";
        String insuranceID = "3456789";


        Patient patient = new Patient(firstName, lastName, SSN, address, insuranceID);

        assertEquals("Betelhem", patient.firstName);
        assertEquals("Feyissa", patient.lastName);
        assertEquals("1234", patient.SSN);
        assertEquals("1234 Main St., Minneapolis, MN", patient.address);
        assertEquals("3456789", patient.insuranceID);
    }

    @org.junit.jupiter.api.Test
    void createPatients() {
        String firstName = "Betelhem";
        String lastName = "Feyissa";
        String SSN = "1234";
        String address = "1234 Main St., Minneapolis, MN";
        String insuranceID = "3456789";

        Patient patient = new Patient(firstName, lastName, SSN, address, insuranceID);

        assertEquals("Betelhem", patient.firstName);
        assertEquals("Feyissa", patient.lastName);
        assertEquals("1234", patient.SSN);
        assertEquals("1234 Main St., Minneapolis, MN", patient.address);
        assertEquals("3456789", patient.insuranceID);
    }

    @org.junit.jupiter.api.Test
    void updatePatient() {
    }

    @org.junit.jupiter.api.Test
    void deletePatient() {
    }
}