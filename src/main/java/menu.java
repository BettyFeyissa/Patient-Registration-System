import java.util.Scanner;

public class menu {
    static Scanner input = new Scanner(System.in);
    // Creating a new instance of PatientRegistrationSystem
    static PatientRegistrationSystem patReg = new PatientRegistrationSystem();
    // Sorting the users input

    static String answer = " ";
    static void presentMenu() {

        //Print option for the user to select

        String optionMessage = "\nType C to Create new Patient \n" + "Type R to Read patient information \n" + "Type U to Update patient\n" + "Type D to Delete patient\n" + "Type E to Exit \n";
        System.out.println(optionMessage);
        answer = input.nextLine();
        System.out.println("The user selected " + answer);

        //check which option the patient selected
        if (answer.equalsIgnoreCase("C")){
            patReg.createPatients();
        }
        else if (answer.equalsIgnoreCase("R")) {
            // print the products
            patReg.printPatients();

        }
        else if (answer.equalsIgnoreCase("U")) {
            System.out.println("Should update ");
            patReg.updatePatient();

        }
        else if (answer.equalsIgnoreCase("D")) {
            System.out.println("Should delete "  );
            patReg.deletePatient();

        }
        else if (answer.equalsIgnoreCase("E")) {
            System.out.println("Goodbye! ");
            System.exit(0);
        } else
            System.out.println("\nPlease enter proper input! \n");
        presentMenu();
    }

    public static void main(String[] args) {

        // print a welcome menu for the user
        //step 1: define the message for the user
        String welcome = "Welcome to Patient Registration System\n";

        // step 2: print message for the user
        System.out.println(welcome);

        //step 3: create loop for the program menu
        while (answer.equalsIgnoreCase("Q") == false)
            presentMenu();
    }
}