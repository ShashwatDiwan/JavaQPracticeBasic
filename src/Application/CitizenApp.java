package Application;
import java.util.*;
import Exception.NonEligibleException;

public class CitizenApp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        try {
            // Input details from user
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter country: ");
            String country = sc.nextLine();

            System.out.print("Enter sex: ");
            String sex = sc.nextLine();

            System.out.print("Enter marital status: ");
            String maritalStatus = sc.next();

            System.out.print("Enter annual income: ");
            int annualIncome = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter economy status: ");
            String economyStatus = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            // Create Citizen object, might throw NonEligibleException
            Citizen citizen = new Citizen(name, id, country, sex, maritalStatus, annualIncome, economyStatus, age);

            // If no exception, display the citizen details
            System.out.println(citizen);

        } catch (NonEligibleException e) {
            // Handle the exception and display an appropriate message
            System.out.println("Error: " + e.getMessage());

        }
    }
}