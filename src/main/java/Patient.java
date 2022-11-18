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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergencyContactInfo() {
        return emergencyContactInfo;
    }

    public void setEmergencyContactInfo(String emergencyContactInfo) {
        this.emergencyContactInfo = emergencyContactInfo;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

}
