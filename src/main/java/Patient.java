public class Patient {
    //Create class attributes
    String name;
    int insuranceId;
    String description;
    String address;
    String emergencyContactInfo;
    int ssn;


    //create a constructor
    public Patient(String name, int insuranceId, String description, String address, String emergencyContactInfo, int ssn) {
        this.name = name;
        this.insuranceId = insuranceId;
        this.description = description;
        this.address = address;
        this.emergencyContactInfo = emergencyContactInfo;
        this.ssn = ssn;

    }
}
