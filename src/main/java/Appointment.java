import org.example.PatientRegistrationSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Appointment {
    static Scanner input = new Scanner(System.in);
    // Creating a new instance of PatientRegistrationSystem
    static PatientRegistrationSystem pat = new PatientRegistrationSystem();
    // Sorting the users input
    static String Option = " ";

    static void PresentMenu() {
        //Print option for the user to select

        String optionMessage = "\nType C to Create new Appointments \n" + "Type R to read your Appointments \n" + "Type U to update your Appointments\n" + "Type E to Exit \n";
        System.out.println(optionMessage);

    }

}

