public class Patient {
    String firstName;

    String lastName;

    String SSN;

    String address;

    String insuranceID;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInsuranceID() {
        return insuranceID;
    }

    public Patient(String firstName, String lastName, String SSN, String address, String insuranceID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.address = address;
        this.insuranceID = insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public void print(){
        System.out.println("First Name: "+ this.firstName + "\nLast Name: "+ this.lastName + "\nAddress: "+ this.address +"\nSSN: "+ this.SSN +"\nInsuranceId: "+ this.insuranceID);
    }
}