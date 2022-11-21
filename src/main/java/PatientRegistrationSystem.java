import java.util.ArrayList;
import java.util.Scanner;

public class PatientRegistrationSystem{
    ArrayList<Patient> patients;
    Scanner scan = new Scanner(System.in);
    public PatientRegistrationSystem(){
        //initialization an empty array
        this.patients = new ArrayList<Patient>();
    }

    //instance method to print
    public void printPatients(){
        System.out.println("Here is the Patient information ");
        for(Patient patient : this.patients){
            patient.print();
        }
    }

    //instance method to create patients
    public void createPatients(){
        System.out.println("Please enter the first name of the patient");
        String firstName = scan.nextLine();
        System.out.println("Please enter the last name of the patient");
        String lastName = scan.nextLine();
        System.out.println("Please enter the SSN of the patient");
        String SSN = scan.nextLine();
        System.out.println("Please enter the address of the patient");
        String address = scan.nextLine();
        System.out.println("Please enter the insurance id of the patient");
        String insuranceId = scan.nextLine();

        //create a new instance of Patient class
        Patient patient = new Patient(firstName, lastName, SSN, address, insuranceId);

        //add the new patient to the arraylist
        this.patients.add(patient);

        //print the patients
        this.printPatients();
    }

    //instance method to update a patient
    public void updatePatient() {
        this.printPatients();
        System.out.println("Enter the first name of the patient you want to update");
        String firstName = scan.nextLine();

        //find the patient
        for (Patient patientToUpdate : this.patients) {
            if (patientToUpdate.firstName.equalsIgnoreCase(firstName)) {
                //update this patient
                System.out.println("Please enter the first name of the patient");
                patientToUpdate.firstName = scan.nextLine();
                System.out.println("Please enter the last name of the patient");
                patientToUpdate.lastName = scan.nextLine();
                System.out.println("Please enter the SSN of the patient");
                patientToUpdate.SSN = scan.nextLine();
                System.out.println("Please enter the address of the patient");
                patientToUpdate.address = scan.nextLine();
                System.out.println("Please enter the insurance id of the patient");
                patientToUpdate.insuranceID = scan.nextLine();
                break;
            }
        }
    }
    //instance method to delete patient
    public void deletePatient(){
        this.printPatients();
        System.out.println("what is the name of the patient you want to delete? ");
        String firstName = scan.nextLine();
        Patient patientToDelete;
        //step 1: find the item
        for (Patient p:this.patients) {
            if(p.firstName.equalsIgnoreCase(firstName)) {
                //delete this patient
                patientToDelete = p;
                this.patients.remove(patientToDelete);
                break;
            }
        }
    }
}