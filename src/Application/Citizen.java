package Application;
import Exception.NonEligibleException;

public class Citizen {
    private String name;
    private int id;
    private String country;
    private String sex;
    private String maritalStatus;
    private int annualIncome;
    private String economyStatus;
    private int age;

    Citizen(String name,int id,String country,String sex,String maritalStatus,int annualIncome,String economyStatus,int age) throws NonEligibleException{
        if (age < 18 && !country.equalsIgnoreCase("India")) {
            // Throws the custom exception with a message
            throw new NonEligibleException("Citizen is not eligible. Age is below 18 and the country is not 'India'.");
        }
        this.name = name;
        this.id = id;
        this.country = country;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.annualIncome = annualIncome;
        this.economyStatus = economyStatus;
        this.age = age;
    }


}
